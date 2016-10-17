package com.kaurel.klang.runtime.threading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {
	private LinkedList<KlangThread> threads = new LinkedList<>();

	private Timer sleepTimer = new Timer(true);
	private SchedulerPass currentPass;
	private Queue<KlangThread> currentThreads;

	public boolean isIdle() {
		return threads.isEmpty() && (getCurrentPass() == null || getCurrentPass().isDone());
	}

	public SchedulerPass getCurrentPass() {
		if (currentPass == null || currentPass.isDone()) {
			currentPass = new SchedulerPass();
		}
		return currentPass;
	}

	public void addThread(KlangThread thread) {
		threads.addFirst(thread);
	}

	public void yieldCurrentThread() {
		threads.add(currentThreads.poll());
	}

	public void terminateCurrentThread() {
		currentThreads.poll();
	}

	public void sleepCurrentThread(long duration) {
		KlangThread thread = currentThreads.poll();

		sleepTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				threads.add(thread);
			}

		}, duration);
	}

	public class SchedulerPass {
		public SchedulerPass() {
			currentThreads = new LinkedList<>(threads);
			threads.clear();
		}

		public boolean isDone() {
			return current() == null;
		}

		public KlangThread current() {
			return currentThreads.peek();
		}

	}
}