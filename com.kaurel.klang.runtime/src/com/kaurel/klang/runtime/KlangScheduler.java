package com.kaurel.klang.runtime;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import klang.util.KlangThread;
import klang.util.ThreadStatus;

public class KlangScheduler implements Runnable {
	private List<Runnable> tickTasks = new ArrayList<>();
	private ConcurrentLinkedDeque<KlangThread> threads = new ConcurrentLinkedDeque<>();
	private int tickRate = 120;

	@Override
	public void run() {
		while (true) {
			long start = System.currentTimeMillis();
			for (Runnable task : tickTasks) {
				task.run();
			}
			tick();
			long stop = System.currentTimeMillis();
			try {
				Thread.sleep((1000 / tickRate) - (stop - start));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void tick() {
		if (threads.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Deque<KlangThread> currentThreads = threads;
		threads = new ConcurrentLinkedDeque<KlangThread>();

		for (KlangThread thread : currentThreads) {
			while (true) {
				ThreadStatus ts = thread.step();
				if (ts == ThreadStatus.YIELDING) {
					threads.addLast(thread);
					break;
				}
				if (ts == ThreadStatus.TERMINATED) {
					break;
				}

				if (ts == ThreadStatus.SLEEPING) {
					break;
				}
			}
		}
	}

	public synchronized void addThread(KlangThread thread) {
		threads.add(thread);
		notify();
	}

	public synchronized void addTickTask(Runnable task) {
		this.tickTasks.add(task);
	}

	public synchronized void flush() {
		threads.clear();
	}
}
