/**
 */
package com.senacor.mdsd.hh.greeter.greeter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.senacor.mdsd.hh.greeter.greeter.Person#getName <em>Name</em>}</li>
 *   <li>{@link com.senacor.mdsd.hh.greeter.greeter.Person#getFn <em>Fn</em>}</li>
 *   <li>{@link com.senacor.mdsd.hh.greeter.greeter.Person#getLn <em>Ln</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.senacor.mdsd.hh.greeter.greeter.GreeterPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.senacor.mdsd.hh.greeter.greeter.GreeterPackage#getPerson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.senacor.mdsd.hh.greeter.greeter.Person#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fn</em>' attribute.
   * @see #setFn(String)
   * @see com.senacor.mdsd.hh.greeter.greeter.GreeterPackage#getPerson_Fn()
   * @model
   * @generated
   */
  String getFn();

  /**
   * Sets the value of the '{@link com.senacor.mdsd.hh.greeter.greeter.Person#getFn <em>Fn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fn</em>' attribute.
   * @see #getFn()
   * @generated
   */
  void setFn(String value);

  /**
   * Returns the value of the '<em><b>Ln</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ln</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ln</em>' attribute.
   * @see #setLn(String)
   * @see com.senacor.mdsd.hh.greeter.greeter.GreeterPackage#getPerson_Ln()
   * @model
   * @generated
   */
  String getLn();

  /**
   * Sets the value of the '{@link com.senacor.mdsd.hh.greeter.greeter.Person#getLn <em>Ln</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ln</em>' attribute.
   * @see #getLn()
   * @generated
   */
  void setLn(String value);

} // Person
