/**
 */
package com.senacor.mdsd.greeterDsl01.impl;

import com.senacor.mdsd.greeterDsl01.GW;
import com.senacor.mdsd.greeterDsl01.GreeterDsl01Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.senacor.mdsd.greeterDsl01.impl.GWImpl#getAdressat <em>Adressat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GWImpl extends GreetingImpl implements GW
{
  /**
   * The default value of the '{@link #getAdressat() <em>Adressat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdressat()
   * @generated
   * @ordered
   */
  protected static final String ADRESSAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAdressat() <em>Adressat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdressat()
   * @generated
   * @ordered
   */
  protected String adressat = ADRESSAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GWImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GreeterDsl01Package.Literals.GW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAdressat()
  {
    return adressat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdressat(String newAdressat)
  {
    String oldAdressat = adressat;
    adressat = newAdressat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterDsl01Package.GW__ADRESSAT, oldAdressat, adressat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GreeterDsl01Package.GW__ADRESSAT:
        return getAdressat();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreeterDsl01Package.GW__ADRESSAT:
        setAdressat((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GreeterDsl01Package.GW__ADRESSAT:
        setAdressat(ADRESSAT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GreeterDsl01Package.GW__ADRESSAT:
        return ADRESSAT_EDEFAULT == null ? adressat != null : !ADRESSAT_EDEFAULT.equals(adressat);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (adressat: ");
    result.append(adressat);
    result.append(')');
    return result.toString();
  }

} //GWImpl
