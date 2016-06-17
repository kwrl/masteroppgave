/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
parser grammar InternalKlangParser;

options {
	tokenVocab=InternalKlangLexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package com.kaurel.klang.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.kaurel.klang.xtext.services.KlangGrammarAccess;

}

@members {

 	private KlangGrammarAccess grammarAccess;

    public InternalKlangParser(TokenStream input, KlangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Game";
   	}

   	@Override
   	protected KlangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGame
entryRuleGame returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGameRule()); }
	iv_ruleGame=ruleGame
	{ $current=$iv_ruleGame.current; }
	EOF;

// Rule Game
ruleGame returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGameAccess().getGameAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getVariableDeclarationsVariableParserRuleCall_1_0());
				}
				lv_variableDeclarations_1_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					add(
						$current,
						"variableDeclarations",
						lv_variableDeclarations_1_0,
						"com.kaurel.klang.xtext.Klang.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getActorDefsActorParserRuleCall_2_0());
				}
				lv_actorDefs_2_0=ruleActor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					add(
						$current,
						"actorDefs",
						lv_actorDefs_2_0,
						"com.kaurel.klang.xtext.Klang.Actor");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleActor
entryRuleActor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActorRule()); }
	iv_ruleActor=ruleActor
	{ $current=$iv_ruleActor.current; }
	EOF;

// Rule Actor
ruleActor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActorAccess().getActorAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getActorAccess().getEntityEntityParserRuleCall_1_0());
				}
				lv_entity_1_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActorRule());
					}
					set(
						$current,
						"entity",
						lv_entity_1_0,
						"com.kaurel.klang.xtext.Klang.Entity");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_BEGIN_2=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_2, grammarAccess.getActorAccess().getBEGINTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActorAccess().getVariableDeclarationsVariableParserRuleCall_3_0());
				}
				lv_variableDeclarations_3_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActorRule());
					}
					add(
						$current,
						"variableDeclarations",
						lv_variableDeclarations_3_0,
						"com.kaurel.klang.xtext.Klang.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getActorAccess().getEventHandlersEventHandlerParserRuleCall_4_0());
				}
				lv_eventHandlers_4_0=ruleEventHandler
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActorRule());
					}
					add(
						$current,
						"eventHandlers",
						lv_eventHandlers_4_0,
						"com.kaurel.klang.xtext.Klang.EventHandler");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_END_5=RULE_END
		{
			newLeafNode(this_END_5, grammarAccess.getActorAccess().getENDTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0=Sprite
			{
				newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getSpriteKeyword_0_0());
			}
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEntityAccess().getSpriteEntityAction_0_1(),
						$current);
				}
			)
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		(
			otherlv_3=Scene
			{
				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSceneKeyword_1_0());
			}
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getEntityAccess().getSceneEntityAction_1_1(),
						$current);
				}
			)
		)
	)
;

// Entry rule entryRuleEventHandler
entryRuleEventHandler returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventHandlerRule()); }
	iv_ruleEventHandler=ruleEventHandler
	{ $current=$iv_ruleEventHandler.current; }
	EOF;

