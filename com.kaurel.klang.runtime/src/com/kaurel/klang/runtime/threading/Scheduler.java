package com.kaurel.klang.runtime.threading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

import com.kaurel.klang.runtime.KlangInterpreter;

public class Scheduler {
	private LinkedList<KThread> threads = new LinkedList<>();

	private Timer sleepTimer = new Timer(true);

	private KlangInterpreter interpreter;

	private SchedulerPass currentPass;
	private Queue<KThread> currentThreads;

	public Scheduler(KlangInterpreter interpreter) {
		this.interpreter = interpreter;
	}

	public boolean isIdle() {
		return threads.isEmpty() && (getCurrentPass() == null || getCurrentPass().isDone());
	}

	public SchedulerPass getCurrentPass() {
		if (currentPass == null || currentPass.isDone()) {
			currentPass = new SchedulerPass();
		}
		return currentPass;
	}

	public void addThread(KThread thread) {
		threads.addFirst(thread);
	}

	public void yield() {
		threads.add(currentThreads.poll());
	}

	public void terminate() {
		currentThreads.poll();
	}

	public void sleep(long duration) {
		KThread thread = currentThreads.poll();

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

		public KThread current() {
			return currentThreads.peek();
		}

	}
}