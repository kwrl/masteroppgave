/*
 * generated by Xtext 2.10.0
 */
package com.kaurel.klang.xtext.parser.antlr;

import com.google.inject.Inject;
import com.kaurel.klang.xtext.parser.antlr.internal.InternalKlangParser;
import com.kaurel.klang.xtext.services.KlangGrammarAccess;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class KlangParser extends AbstractAntlrParser {

	@Inject
	private KlangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new KlangTokenSource(super.createLexer(stream));
	}
	
	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected InternalKlangParser createParser(XtextTokenStream stream) {
		return new InternalKlangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public KlangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KlangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
