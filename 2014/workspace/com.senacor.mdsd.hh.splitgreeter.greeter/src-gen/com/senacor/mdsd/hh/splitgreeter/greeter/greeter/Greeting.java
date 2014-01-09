/**
 */
package com.senacor.mdsd.hh.splitgreeter.greeter.greeter;

import com.senacor.mdsd.hh.splitgreeter.persons.persons.Person;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting#getGreetword <em>Greetword</em>}</li>
 *   <li>{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.GreeterPackage#getGreeting()
 * @model
 * @generated
 */
public interface Greeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Greetword</b></em>' attribute.
   * The literals are from the enumeration {@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greetword</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetword</em>' attribute.
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword
   * @see #setGreetword(Greetword)
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.GreeterPackage#getGreeting_Greetword()
   * @model
   * @generated
   */
  Greetword getGreetword();

  /**
   * Sets the value of the '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting#getGreetword <em>Greetword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greetword</em>' attribute.
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword
   * @see #getGreetword()
   * @generated
   */
  void setGreetword(Greetword value);

  /**
   * Returns the value of the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Person</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Person</em>' reference.
   * @see #setPerson(Person)
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.GreeterPackage#getGreeting_Person()
   * @model
   * @generated
   */
  Person getPerson();

  /**
   * Sets the value of the '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting#getPerson <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person</em>' reference.
   * @see #getPerson()
   * @generated
   */
  void setPerson(Person value);

} // Greeting
