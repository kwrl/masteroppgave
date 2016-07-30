package com.kaurel.klang.runtime;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedDeque;

import klang.util.threading.KlangThread;
import klang.util.threading.SleepStatus;
import klang.util.threading.TerminateStatus;
import klang.util.threading.ThreadStatus;
import klang.util.threading.YieldStatus;

public class KlangScheduler {
	private ConcurrentLinkedDeque<KlangThread> threads = new ConcurrentLinkedDeque<>();

	private Timer sleepTimer = new Timer(true);
	
	public void tick() {
		if (threads.isEmpty()) {
			return;
		}

		Deque<KlangThread> currentThreads = new LinkedList<>(threads);
		threads.clear();

		for (KlangThread thread : currentThreads) {
			ThreadStatus ts;
			ts = thread.run();

			if (ts instanceof YieldStatus) {
				threads.addLast(thread);
				continue;
			} else if (ts instanceof TerminateStatus) {
				continue;
			} else if (ts instanceof SleepStatus) {
				SleepStatus sleep = (SleepStatus) ts;
				threads.remove(thread);
				sleepTimer.schedule(new TimerTask() {
					@Override
					public void run() {
						threads.add(thread);
					}
				}, sleep.getSleepDuration());
				continue;
			}
		}
	}

	public synchronized void addThread(KlangThread thread) {
		threads.addFirst(thread);
	}

	public void flush() {
		threads.clear();
	}
}
