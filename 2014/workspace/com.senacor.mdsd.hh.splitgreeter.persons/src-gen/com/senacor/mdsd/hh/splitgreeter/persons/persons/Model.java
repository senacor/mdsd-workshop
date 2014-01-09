/**
 */
package com.senacor.mdsd.hh.splitgreeter.persons.persons;

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
 *   <li>{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.Model#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.PersonsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
   * The list contents are of type {@link com.senacor.mdsd.hh.splitgreeter.persons.persons.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persons</em>' containment reference list.
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.PersonsPackage#getModel_Persons()
   * @model containment="true"
   * @generated
   */
  EList<Person> getPersons();

} // Model
