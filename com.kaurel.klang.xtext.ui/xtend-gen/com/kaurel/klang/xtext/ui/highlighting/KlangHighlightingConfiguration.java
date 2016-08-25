package com.kaurel.klang.xtext.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class KlangHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public final static String BOOLEAN_EXPRESSION_ID = "BOOLEAN_EXP";
  
  public final static String DOUBLE_EXPRESSION_ID = "DOUBLE_EXP";
  
  public final static String INTEGER_EXPRESSION_ID = "INTEGER_EXP";
  
  public final static String STRING_EXPRESSION_ID = "STRING_EXP";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    TextStyle _booleanTextStyle = this.booleanTextStyle();
    acceptor.acceptDefaultHighlighting(KlangHighlightingConfiguration.BOOLEAN_EXPRESSION_ID, "Boolean", _booleanTextStyle);
    TextStyle _doubleTextStyle = this.doubleTextStyle();
    acceptor.acceptDefaultHighlighting(KlangHighlightingConfiguration.DOUBLE_EXPRESSION_ID, "Double", _doubleTextStyle);
    TextStyle _integerTextStyle = this.integerTextStyle();
    acceptor.acceptDefaultHighlighting(KlangHighlightingConfiguration.INTEGER_EXPRESSION_ID, "Integer", _integerTextStyle);
    TextStyle _stringTextStyle = this.stringTextStyle();
    acceptor.acceptDefaultHighlighting(KlangHighlightingConfiguration.STRING_EXPRESSION_ID, "String", _stringTextStyle);
    super.configure(acceptor);
  }
  
  public TextStyle booleanTextStyle() {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(0, 0, 255);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle integerTextStyle() {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(0, 255, 0);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle doubleTextStyle() {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(255, 0, 0);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  @Override
  public TextStyle stringTextStyle() {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(0, 255, 255);
    textStyle.setColor(_rGB);
    return textStyle;
  }
}
