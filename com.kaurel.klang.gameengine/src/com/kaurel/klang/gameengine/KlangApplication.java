package com.kaurel.klang.gameengine;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.kaurel.gameengine.GameApplication;
import com.kaurel.klang.runtime.ProgramParser;
import com.kaurel.klang.runtime.KlangInterpreter;

public class KlangApplication extends GameApplication {
	private KlangInterpreter interpreter;
	
	public KlangApplication() throws IOException {
		byte[] bytes = Files.readAllBytes(Paths.get("klangfiles/fibonacci.klang"));
		InputStream in = new ByteArrayInputStream(bytes);
		interpreter = new KlangInterpreter(ProgramParser.INSTANCE.parseProgram(in));	
	}
	
}
