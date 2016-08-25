package com.kaurel.klang.xtext.ui.highlighting

import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator

class KlangSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator{
	
	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		if(resource == null) return;
		var switcher = new KlangHighlighingSwitch(acceptor);
	
		var root = resource.parseResult.rootNode	
		
		var iter = EcoreUtil.getAllContents(resource, true)	;
		while(iter.hasNext()) {
			var current = iter.next;
			switcher.doSwitch(current);
		}
		
		super.doProvideHighlightingFor(resource, acceptor, cancelIndicator);
	}
	
}