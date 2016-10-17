package com.kaurel.klang.xtext.ui.highlighting;

import com.google.common.base.Objects;
import com.kaurel.klang.xtext.ui.highlighting.KlangHighlightingConfiguration;
import java.util.List;
import klang.util.TypeComputer;
import klangexpr.BooleanLiteral;
import klangexpr.DoubleLiteral;
import klangexpr.Expression;
import klangexpr.IntegerLiteral;
import klangexpr.KlangexprPackage;
import klangexpr.StringLiteral;
import klangexpr.VariableAssignment;
import klangexpr.util.KlangexprSwitch;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

@SuppressWarnings("all")
public class KlangHighlighingSwitch extends KlangexprSwitch<Void> {
  private final IHighlightedPositionAcceptor acceptor;
  
  private final TypeComputer typeComputer = new TypeComputer();
  
  public KlangHighlighingSwitch(final IHighlightedPositionAcceptor acceptor) {
    this.acceptor = acceptor;
  }
  
  private void highlightNode(final INode node, final String id) {
    boolean _equals = Objects.equal(node, null);
    if (_equals) {
      return;
    }
    if ((node instanceof ILeafNode)) {
      int _offset = ((ILeafNode)node).getOffset();
      int _length = ((ILeafNode)node).getLength();
      this.acceptor.addPosition(_offset, _length, id);
    } else {
      Iterable<ILeafNode> _leafNodes = node.getLeafNodes();
      for (final ILeafNode leaf : _leafNodes) {
        boolean _isHidden = leaf.isHidden();
        boolean _not = (!_isHidden);
        if (_not) {
          int _offset_1 = leaf.getOffset();
          int _length_1 = leaf.getLength();
          this.acceptor.addPosition(_offset_1, _length_1, id);
        }
      }
    }
  }
  
  @Override
  public Void caseBooleanLiteral(final BooleanLiteral object) {
    EAttribute _booleanLiteral_Value = KlangexprPackage.eINSTANCE.getBooleanLiteral_Value();
    INode node = this.getFirstFeatureNode(object, _booleanLiteral_Value);
    this.highlightByType(node, Boolean.class);
    return null;
  }
  
  @Override
  public Void caseIntegerLiteral(final IntegerLiteral object) {
    EAttribute _booleanLiteral_Value = KlangexprPackage.eINSTANCE.getBooleanLiteral_Value();
    INode node = this.getFirstFeatureNode(object, _booleanLiteral_Value);
    this.highlightByType(node, Integer.class);
    return null;
  }
  
  @Override
  public Void caseDoubleLiteral(final DoubleLiteral object) {
    EAttribute _booleanLiteral_Value = KlangexprPackage.eINSTANCE.getBooleanLiteral_Value();
    INode node = this.getFirstFeatureNode(object, _booleanLiteral_Value);
    this.highlightByType(node, Double.class);
    return null;
  }
  
  @Override
  public Void caseStringLiteral(final StringLiteral object) {
    EAttribute _stringLiteral_Value = KlangexprPackage.eINSTANCE.getStringLiteral_Value();
    INode node = this.getFirstFeatureNode(object, _stringLiteral_Value);
    this.highlightByType(node, String.class);
    return null;
  }
  
  @Override
  public Void caseVariableAssignment(final VariableAssignment object) {
    EAttribute _variableAssignment_VariableName = KlangexprPackage.eINSTANCE.getVariableAssignment_VariableName();
    INode variableName = this.getFirstFeatureNode(object, _variableAssignment_VariableName);
    EReference _variableAssignment_Expression = KlangexprPackage.eINSTANCE.getVariableAssignment_Expression();
    INode variableExpression = this.getFirstFeatureNode(object, _variableAssignment_Expression);
    Expression _expression = object.getExpression();
    Class<?> _computeType = this.typeComputer.computeType(_expression);
    this.highlightByType(variableExpression, _computeType);
    return null;
  }
  
  public void highlightByType(final INode node, final Class<?> type) {
    boolean _equals = Objects.equal(type, Boolean.class);
    if (_equals) {
      this.highlightNode(node, KlangHighlightingConfiguration.BOOLEAN_EXPRESSION_ID);
    } else {
      boolean _equals_1 = Objects.equal(type, Integer.class);
      if (_equals_1) {
        this.highlightNode(node, KlangHighlightingConfiguration.INTEGER_EXPRESSION_ID);
      } else {
        boolean _equals_2 = Objects.equal(type, Double.class);
        if (_equals_2) {
          this.highlightNode(node, KlangHighlightingConfiguration.DOUBLE_EXPRESSION_ID);
        } else {
          boolean _equals_3 = Objects.equal(type, String.class);
          if (_equals_3) {
            this.highlightNode(node, KlangHighlightingConfiguration.BOOLEAN_EXPRESSION_ID);
          }
        }
      }
    }
  }
  
  public INode getFirstFeatureNode(final EObject semantic, final EStructuralFeature feature) {
    boolean _equals = Objects.equal(feature, null);
    if (_equals) {
      return NodeModelUtils.findActualNodeFor(semantic);
    }
    List<INode> nodes = NodeModelUtils.findNodesForFeature(semantic, feature);
    boolean _isEmpty = nodes.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      return nodes.get(0);
    }
    return null;
  }
}
