/*
 * generated by Xtext 2.10.0
 */
package com.kaurel.klang.xtext.ui.tests;

import com.google.inject.Injector;
import com.kaurel.klang.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class KlangUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("com.kaurel.klang.xtext.Klang");
	}

}
