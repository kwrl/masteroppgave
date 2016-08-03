package demo;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.kaurel.klang.runtime.GameParser;
import com.kaurel.klang.runtime.KlangInterpreter;

import klang.GameStart;

public class Demo {
	private static KlangInterpreter interpreter;
	public static void main(String[] args) throws IOException {
		byte[] bytes = Files.readAllBytes(Paths.get("klangfiles/fibonacci.klang"));
		InputStream in = new ByteArrayInputStream(bytes);
		interpreter = new KlangInterpreter(GameParser.INSTANCE.parseGame(in));
		interpreter.getEntities().forEach(e -> e.setTarget(new Sprite()));
		
		interpreter.triggerEvent(GameStart.class);
		while(!interpreter.isIdle()) {
			interpreter.tick();
		}
	}
}
