package com.kaurel.klang.xtext.ui.highlighting;

import com.google.common.base.Objects;
import com.kaurel.klang.xtext.ui.highlighting.KlangHighlighingSwitch;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class KlangSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  @Override
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _equals = Objects.equal(resource, null);
    if (_equals) {
      return;
    }
    KlangHighlighingSwitch switcher = new KlangHighlighingSwitch(acceptor);
    IParseResult _parseResult = resource.getParseResult();
    ICompositeNode root = _parseResult.getRootNode();
    TreeIterator<EObject> iter = EcoreUtil.<EObject>getAllContents(resource, true);
    while (iter.hasNext()) {
      {
        EObject current = iter.next();
        switcher.doSwitch(current);
      }
    }
    super.doProvideHighlightingFor(resource, acceptor, cancelIndicator);
  }
}
