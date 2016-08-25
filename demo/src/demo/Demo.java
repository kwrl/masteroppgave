package demo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.kaurel.klang.runtime.KlangInterpreter;
import com.kaurel.klang.runtime.ProgramParser;

import klang.GameStart;
import klang.SceneActor;

public class Demo {
	private static KlangInterpreter interpreter;
	
	public static void main(String[] args) throws IOException {
		byte[] bytes = Files.readAllBytes(Paths.get("klangfiles/fibonacci.klang"));
		InputStream in = new ByteArrayInputStream(bytes);
		SceneActor program = ProgramParser.INSTANCE.parseProgram(in);
		interpreter = new KlangInterpreter(program);
		program.getSubtree().forEach(a -> a.setSubject(new Sprite()));
		
		interpreter.triggerEvent(GameStart.class);
		while(!interpreter.isIdle()) {
			interpreter.tick();
		}
	}
}
