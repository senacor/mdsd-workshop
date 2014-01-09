/**
 */
package com.senacor.mdsd.hh.greeter.greeter.impl;

import com.senacor.mdsd.hh.greeter.greeter.GreeterPackage;
import com.senacor.mdsd.hh.greeter.greeter.Greeting;
import com.senacor.mdsd.hh.greeter.greeter.Greetword;
import com.senacor.mdsd.hh.greeter.greeter.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.senacor.mdsd.hh.greeter.greeter.impl.GreetingImpl#getGreetword <em>Greetword</em>}</li>
 *   <li>{@link com.senacor.mdsd.hh.greeter.greeter.impl.GreetingImpl#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GreetingImpl extends MinimalEObjectImpl.Container implements Greeting
{
  /**
   * The default value of the '{@link #getGreetword() <em>Greetword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreetword()
   * @generated
   * @ordered
   */
  protected static final Greetword GREETWORD_EDEFAULT = Greetword.DE;

  /**
   * The cached value of the '{@link #getGreetword() <em>Greetword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreetword()
   * @generated
   * @ordered
   */
  protected Greetword greetword = GREETWORD_EDEFAULT;

  /**
   * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPerson()
   * @generated
   * @ordered
   */
  protected Person person;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreetingImpl()
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
    return GreeterPackage.Literals.GREETING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greetword getGreetword()
  {
    return greetword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreetword(Greetword newGreetword)
  {
    Greetword oldGreetword = greetword;
    greetword = newGreetword == null ? GREETWORD_EDEFAULT : newGreetword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterPackage.GREETING__GREETWORD, oldGreetword, greetword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person getPerson()
  {
    if (person != null && person.eIsProxy())
    {
      InternalEObject oldPerson = (InternalEObject)person;
      person = (Person)eResolveProxy(oldPerson);
      if (person != oldPerson)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreeterPackage.GREETING__PERSON, oldPerson, person));
      }
    }
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetPerson()
  {
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPerson(Person newPerson)
  {
    Person oldPerson = person;
    person = newPerson;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterPackage.GREETING__PERSON, oldPerson, person));
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
      case GreeterPackage.GREETING__GREETWORD:
        return getGreetword();
      case GreeterPackage.GREETING__PERSON:
        if (resolve) return getPerson();
        return basicGetPerson();
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
      case GreeterPackage.GREETING__GREETWORD:
        setGreetword((Greetword)newValue);
        return;
      case GreeterPackage.GREETING__PERSON:
        setPerson((Person)newValue);
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
      case GreeterPackage.GREETING__GREETWORD:
        setGreetword(GREETWORD_EDEFAULT);
        return;
      case GreeterPackage.GREETING__PERSON:
        setPerson((Person)null);
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
      case GreeterPackage.GREETING__GREETWORD:
        return greetword != GREETWORD_EDEFAULT;
      case GreeterPackage.GREETING__PERSON:
        return person != null;
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
    result.append(" (greetword: ");
    result.append(greetword);
    result.append(')');
    return result.toString();
  }

} //GreetingImpl
