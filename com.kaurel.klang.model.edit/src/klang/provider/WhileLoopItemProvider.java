/**
 */
package klang.provider;


import java.util.Collection;
import java.util.List;

import klang.KlangFactory;
import klang.KlangPackage;
import klang.WhileLoop;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link klang.WhileLoop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileLoopItemProvider extends ControlStatementItemProvider {
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
			childrenFeatures.add(KlangPackage.Literals.WHILE_LOOP__PREDICATE);
			childrenFeatures.add(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK);
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
			case KlangPackage.WHILE_LOOP__PREDICATE:
			case KlangPackage.WHILE_LOOP__LOOP_BLOCK:
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
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createMultiply()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createDivide()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createEqual()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createNumericLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__PREDICATE,
				 KlangFactory.eINSTANCE.createVariableRef()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createStatement()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createControlStatement()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createForeverLoop()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createSubroutineCall()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createYield()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(KlangPackage.Literals.WHILE_LOOP__LOOP_BLOCK,
				 KlangFactory.eINSTANCE.createAssignment()));
	}

}
