/**
 */
package com.senacor.mdsd.greeter02.greeterDsl02;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.Greeting#getWord <em>Word</em>}</li>
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.Greeting#getPerson <em>Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package#getGreeting()
 * @model
 * @generated
 */
public interface Greeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Word</b></em>' attribute.
   * The literals are from the enumeration {@link com.senacor.mdsd.greeter02.greeterDsl02.Greetword}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Word</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Word</em>' attribute.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Greetword
   * @see #setWord(Greetword)
   * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package#getGreeting_Word()
   * @model
   * @generated
   */
  Greetword getWord();

  /**
   * Sets the value of the '{@link com.senacor.mdsd.greeter02.greeterDsl02.Greeting#getWord <em>Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Word</em>' attribute.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Greetword
   * @see #getWord()
   * @generated
   */
  void setWord(Greetword value);

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
   * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package#getGreeting_Person()
   * @model
   * @generated
   */
  Person getPerson();

  /**
   * Sets the value of the '{@link com.senacor.mdsd.greeter02.greeterDsl02.Greeting#getPerson <em>Person</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person</em>' reference.
   * @see #getPerson()
   * @generated
   */
  void setPerson(Person value);

} // Greeting
