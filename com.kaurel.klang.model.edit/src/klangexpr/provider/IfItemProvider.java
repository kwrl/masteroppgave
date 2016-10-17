/**
 */
package klangexpr.provider;


import java.util.Collection;
import java.util.List;

import klangexpr.If;
import klangexpr.KlangexprFactory;
import klangexpr.KlangexprPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link klangexpr.If} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(KlangexprPackage.Literals.IF__PREDICATE);
			childrenFeatures.add(KlangexprPackage.Literals.IF__IF_BLOCK);
			childrenFeatures.add(KlangexprPackage.Literals.IF__ELSE_BLOCK);
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
	 * This returns If.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/If"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_If_type");
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

		switch (notification.getFeatureID(If.class)) {
			case KlangexprPackage.IF__PREDICATE:
			case KlangexprPackage.IF__IF_BLOCK:
			case KlangexprPackage.IF__ELSE_BLOCK:
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
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createBinaryOperator()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createMultiply()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createDivide()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createUnaryOperator()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createUnaryMinus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createToDouble()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__PREDICATE,
				 KlangexprFactory.eINSTANCE.createToInt()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createForeverLoop()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createYield()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createSleep()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__IF_BLOCK,
				 KlangexprFactory.eINSTANCE.createSendMessage()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createForeverLoop()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createYield()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createSleep()));

		newChildDescriptors.add
			(createChildParameter
				(KlangexprPackage.Literals.IF__ELSE_BLOCK,
				 KlangexprFactory.eINSTANCE.createSendMessage()));
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
			childFeature == KlangexprPackage.Literals.IF__PREDICATE ||
			childFeature == KlangexprPackage.Literals.IF__IF_BLOCK ||
			childFeature == KlangexprPackage.Literals.IF__ELSE_BLOCK;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
