package com.kaurel.klang.xtext.ui.highlighting

import klang.BooleanLiteral
import klang.DoubleLiteral
import klang.IntegerLiteral
import klang.KlangPackage
import klang.StringLiteral
import klang.VariableAssignment
import klang.VariableDeclaration
import klang.util.KlangSwitch
import klang.util.TypeComputer
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class KlangHighlighingSwitch extends KlangSwitch<Void> {
	private final IHighlightedPositionAcceptor acceptor;
	private final TypeComputer typeComputer = new TypeComputer();

	new(IHighlightedPositionAcceptor acceptor) {
		this.acceptor = acceptor;
	}

	private def highlightNode(INode node, String id) {
		if (node == null)
			return;
		if (node instanceof ILeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (ILeafNode leaf : node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}
	
	override caseBooleanLiteral(BooleanLiteral object) {
		var node = getFirstFeatureNode(object, KlangPackage.eINSTANCE.booleanLiteral_Value)
		highlightByType(node, Boolean)
		return null
	}
	
	override caseIntegerLiteral(IntegerLiteral object) {
		var node = getFirstFeatureNode(object, KlangPackage.eINSTANCE.booleanLiteral_Value)
		highlightByType(node, Integer)
		return null
	}
	
	override caseDoubleLiteral(DoubleLiteral object) {
		var node = getFirstFeatureNode(object, KlangPackage.eINSTANCE.booleanLiteral_Value)
		highlightByType(node, Double)
		return null
	}
	
	override caseStringLiteral(StringLiteral object) {
		var node = getFirstFeatureNode(object, KlangPackage.eINSTANCE.stringLiteral_Value)
		highlightByType(node, String)
		return null
	}

	override caseVariableDeclaration(VariableDeclaration object) {
		var name = getFirstFeatureNode(object, KlangPackage.eINSTANCE.variableDeclaration_Name)
		var expression = getFirstFeatureNode(object, KlangPackage.eINSTANCE.variableDeclaration_Expression)
		var type = typeComputer.computeType(object.expression)
		highlightByType(name, type)	
		highlightByType(expression, type)	
		
		return null
	}
	
	override caseVariableAssignment(VariableAssignment object) {
		var variableName = getFirstFeatureNode(object, KlangPackage.eINSTANCE.variableAssignment_VariableName)
		//highlightByType(variableName, typeComputer.computeType(object.actor.(variableName).expression))
		var variableExpression = getFirstFeatureNode(object, KlangPackage.eINSTANCE.variableAssignment_Expression)
		highlightByType(variableExpression, typeComputer.computeType(object.expression))
		return null
	}
	
	def highlightByType(INode node, Class type) {
		if (type == Boolean) {
			highlightNode(node, KlangHighlightingConfiguration.BOOLEAN_EXPRESSION_ID)
		} else if (type == Integer) {
			highlightNode(node, KlangHighlightingConfiguration.INTEGER_EXPRESSION_ID)
		} else if (type == Double) {
			highlightNode(node, KlangHighlightingConfiguration.DOUBLE_EXPRESSION_ID)
		} else if (type == String) {
			highlightNode(node, KlangHighlightingConfiguration.BOOLEAN_EXPRESSION_ID)
		}
	}

	def getFirstFeatureNode(EObject semantic, EStructuralFeature feature) {
		if (feature == null)
			return NodeModelUtils.findActualNodeFor(semantic)
		var nodes = NodeModelUtils.findNodesForFeature(semantic, feature)
		if (!nodes.isEmpty())
			return nodes.get(0)
		return null
	}

}
