/**
 */
package klang.impl;

import klang.KlangPackage;
import klang.Sprite;

import klang.framework.SpriteEntity;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sprite</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpriteImpl extends ActorImpl<SpriteEntity> implements Sprite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.SPRITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setEntity(SpriteEntity newEntity) {
		super.setEntity(newEntity);
	}

} //SpriteImpl
