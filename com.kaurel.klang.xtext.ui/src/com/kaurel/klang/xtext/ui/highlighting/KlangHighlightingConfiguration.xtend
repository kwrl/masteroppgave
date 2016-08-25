package com.kaurel.klang.xtext.ui.highlighting

import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class KlangHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String BOOLEAN_EXPRESSION_ID = "BOOLEAN_EXP";
	public static final String DOUBLE_EXPRESSION_ID = "DOUBLE_EXP";
	public static final String INTEGER_EXPRESSION_ID = "INTEGER_EXP";
	public static final String STRING_EXPRESSION_ID = "STRING_EXP";

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(BOOLEAN_EXPRESSION_ID, "Boolean", booleanTextStyle());
		acceptor.acceptDefaultHighlighting(DOUBLE_EXPRESSION_ID, "Double", doubleTextStyle());
		acceptor.acceptDefaultHighlighting(INTEGER_EXPRESSION_ID, "Integer", integerTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_EXPRESSION_ID, "String", stringTextStyle());
		super.configure(acceptor);
	}

	def booleanTextStyle() {
		var textStyle = new TextStyle();
		textStyle.color = new RGB(0, 0, 255);
		return textStyle;
	}

	def integerTextStyle() {
		var textStyle = new TextStyle();
		textStyle.color = new RGB(0, 255, 0);
		return textStyle;
	}

	def doubleTextStyle() {
		var textStyle = new TextStyle();
		textStyle.color = new RGB(255, 0, 0);
		return textStyle;
	}

	override def stringTextStyle() {
		var textStyle = new TextStyle();
		textStyle.color = new RGB(0, 255, 255);
		return textStyle;
	}

}
