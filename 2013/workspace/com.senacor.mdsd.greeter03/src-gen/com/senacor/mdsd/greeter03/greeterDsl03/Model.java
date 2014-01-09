/**
 */
package com.senacor.mdsd.greeter03.greeterDsl03;

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
 *   <li>{@link com.senacor.mdsd.greeter03.greeterDsl03.Model#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.senacor.mdsd.greeter03.greeterDsl03.GreeterDsl03Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
   * The list contents are of type {@link com.senacor.mdsd.greeter03.greeterDsl03.Greeting}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greetings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetings</em>' containment reference list.
   * @see com.senacor.mdsd.greeter03.greeterDsl03.GreeterDsl03Package#getModel_Greetings()
   * @model containment="true"
   * @generated
   */
  EList<Greeting> getGreetings();

} // Model
