/**
 */
package com.senacor.mdsd.greeter02.greeterDsl02.impl;

import com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package;
import com.senacor.mdsd.greeter02.greeterDsl02.Person;

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
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.PersonImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.PersonImpl#getGender <em>Gender</em>}</li>
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
   * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstname()
   * @generated
   * @ordered
   */
  protected static final String FIRSTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstname()
   * @generated
   * @ordered
   */
  protected String firstname = FIRSTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastname()
   * @generated
   * @ordered
   */
  protected static final String LASTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastname()
   * @generated
   * @ordered
   */
  protected String lastname = LASTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGender()
   * @generated
   * @ordered
   */
  protected static final String GENDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGender()
   * @generated
   * @ordered
   */
  protected String gender = GENDER_EDEFAULT;

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
    return GreeterDsl02Package.Literals.PERSON;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterDsl02Package.PERSON__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstname()
  {
    return firstname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstname(String newFirstname)
  {
    String oldFirstname = firstname;
    firstname = newFirstname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterDsl02Package.PERSON__FIRSTNAME, oldFirstname, firstname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastname()
  {
    return lastname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastname(String newLastname)
  {
    String oldLastname = lastname;
    lastname = newLastname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterDsl02Package.PERSON__LASTNAME, oldLastname, lastname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGender()
  {
    return gender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGender(String newGender)
  {
    String oldGender = gender;
    gender = newGender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterDsl02Package.PERSON__GENDER, oldGender, gender));
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
      case GreeterDsl02Package.PERSON__NAME:
        return getName();
      case GreeterDsl02Package.PERSON__FIRSTNAME:
        return getFirstname();
      case GreeterDsl02Package.PERSON__LASTNAME:
        return getLastname();
      case GreeterDsl02Package.PERSON__GENDER:
        return getGender();
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
      case GreeterDsl02Package.PERSON__NAME:
        setName((String)newValue);
        return;
      case GreeterDsl02Package.PERSON__FIRSTNAME:
        setFirstname((String)newValue);
        return;
      case GreeterDsl02Package.PERSON__LASTNAME:
        setLastname((String)newValue);
        return;
      case GreeterDsl02Package.PERSON__GENDER:
        setGender((String)newValue);
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
      case GreeterDsl02Package.PERSON__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GreeterDsl02Package.PERSON__FIRSTNAME:
        setFirstname(FIRSTNAME_EDEFAULT);
        return;
      case GreeterDsl02Package.PERSON__LASTNAME:
        setLastname(LASTNAME_EDEFAULT);
        return;
      case GreeterDsl02Package.PERSON__GENDER:
        setGender(GENDER_EDEFAULT);
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
      case GreeterDsl02Package.PERSON__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GreeterDsl02Package.PERSON__FIRSTNAME:
        return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
      case GreeterDsl02Package.PERSON__LASTNAME:
        return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
      case GreeterDsl02Package.PERSON__GENDER:
        return GENDER_EDEFAULT == null ? gender != null : !GENDER_EDEFAULT.equals(gender);
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
    result.append(", firstname: ");
    result.append(firstname);
    result.append(", lastname: ");
    result.append(lastname);
    result.append(", gender: ");
    result.append(gender);
    result.append(')');
    return result.toString();
  }

} //PersonImpl