// Rule EventHandler
ruleEventHandler returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=When
		{
			newLeafNode(otherlv_0, grammarAccess.getEventHandlerAccess().getWhenKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEventHandlerAccess().getEventTypeEventTypeEnumRuleCall_1_0());
				}
				lv_eventType_1_0=ruleEventType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEventHandlerRule());
					}
					set(
						$current,
						"eventType",
						lv_eventType_1_0,
						"com.kaurel.klang.xtext.Klang.EventType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_BEGIN_2=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_2, grammarAccess.getEventHandlerAccess().getBEGINTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEventHandlerAccess().getStatementsStatementParserRuleCall_3_0());
				}
				lv_statements_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEventHandlerRule());
					}
					add(
						$current,
						"statements",
						lv_statements_3_0,
						"com.kaurel.klang.xtext.Klang.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_END_4=RULE_END
		{
			newLeafNode(this_END_4, grammarAccess.getEventHandlerAccess().getENDTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleWhileLoop
entryRuleWhileLoop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileLoopRule()); }
	iv_ruleWhileLoop=ruleWhileLoop
	{ $current=$iv_ruleWhileLoop.current; }
	EOF;

// Rule WhileLoop
ruleWhileLoop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getWhileLoopAccess().getWhileLoopAction_0(),
					$current);
			}
		)
		otherlv_1=While
		{
			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getWhileKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileLoopAccess().getPredicateExpressionParserRuleCall_2_0());
				}
				lv_predicate_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileLoopRule());
					}
					set(
						$current,
						"predicate",
						lv_predicate_2_0,
						"com.kaurel.klang.xtext.Klang.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_BEGIN_3=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_3, grammarAccess.getWhileLoopAccess().getBEGINTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileLoopAccess().getLoopBlockStatementParserRuleCall_4_0());
				}
				lv_loopBlock_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileLoopRule());
					}
					add(
						$current,
						"loopBlock",
						lv_loopBlock_4_0,
						"com.kaurel.klang.xtext.Klang.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_END_5=RULE_END
		{
			newLeafNode(this_END_5, grammarAccess.getWhileLoopAccess().getENDTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleIf
entryRuleIf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfRule()); }
	iv_ruleIf=ruleIf
	{ $current=$iv_ruleIf.current; }
	EOF;

// Rule If
ruleIf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIfAccess().getIfAction_0(),
					$current);
			}
		)
		otherlv_1=If
		{
			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getPredicateExpressionParserRuleCall_2_0());
				}
				lv_predicate_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"predicate",
						lv_predicate_2_0,
						"com.kaurel.klang.xtext.Klang.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_BEGIN_3=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_3, grammarAccess.getIfAccess().getBEGINTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getIfBlockStatementParserRuleCall_4_0());
				}
				lv_ifBlock_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					add(
						$current,
						"ifBlock",
						lv_ifBlock_4_0,
						"com.kaurel.klang.xtext.Klang.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_END_5=RULE_END
		{
			newLeafNode(this_END_5, grammarAccess.getIfAccess().getENDTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleForeverLoop
entryRuleForeverLoop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForeverLoopRule()); }
	iv_ruleForeverLoop=ruleForeverLoop
	{ $current=$iv_ruleForeverLoop.current; }
	EOF;

// Rule ForeverLoop
ruleForeverLoop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getForeverLoopAccess().getForeverLoopAction_0(),
					$current);
			}
		)
		otherlv_1=Forever
		{
			newLeafNode(otherlv_1, grammarAccess.getForeverLoopAccess().getForeverKeyword_1());
		}
		this_BEGIN_2=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_2, grammarAccess.getForeverLoopAccess().getBEGINTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeverLoopAccess().getLoopStatementsStatementParserRuleCall_3_0());
				}
				lv_loopStatements_3_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeverLoopRule());
					}
					add(
						$current,
						"loopStatements",
						lv_loopStatements_3_0,
						"com.kaurel.klang.xtext.Klang.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_END_4=RULE_END
		{
			newLeafNode(this_END_4, grammarAccess.getForeverLoopAccess().getENDTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getControlStatementParserRuleCall_0());
		}
		this_ControlStatement_0=ruleControlStatement
		{
			$current = $this_ControlStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getVariableParserRuleCall_1());
		}
		this_Variable_1=ruleVariable
		{
			$current = $this_Variable_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getVariableAssignmentParserRuleCall_2());
		}
		this_VariableAssignment_2=ruleVariableAssignment
		{
			$current = $this_VariableAssignment_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleControlStatement
entryRuleControlStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getControlStatementRule()); }
	iv_ruleControlStatement=ruleControlStatement
	{ $current=$iv_ruleControlStatement.current; }
	EOF;

