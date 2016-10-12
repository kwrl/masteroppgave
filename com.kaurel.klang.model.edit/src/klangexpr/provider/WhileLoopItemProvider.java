/**
 */
package klangexpr.provider;


import java.util.Collection;
import java.util.List;

import klangexpr.KlangexprFactory;
import klangexpr.KlangexprPackage;
import klangexpr.WhileLoop;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link klangexpr.WhileLoop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileLoopItemProvider extends AbstractElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLoopItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE);
			childrenFeatures.add(KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WhileLoop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WhileLoop"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_WhileLoop_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(WhileLoop.class)) {
			case KlangexprPackage.WHILE_LOOP__PREDICATE:
			case KlangexprPackage.WHILE_LOOP__STATEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createBinaryOperator()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createMultiply()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createDivide()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createUnaryMinus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createToDouble()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangexprFactory.eINSTANCE.createToInt()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS,
				 KlangexprFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS,
				 KlangexprFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS,
				 KlangexprFactory.eINSTANCE.createForeverLoop()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS,
				 KlangexprFactory.eINSTANCE.createYield()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS,
				 KlangexprFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS,
				 KlangexprFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS,
				 KlangexprFactory.eINSTANCE.createSleep()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == KlangexprPackage.Literals.WHILE_LOOP__PREDICATE ||
			childFeature == KlangexprPackage.Literals.WHILE_LOOP__STATEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
