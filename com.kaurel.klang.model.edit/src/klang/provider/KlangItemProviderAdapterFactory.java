/**
 */
package klang.provider;

import java.util.ArrayList;
import java.util.Collection;

import klang.util.KlangAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KlangItemProviderAdapterFactory extends KlangAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.GameDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameDefItemProvider gameDefItemProvider;

	/**
	 * This creates an adapter for a {@link klang.GameDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGameDefAdapter() {
		if (gameDefItemProvider == null) {
			gameDefItemProvider = new GameDefItemProvider(this);
		}

		return gameDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.SpriteDef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpriteDefItemProvider spriteDefItemProvider;

	/**
	 * This creates an adapter for a {@link klang.SpriteDef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpriteDefAdapter() {
		if (spriteDefItemProvider == null) {
			spriteDefItemProvider = new SpriteDefItemProvider(this);
		}

		return spriteDefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.EventHandler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventHandlerItemProvider eventHandlerItemProvider;

	/**
	 * This creates an adapter for a {@link klang.EventHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventHandlerAdapter() {
		if (eventHandlerItemProvider == null) {
			eventHandlerItemProvider = new EventHandlerItemProvider(this);
		}

		return eventHandlerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.WhileLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoopItemProvider whileLoopItemProvider;

	/**
	 * This creates an adapter for a {@link klang.WhileLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhileLoopAdapter() {
		if (whileLoopItemProvider == null) {
			whileLoopItemProvider = new WhileLoopItemProvider(this);
		}

		return whileLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.If} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfItemProvider ifItemProvider;

	/**
	 * This creates an adapter for a {@link klang.If}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIfAdapter() {
		if (ifItemProvider == null) {
			ifItemProvider = new IfItemProvider(this);
		}

		return ifItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.ForeverLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeverLoopItemProvider foreverLoopItemProvider;

	/**
	 * This creates an adapter for a {@link klang.ForeverLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForeverLoopAdapter() {
		if (foreverLoopItemProvider == null) {
			foreverLoopItemProvider = new ForeverLoopItemProvider(this);
		}

		return foreverLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Statement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementItemProvider statementItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatementAdapter() {
		if (statementItemProvider == null) {
			statementItemProvider = new StatementItemProvider(this);
		}

		return statementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.SubroutineCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubroutineCallItemProvider subroutineCallItemProvider;

	/**
	 * This creates an adapter for a {@link klang.SubroutineCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubroutineCallAdapter() {
		if (subroutineCallItemProvider == null) {
			subroutineCallItemProvider = new SubroutineCallItemProvider(this);
		}

		return subroutineCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.ControlStatement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlStatementItemProvider controlStatementItemProvider;

	/**
	 * This creates an adapter for a {@link klang.ControlStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlStatementAdapter() {
		if (controlStatementItemProvider == null) {
			controlStatementItemProvider = new ControlStatementItemProvider(this);
		}

		return controlStatementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Yield} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YieldItemProvider yieldItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Yield}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createYieldAdapter() {
		if (yieldItemProvider == null) {
			yieldItemProvider = new YieldItemProvider(this);
		}

		return yieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Assignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentItemProvider assignmentItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Assignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentAdapter() {
		if (assignmentItemProvider == null) {
			assignmentItemProvider = new AssignmentItemProvider(this);
		}

		return assignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Expression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionItemProvider expressionItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionAdapter() {
		if (expressionItemProvider == null) {
			expressionItemProvider = new ExpressionItemProvider(this);
		}

		return expressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Or} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Or}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new OrItemProvider(this);
		}

		return orItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link klang.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Plus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlusItemProvider plusItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Plus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlusAdapter() {
		if (plusItemProvider == null) {
			plusItemProvider = new PlusItemProvider(this);
		}

		return plusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Minus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinusItemProvider minusItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Minus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinusAdapter() {
		if (minusItemProvider == null) {
			minusItemProvider = new MinusItemProvider(this);
		}

		return minusItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Multiply} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplyItemProvider multiplyItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Multiply}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplyAdapter() {
		if (multiplyItemProvider == null) {
			multiplyItemProvider = new MultiplyItemProvider(this);
		}

		return multiplyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Divide} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivideItemProvider divideItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Divide}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDivideAdapter() {
		if (divideItemProvider == null) {
			divideItemProvider = new DivideItemProvider(this);
		}

		return divideItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.LessThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessThanItemProvider lessThanItemProvider;

	/**
	 * This creates an adapter for a {@link klang.LessThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLessThanAdapter() {
		if (lessThanItemProvider == null) {
			lessThanItemProvider = new LessThanItemProvider(this);
		}

		return lessThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Equal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualItemProvider equalItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Equal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualAdapter() {
		if (equalItemProvider == null) {
			equalItemProvider = new EqualItemProvider(this);
		}

		return equalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.GreaterThan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GreaterThanItemProvider greaterThanItemProvider;

	/**
	 * This creates an adapter for a {@link klang.GreaterThan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGreaterThanAdapter() {
		if (greaterThanItemProvider == null) {
			greaterThanItemProvider = new GreaterThanItemProvider(this);
		}

		return greaterThanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.Not} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotItemProvider notItemProvider;

	/**
	 * This creates an adapter for a {@link klang.Not}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotAdapter() {
		if (notItemProvider == null) {
			notItemProvider = new NotItemProvider(this);
		}

		return notItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.BooleanLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralItemProvider booleanLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link klang.BooleanLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanLiteralAdapter() {
		if (booleanLiteralItemProvider == null) {
			booleanLiteralItemProvider = new BooleanLiteralItemProvider(this);
		}

		return booleanLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.NumericLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericLiteralItemProvider numericLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link klang.NumericLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumericLiteralAdapter() {
		if (numericLiteralItemProvider == null) {
			numericLiteralItemProvider = new NumericLiteralItemProvider(this);
		}

		return numericLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.StringLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralItemProvider stringLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link klang.StringLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringLiteralAdapter() {
		if (stringLiteralItemProvider == null) {
			stringLiteralItemProvider = new StringLiteralItemProvider(this);
		}

		return stringLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link klang.VariableRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableRefItemProvider variableRefItemProvider;

	/**
	 * This creates an adapter for a {@link klang.VariableRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableRefAdapter() {
		if (variableRefItemProvider == null) {
			variableRefItemProvider = new VariableRefItemProvider(this);
		}

		return variableRefItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (gameDefItemProvider != null) gameDefItemProvider.dispose();
		if (spriteDefItemProvider != null) spriteDefItemProvider.dispose();
		if (eventHandlerItemProvider != null) eventHandlerItemProvider.dispose();
		if (whileLoopItemProvider != null) whileLoopItemProvider.dispose();
		if (ifItemProvider != null) ifItemProvider.dispose();
		if (foreverLoopItemProvider != null) foreverLoopItemProvider.dispose();
		if (statementItemProvider != null) statementItemProvider.dispose();
		if (subroutineCallItemProvider != null) subroutineCallItemProvider.dispose();
		if (controlStatementItemProvider != null) controlStatementItemProvider.dispose();
		if (yieldItemProvider != null) yieldItemProvider.dispose();
		if (variableItemProvider != null) variableItemProvider.dispose();
		if (assignmentItemProvider != null) assignmentItemProvider.dispose();
		if (expressionItemProvider != null) expressionItemProvider.dispose();
		if (orItemProvider != null) orItemProvider.dispose();
		if (andItemProvider != null) andItemProvider.dispose();
		if (plusItemProvider != null) plusItemProvider.dispose();
		if (minusItemProvider != null) minusItemProvider.dispose();
		if (multiplyItemProvider != null) multiplyItemProvider.dispose();
		if (divideItemProvider != null) divideItemProvider.dispose();
		if (lessThanItemProvider != null) lessThanItemProvider.dispose();
		if (equalItemProvider != null) equalItemProvider.dispose();
		if (greaterThanItemProvider != null) greaterThanItemProvider.dispose();
		if (notItemProvider != null) notItemProvider.dispose();
		if (booleanLiteralItemProvider != null) booleanLiteralItemProvider.dispose();
		if (numericLiteralItemProvider != null) numericLiteralItemProvider.dispose();
		if (stringLiteralItemProvider != null) stringLiteralItemProvider.dispose();
		if (variableRefItemProvider != null) variableRefItemProvider.dispose();
	}

}
