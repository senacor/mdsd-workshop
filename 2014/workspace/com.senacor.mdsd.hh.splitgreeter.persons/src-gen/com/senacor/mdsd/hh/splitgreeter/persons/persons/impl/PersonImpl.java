/**
 */
package com.senacor.mdsd.hh.splitgreeter.persons.persons.impl;

import com.senacor.mdsd.hh.splitgreeter.persons.persons.Person;
import com.senacor.mdsd.hh.splitgreeter.persons.persons.PersonsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonImpl#getFn <em>Fn</em>}</li>
 *   <li>{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonImpl#getLn <em>Ln</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFn() <em>Fn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected static final String FN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFn() <em>Fn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFn()
   * @generated
   * @ordered
   */
  protected String fn = FN_EDEFAULT;

  /**
   * The default value of the '{@link #getLn() <em>Ln</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLn()
   * @generated
   * @ordered
   */
  protected static final String LN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLn() <em>Ln</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLn()
   * @generated
   * @ordered
   */
  protected String ln = LN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonImpl()
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
    return PersonsPackage.Literals.PERSON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersonsPackage.PERSON__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFn()
  {
    return fn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFn(String newFn)
  {
    String oldFn = fn;
    fn = newFn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersonsPackage.PERSON__FN, oldFn, fn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLn()
  {
    return ln;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLn(String newLn)
  {
    String oldLn = ln;
    ln = newLn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersonsPackage.PERSON__LN, oldLn, ln));
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
      case PersonsPackage.PERSON__NAME:
        return getName();
      case PersonsPackage.PERSON__FN:
        return getFn();
      case PersonsPackage.PERSON__LN:
        return getLn();
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
      case PersonsPackage.PERSON__NAME:
        setName((String)newValue);
        return;
      case PersonsPackage.PERSON__FN:
        setFn((String)newValue);
        return;
      case PersonsPackage.PERSON__LN:
        setLn((String)newValue);
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
      case PersonsPackage.PERSON__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PersonsPackage.PERSON__FN:
        setFn(FN_EDEFAULT);
        return;
      case PersonsPackage.PERSON__LN:
        setLn(LN_EDEFAULT);
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
      case PersonsPackage.PERSON__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PersonsPackage.PERSON__FN:
        return FN_EDEFAULT == null ? fn != null : !FN_EDEFAULT.equals(fn);
      case PersonsPackage.PERSON__LN:
        return LN_EDEFAULT == null ? ln != null : !LN_EDEFAULT.equals(ln);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", fn: ");
    result.append(fn);
    result.append(", ln: ");
    result.append(ln);
    result.append(')');
    return result.toString();
  }

} //PersonImpl
