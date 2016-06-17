package klang.util;

import org.eclipse.emf.ecore.EObject;

import klang.Actor;
import klang.Game;
import klang.Variable;

public class KlangUtil {
	public static Game getGame(EObject object) {
		EObject current = object;
		while (current != null) {
			current = current.eContainer();
			if (current instanceof Game) {
				return (Game) current;
			}
		}
		return null;
	}

	public static Actor getActor(EObject object) {
		EObject current = object;
		while (current != null) {
			current = current.eContainer();
			if (current instanceof Actor) {
				return (Actor) current;
			}
		}
		return null;
	}

	public static long variableDeclarationCount(Game game, String variableName) {
		return game.getVariableDeclarations().stream().filter(decl -> decl.getName().equals(variableName)).count();
	}

	public static boolean hasVariableDeclaration(Game game, String variableName) {
		return variableDeclarationCount(game, variableName) > 0;
	}

	public static boolean hasVariableDeclaration(Actor actor, String variableName) {
		return actor.getVariableDeclarations().stream().filter(decl -> decl.getName().equals(variableName)).count() > 0;
	}

	public static Variable getVariable(EObject object, String variableName) {
		Actor actor = getActor(object);

		if (actor != null) {
			for (Variable var : actor.getVariableDeclarations()) {
				if (var.getName().equals(variableName)) {
					return var;
				}
			}
		}

		Game game = getGame(object);
		if (game != null) {
			for (Variable var : game.getVariableDeclarations()) {
				if (var.getName().equals(variableName)) {
					return var;
				}
			}
		}

		return null;
	}
}
