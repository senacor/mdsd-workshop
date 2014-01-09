/**
 */
package com.senacor.mdsd.greeter02.greeterDsl02;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.Model#getPersons <em>Persons</em>}</li>
 *   <li>{@link com.senacor.mdsd.greeter02.greeterDsl02.Model#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link com.senacor.mdsd.greeter02.greeterDsl02.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package#getModel_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

  /**
   * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
   * The list contents are of type {@link com.senacor.mdsd.greeter02.greeterDsl02.Greeting}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greetings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetings</em>' containment reference list.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package#getModel_Greetings()
   * @model containment="true"
   * @generated
   */
  EList<Greeting> getGreetings();

} // Model
