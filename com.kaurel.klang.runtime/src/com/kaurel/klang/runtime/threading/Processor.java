package com.kaurel.klang.runtime.threading;

import klang.AbstractActor;

public interface Processor {
	//Process all active threads once.
	public void processSchedulerPass();
	
	//Process the one of the active threads once.
	public void processSingleThread();

	//Initialize actor's variables
	public void initializeVariables(AbstractActor actor);
	
	//Initialize actor's and its childrens' variables
	public void initializeAllVariables(AbstractActor rootActor);
}
