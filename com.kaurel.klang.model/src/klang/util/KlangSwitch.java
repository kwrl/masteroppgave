/**
 */
package klang.util;

import klang.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see klang.KlangPackage
 * @generated
 */
public class KlangSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KlangPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangSwitch() {
		if (modelPackage == null) {
			modelPackage = KlangPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KlangPackage.SCENE_ACTOR: {
				SceneActor sceneActor = (SceneActor)theEObject;
				T1 result = caseSceneActor(sceneActor);
				if (result == null) result = caseAbstractActor(sceneActor);
				if (result == null) result = caseTreeNode(sceneActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.SPRITE_ACTOR: {
				SpriteActor spriteActor = (SpriteActor)theEObject;
				T1 result = caseSpriteActor(spriteActor);
				if (result == null) result = caseAbstractActor(spriteActor);
				if (result == null) result = caseTreeNode(spriteActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.EVENT_HANDLER: {
				EventHandler eventHandler = (EventHandler)theEObject;
				T1 result = caseEventHandler(eventHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.WHILE_LOOP: {
				WhileLoop whileLoop = (WhileLoop)theEObject;
				T1 result = caseWhileLoop(whileLoop);
				if (result == null) result = caseStatement(whileLoop);
				if (result == null) result = caseAbstractElement(whileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.IF: {
				If if_ = (If)theEObject;
				T1 result = caseIf(if_);
				if (result == null) result = caseStatement(if_);
				if (result == null) result = caseAbstractElement(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.FOREVER_LOOP: {
				ForeverLoop foreverLoop = (ForeverLoop)theEObject;
				T1 result = caseForeverLoop(foreverLoop);
				if (result == null) result = caseStatement(foreverLoop);
				if (result == null) result = caseAbstractElement(foreverLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.YIELD: {
				Yield yield = (Yield)theEObject;
				T1 result = caseYield(yield);
				if (result == null) result = caseStatement(yield);
				if (result == null) result = caseAbstractElement(yield);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T1 result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseAbstractElement(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.VARIABLE_ASSIGNMENT: {
				VariableAssignment variableAssignment = (VariableAssignment)theEObject;
				T1 result = caseVariableAssignment(variableAssignment);
				if (result == null) result = caseStatement(variableAssignment);
				if (result == null) result = caseAbstractElement(variableAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T1 result = caseExpression(expression);
				if (result == null) result = caseAbstractElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.OR: {
				Or or = (Or)theEObject;
				T1 result = caseOr(or);
				if (result == null) result = caseBinaryOperator(or);
				if (result == null) result = caseExpression(or);
				if (result == null) result = caseAbstractElement(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.AND: {
				And and = (And)theEObject;
				T1 result = caseAnd(and);
				if (result == null) result = caseBinaryOperator(and);
				if (result == null) result = caseExpression(and);
				if (result == null) result = caseAbstractElement(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.PLUS: {
				Plus plus = (Plus)theEObject;
				T1 result = casePlus(plus);
				if (result == null) result = caseBinaryOperator(plus);
				if (result == null) result = caseExpression(plus);
				if (result == null) result = caseAbstractElement(plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.MINUS: {
				Minus minus = (Minus)theEObject;
				T1 result = caseMinus(minus);
				if (result == null) result = caseBinaryOperator(minus);
				if (result == null) result = caseExpression(minus);
				if (result == null) result = caseAbstractElement(minus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.MULTIPLY: {
				Multiply multiply = (Multiply)theEObject;
				T1 result = caseMultiply(multiply);
				if (result == null) result = caseBinaryOperator(multiply);
				if (result == null) result = caseExpression(multiply);
				if (result == null) result = caseAbstractElement(multiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.DIVIDE: {
				Divide divide = (Divide)theEObject;
				T1 result = caseDivide(divide);
				if (result == null) result = caseBinaryOperator(divide);
				if (result == null) result = caseExpression(divide);
				if (result == null) result = caseAbstractElement(divide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.LESS_THAN: {
				LessThan lessThan = (LessThan)theEObject;
				T1 result = caseLessThan(lessThan);
				if (result == null) result = caseBinaryOperator(lessThan);
				if (result == null) result = caseExpression(lessThan);
				if (result == null) result = caseAbstractElement(lessThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.EQUAL: {
				Equal equal = (Equal)theEObject;
				T1 result = caseEqual(equal);
				if (result == null) result = caseBinaryOperator(equal);
				if (result == null) result = caseExpression(equal);
				if (result == null) result = caseAbstractElement(equal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.GREATER_THAN: {
				GreaterThan greaterThan = (GreaterThan)theEObject;
				T1 result = caseGreaterThan(greaterThan);
				if (result == null) result = caseExpression(greaterThan);
				if (result == null) result = caseAbstractElement(greaterThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.NOT: {
				Not not = (Not)theEObject;
				T1 result = caseNot(not);
				if (result == null) result = caseUnaryOperator(not);
				if (result == null) result = caseExpression(not);
				if (result == null) result = caseAbstractElement(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T1 result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseAbstractElement(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.DOUBLE_LITERAL: {
				DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
				T1 result = caseDoubleLiteral(doubleLiteral);
				if (result == null) result = caseExpression(doubleLiteral);
				if (result == null) result = caseAbstractElement(doubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T1 result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = caseAbstractElement(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.VARIABLE_REFERENCE: {
				VariableReference variableReference = (VariableReference)theEObject;
				T1 result = caseVariableReference(variableReference);
				if (result == null) result = caseExpression(variableReference);
				if (result == null) result = caseAbstractElement(variableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.ABSTRACT_ACTOR: {
				AbstractActor abstractActor = (AbstractActor)theEObject;
				T1 result = caseAbstractActor(abstractActor);
				if (result == null) result = caseTreeNode(abstractActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T1 result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseExpression(unaryOperator);
				if (result == null) result = caseAbstractElement(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T1 result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseExpression(binaryOperator);
				if (result == null) result = caseAbstractElement(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.FUNCTION_CALL: {
				FunctionCall functionCall = (FunctionCall)theEObject;
				T1 result = caseFunctionCall(functionCall);
				if (result == null) result = caseExpression(functionCall);
				if (result == null) result = caseStatement(functionCall);
				if (result == null) result = caseAbstractElement(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T1 result = caseStatement(statement);
				if (result == null) result = caseAbstractElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.ABSTRACT_ELEMENT: {
				AbstractElement abstractElement = (AbstractElement)theEObject;
				T1 result = caseAbstractElement(abstractElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.GAME_START: {
				GameStart gameStart = (GameStart)theEObject;
				T1 result = caseGameStart(gameStart);
				if (result == null) result = caseEventHandler(gameStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.SPRITE_CLICKED: {
				SpriteClicked spriteClicked = (SpriteClicked)theEObject;
				T1 result = caseSpriteClicked(spriteClicked);
				if (result == null) result = caseEventHandler(spriteClicked);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.KEY_PRESSED: {
				KeyPressed keyPressed = (KeyPressed)theEObject;
				T1 result = caseKeyPressed(keyPressed);
				if (result == null) result = caseEventHandler(keyPressed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.COLLIDES_WITH: {
				CollidesWith collidesWith = (CollidesWith)theEObject;
				T1 result = caseCollidesWith(collidesWith);
				if (result == null) result = caseEventHandler(collidesWith);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T1 result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseExpression(integerLiteral);
				if (result == null) result = caseAbstractElement(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.SLEEP: {
				Sleep sleep = (Sleep)theEObject;
				T1 result = caseSleep(sleep);
				if (result == null) result = caseStatement(sleep);
				if (result == null) result = caseAbstractElement(sleep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.UNARY_MINUS: {
				UnaryMinus unaryMinus = (UnaryMinus)theEObject;
				T1 result = caseUnaryMinus(unaryMinus);
				if (result == null) result = caseUnaryOperator(unaryMinus);
				if (result == null) result = caseExpression(unaryMinus);
				if (result == null) result = caseAbstractElement(unaryMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.TO_DOUBLE: {
				ToDouble toDouble = (ToDouble)theEObject;
				T1 result = caseToDouble(toDouble);
				if (result == null) result = caseUnaryOperator(toDouble);
				if (result == null) result = caseExpression(toDouble);
				if (result == null) result = caseAbstractElement(toDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.TO_INT: {
				ToInt toInt = (ToInt)theEObject;
				T1 result = caseToInt(toInt);
				if (result == null) result = caseUnaryOperator(toInt);
				if (result == null) result = caseExpression(toInt);
				if (result == null) result = caseAbstractElement(toInt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.PROGRAM: {
				Program program = (Program)theEObject;
				T1 result = caseProgram(program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.TREE_NODE: {
				TreeNode<?> treeNode = (TreeNode<?>)theEObject;
				T1 result = caseTreeNode(treeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KlangPackage.TREE_TRAVERSAL: {
				TreeTraversal treeTraversal = (TreeTraversal)theEObject;
				T1 result = caseTreeTraversal(treeTraversal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSceneActor(SceneActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sprite Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sprite Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpriteActor(SpriteActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEventHandler(EventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWhileLoop(WhileLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forever Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forever Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForeverLoop(ForeverLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yield</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yield</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseYield(Yield object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableAssignment(VariableAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractElement(AbstractElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGameStart(GameStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sprite Clicked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sprite Clicked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpriteClicked(SpriteClicked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Pressed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Pressed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKeyPressed(KeyPressed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collides With</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collides With</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCollidesWith(CollidesWith object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sleep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sleep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSleep(Sleep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryMinus(UnaryMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseToDouble(ToDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseToInt(ToInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractActor(AbstractActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TreeNode<T>> T1 caseTreeNode(TreeNode<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Traversal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Traversal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTreeTraversal(TreeTraversal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLessThan(LessThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEqual(Equal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGreaterThan(GreaterThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDoubleLiteral(DoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableReference(VariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //KlangSwitch
