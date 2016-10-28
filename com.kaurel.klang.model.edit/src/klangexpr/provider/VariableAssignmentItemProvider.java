/**
 */
package klangexpr.provider;


import java.util.Collection;
import java.util.List;

import klangexpr.KlangexprFactory;
import klangexpr.KlangexprPackage;
import klangexpr.VariableAssignment;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link klangexpr.VariableAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableAssignmentItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignmentItemProvider(AdapterFactory adapterFactory) {
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

			addVariableNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Variable Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableAssignment_variableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableAssignment_variableName_feature", "_UI_VariableAssignment_type"),
				 KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__VARIABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION);
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
	 * This returns VariableAssignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableAssignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VariableAssignment)object).getVariableName();
		return label == null || label.length() == 0 ?
			getString("_UI_VariableAssignment_type") :
			getString("_UI_VariableAssignment_type") + " " + label;
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

		switch (notification.getFeatureID(VariableAssignment.class)) {
			case KlangexprPackage.VARIABLE_ASSIGNMENT__VARIABLE_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case KlangexprPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
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
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createBinaryOperator()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createMultiply()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createDivide()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createUnaryMinus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createToDouble()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createToInt()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createLessThanOrEqual()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION,
				 KlangexprFactory.eINSTANCE.createGreaterThanOrEqual()));
	}

}
