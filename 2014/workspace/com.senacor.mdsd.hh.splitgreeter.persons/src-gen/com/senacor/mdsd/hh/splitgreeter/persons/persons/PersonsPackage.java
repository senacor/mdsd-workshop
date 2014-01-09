/**
 */
package com.senacor.mdsd.hh.splitgreeter.persons.persons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.PersonsFactory
 * @model kind="package"
 * @generated
 */
public interface PersonsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "persons";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.senacor.com/mdsd/hh/splitgreeter/persons/Persons";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "persons";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PersonsPackage eINSTANCE = com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonsPackageImpl.init();

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.ModelImpl
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonsPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Persons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PERSONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonImpl
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonsPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Fn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__FN = 1;

  /**
   * The feature id for the '<em><b>Ln</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LN = 2;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.Model#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.Model#getPersons()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Persons();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.Person#getFn <em>Fn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fn</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.Person#getFn()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Fn();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.Person#getLn <em>Ln</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ln</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.Person#getLn()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Ln();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PersonsFactory getPersonsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.ModelImpl
     * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonsPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PERSONS = eINSTANCE.getModel_Persons();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonImpl
     * @see com.senacor.mdsd.hh.splitgreeter.persons.persons.impl.PersonsPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

    /**
     * The meta object literal for the '<em><b>Fn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__FN = eINSTANCE.getPerson_Fn();

    /**
     * The meta object literal for the '<em><b>Ln</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__LN = eINSTANCE.getPerson_Ln();

  }

} //PersonsPackage
