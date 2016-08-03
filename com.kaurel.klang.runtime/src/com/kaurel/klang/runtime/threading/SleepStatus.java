package com.kaurel.klang.runtime.threading;

public class SleepStatus extends ThreadStatus {
	protected long sleepDuration;

	public SleepStatus(KlangThread thread, long sleepDuration) {
		super(thread);
		this.sleepDuration = sleepDuration;
	}

	public long getSleepDuration() {
		return sleepDuration;
	}

}
