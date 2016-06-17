package com.kaurel.klang.runtime;

import java.io.Reader;

import org.eclipse.xtext.parser.IParser;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.kaurel.klang.xtext.KlangStandaloneSetup;

import klang.Game;
import klang.KlangPackage;

public class KlangParser {
	public static final KlangParser INSTANCE = new KlangParser();
	
	@Inject
	private IParser parser;
	
	private KlangParser() {
		KlangPackage.eINSTANCE.eClass();
		Injector injector = new KlangStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
	}
	
	public Game parseGame(Reader reader) {
		return (Game) parser.parse(reader).getRootASTElement();
	}
}
