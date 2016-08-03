package com.kaurel.klang.runtime.threading;

public class ThreadStatus {
	protected KlangThread thread;
	
	public ThreadStatus(KlangThread thread) {
		this.thread = thread;
	}
	
	public KlangThread getThread() {
		return thread;
	}
}
