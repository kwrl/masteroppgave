package demo;

import java.io.IOException;

import com.kaurel.klang.runtime.KlangInterpreter;
import com.kaurel.klang.runtime.ProgramParser;

import klang.KlangFactory;
import klang.Program;
import klang.entities.SceneEntity;

public class Demo {
	private static String programName = "fibonacci.klang";
	public static void main(String[] args) throws IOException {
		Program program = ProgramParser.INSTANCE.parseProgram(Demo.class.getResource(programName).openStream());
		KlangInterpreter interpreter = new KlangInterpreter(program.getSceneActor());

		
		//Set the entity that the Scene acts upon. Dummy instantiation.
		program.getSceneActor().setSubject(new SceneEntity() {
			@Override
			public void print(String msg) {
				System.out.println(msg);
			}

			@Override
			public Double mouseX() {
				return 0.0;
			}

			@Override
			public Double mouseY() {
				return 0.0;
			}
			
		});
		
		interpreter.getEventRegistry().fireEvent(KlangFactory.eINSTANCE.createGameStartEvent());
		long start = System.currentTimeMillis();
		while(!interpreter.isIdle()) {
			interpreter.tick();
		}
		System.out.println("Time spent:\t"+(System.currentTimeMillis()-start));
	}
}
