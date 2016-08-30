package com.kaurel.klang.runtime;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.kaurel.klang.xtext.KlangStandaloneSetup;

import klang.KlangPackage;
import klang.Program;

public class ProgramParser {
	public static final ProgramParser INSTANCE = new ProgramParser();
	
	@Inject
	XtextResourceSet resourceSet;
	
	private ProgramParser() {
		KlangPackage.eINSTANCE.eClass();
		Injector injector = new KlangStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}
	
	public Program parseProgram(InputStream input) throws IOException{
		Resource resource = resourceSet.createResource(URI.createURI("dummy.klang"));
		resource.load(input, resourceSet.getLoadOptions());
		return (Program) resource.getContents().get(0);
	}
}