// Rule ControlStatement
ruleControlStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getControlStatementAccess().getForeverLoopParserRuleCall_0());
		}
		this_ForeverLoop_0=ruleForeverLoop
		{
			$current = $this_ForeverLoop_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getControlStatementAccess().getWhileLoopParserRuleCall_1());
		}
		this_WhileLoop_1=ruleWhileLoop
		{
			$current = $this_WhileLoop_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getControlStatementAccess().getYieldParserRuleCall_2());
		}
		this_Yield_2=ruleYield
		{
			$current = $this_Yield_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getControlStatementAccess().getIfParserRuleCall_3());
		}
		this_If_3=ruleIf
		{
			$current = $this_If_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleYield
entryRuleYield returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getYieldRule()); }
	iv_ruleYield=ruleYield
	{ $current=$iv_ruleYield.current; }
	EOF;

// Rule Yield
ruleYield returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getYieldAccess().getYieldAction_0(),
					$current);
			}
		)
		otherlv_1=Yield
		{
			newLeafNode(otherlv_1, grammarAccess.getYieldAccess().getYieldKeyword_1());
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=Var
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=EqualsSign
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0());
				}
				lv_expression_3_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"expression",
						lv_expression_3_0,
						"com.kaurel.klang.xtext.Klang.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleVariableAssignment
entryRuleVariableAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableAssignmentRule()); }
	iv_ruleVariableAssignment=ruleVariableAssignment
	{ $current=$iv_ruleVariableAssignment.current; }
	EOF;

// Rule VariableAssignment
ruleVariableAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_variableName_0_0=RULE_ID
				{
					newLeafNode(lv_variableName_0_0, grammarAccess.getVariableAssignmentAccess().getVariableNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"variableName",
						lv_variableName_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=EqualsSign
		{
			newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0());
				}
				lv_expression_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
					}
					set(
						$current,
						"expression",
						lv_expression_2_0,
						"com.kaurel.klang.xtext.Klang.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
	}
	this_Or_0=ruleOr
	{
		$current = $this_Or_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOr
entryRuleOr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrRule()); }
	iv_ruleOr=ruleOr
	{ $current=$iv_ruleOr.current; }
	EOF;

// Rule Or
ruleOr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
		}
		this_And_0=ruleAnd
		{
			$current = $this_And_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2=Or
			{
				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAnd
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.kaurel.klang.xtext.Klang.And");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	iv_ruleAnd=ruleAnd
	{ $current=$iv_ruleAnd.current; }
	EOF;

// Rule And
ruleAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndAccess().getComparisonParserRuleCall_0());
		}
		this_Comparison_0=ruleComparison
		{
			$current = $this_Comparison_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2=And
			{
				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAccess().getRightComparisonParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleComparison
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.kaurel.klang.xtext.Klang.Comparison");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePlus
entryRulePlus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusRule()); }
	iv_rulePlus=rulePlus
	{ $current=$iv_rulePlus.current; }
	EOF;

// Rule Plus
rulePlus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusAccess().getMinusParserRuleCall_0());
		}
		this_Minus_0=ruleMinus
		{
			$current = $this_Minus_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPlusAccess().getPlusLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2=PlusSign
			{
				newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusAccess().getRightMinusParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMinus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.kaurel.klang.xtext.Klang.Minus");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMinus
entryRuleMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMinusRule()); }
	iv_ruleMinus=ruleMinus
	{ $current=$iv_ruleMinus.current; }
	EOF;

// Rule Minus
ruleMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMinusAccess().getMultiplyParserRuleCall_0());
		}
		this_Multiply_0=ruleMultiply
		{
			$current = $this_Multiply_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMinusAccess().getMinusLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2=HyphenMinus
			{
				newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMinusAccess().getRightMultiplyParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiply
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMinusRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.kaurel.klang.xtext.Klang.Multiply");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiply
entryRuleMultiply returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplyRule()); }
	iv_ruleMultiply=ruleMultiply
	{ $current=$iv_ruleMultiply.current; }
	EOF;

