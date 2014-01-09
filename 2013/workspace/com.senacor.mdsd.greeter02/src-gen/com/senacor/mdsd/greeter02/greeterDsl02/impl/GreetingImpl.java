/**
 */
package com.senacor.mdsd.greeter02.greeterDsl02.impl;

import com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package;
import com.senacor.mdsd.greeter02.greeterDsl02.Greeting;
import com.senacor.mdsd.greeter02.greeterDsl02.Greetword;
import com.senacor.mdsd.greeter02.greeterDsl02.Person;

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
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.GreetingImpl#getWord <em>Word</em>}</li>
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.GreetingImpl#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GreetingImpl extends MinimalEObjectImpl.Container implements Greeting
{
  /**
   * The default value of the '{@link #getWord() <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWord()
   * @generated
   * @ordered
   */
  protected static final Greetword WORD_EDEFAULT = Greetword.DE;

  /**
   * The cached value of the '{@link #getWord() <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWord()
   * @generated
   * @ordered
   */
  protected Greetword word = WORD_EDEFAULT;

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
    return GreeterDsl02Package.Literals.GREETING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greetword getWord()
  {
    return word;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWord(Greetword newWord)
  {
    Greetword oldWord = word;
    word = newWord == null ? WORD_EDEFAULT : newWord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterDsl02Package.GREETING__WORD, oldWord, word));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreeterDsl02Package.GREETING__PERSON, oldPerson, person));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GreeterDsl02Package.GREETING__PERSON, oldPerson, person));
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
      case GreeterDsl02Package.GREETING__WORD:
        return getWord();
      case GreeterDsl02Package.GREETING__PERSON:
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
      case GreeterDsl02Package.GREETING__WORD:
        setWord((Greetword)newValue);
        return;
      case GreeterDsl02Package.GREETING__PERSON:
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
      case GreeterDsl02Package.GREETING__WORD:
        setWord(WORD_EDEFAULT);
        return;
      case GreeterDsl02Package.GREETING__PERSON:
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
      case GreeterDsl02Package.GREETING__WORD:
        return word != WORD_EDEFAULT;
      case GreeterDsl02Package.GREETING__PERSON:
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
    result.append(" (word: ");
    result.append(word);
    result.append(')');
    return result.toString();
  }

} //GreetingImpl