// Rule Multiply
ruleMultiply returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplyAccess().getDivideParserRuleCall_0());
		}
		this_Divide_0=ruleDivide
		{
			$current = $this_Divide_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplyAccess().getMultiplyLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2=Asterisk
			{
				newLeafNode(otherlv_2, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplyAccess().getRightDivideParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleDivide
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplyRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.kaurel.klang.xtext.Klang.Divide");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleDivide
entryRuleDivide returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDivideRule()); }
	iv_ruleDivide=ruleDivide
	{ $current=$iv_ruleDivide.current; }
	EOF;

// Rule Divide
ruleDivide returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDivideAccess().getPrimaryExpressionParserRuleCall_0());
		}
		this_PrimaryExpression_0=rulePrimaryExpression
		{
			$current = $this_PrimaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getDivideAccess().getDivideLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2=Solidus
			{
				newLeafNode(otherlv_2, grammarAccess.getDivideAccess().getSolidusKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDivideAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDivideRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	iv_ruleComparison=ruleComparison
	{ $current=$iv_ruleComparison.current; }
	EOF;

// Rule Comparison
ruleComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComparisonAccess().getPlusParserRuleCall_0());
		}
		this_Plus_0=rulePlus
		{
			$current = $this_Plus_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1=LessThanSign
					{
						newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getComparisonAccess().getLessThanLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3=EqualsSign
					{
						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getComparisonAccess().getEqualLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_5=GreaterThanSign
					{
						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_2_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getComparisonAccess().getGreaterThanLeftAction_1_0_2_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusParserRuleCall_1_1_0());
					}
					lv_right_7_0=rulePlus
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getComparisonRule());
						}
						set(
							$current,
							"right",
							lv_right_7_0,
							"com.kaurel.klang.xtext.Klang.Plus");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	iv_rulePrimaryExpression=rulePrimaryExpression
	{ $current=$iv_rulePrimaryExpression.current; }
	EOF;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0=LeftParenthesis
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=RightParenthesis
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0(),
						$current);
				}
			)
			otherlv_4=Not
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionPrimaryExpressionParserRuleCall_1_2_0());
					}
					lv_expression_5_0=rulePrimaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
						}
						set(
							$current,
							"expression",
							lv_expression_5_0,
							"com.kaurel.klang.xtext.Klang.PrimaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAtomicExpressionParserRuleCall_2());
		}
		this_AtomicExpression_6=ruleAtomicExpression
		{
			$current = $this_AtomicExpression_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtomicExpression
entryRuleAtomicExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicExpressionRule()); }
	iv_ruleAtomicExpression=ruleAtomicExpression
	{ $current=$iv_ruleAtomicExpression.current; }
	EOF;

// Rule AtomicExpression
ruleAtomicExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicExpressionAccess().getBooleanLiteralAction_0_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_1_0=True
						{
							newLeafNode(lv_value_1_0, grammarAccess.getAtomicExpressionAccess().getValueTrueKeyword_0_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAtomicExpressionRule());
							}
							setWithLastConsumed($current, "value", true, "true");
						}
					)
				)
				    |
				otherlv_2=False
				{
					newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getFalseKeyword_0_1_1());
				}
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicExpressionAccess().getNumericLiteralAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_value_4_0=RULE_DECIMAL
					{
						newLeafNode(lv_value_4_0, grammarAccess.getAtomicExpressionAccess().getValueDECIMALTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_4_0,
							"com.kaurel.klang.xtext.Klang.DECIMAL");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicExpressionAccess().getStringLiteralAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_value_6_0=RULE_STRING
					{
						newLeafNode(lv_value_6_0, grammarAccess.getAtomicExpressionAccess().getValueSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getAtomicExpressionAccess().getVariableRefAction_3_0(),
						$current);
				}
			)
			(
				(
					lv_variableName_8_0=RULE_ID
					{
						newLeafNode(lv_variableName_8_0, grammarAccess.getAtomicExpressionAccess().getVariableNameIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAtomicExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"variableName",
							lv_variableName_8_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Rule EventType
ruleEventType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0=GAME_STARTED
		{
			$current = grammarAccess.getEventTypeAccess().getGAME_STARTEDEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getEventTypeAccess().getGAME_STARTEDEnumLiteralDeclaration());
		}
	)
;
