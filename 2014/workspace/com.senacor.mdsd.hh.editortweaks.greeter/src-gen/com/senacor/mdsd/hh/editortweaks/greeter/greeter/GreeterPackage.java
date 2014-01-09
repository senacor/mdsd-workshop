/**
 */
package com.senacor.mdsd.hh.editortweaks.greeter.greeter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.GreeterFactory
 * @model kind="package"
 * @generated
 */
public interface GreeterPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "greeter";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.senacor.com/mdsd/hh/editortweaks/greeter/Greeter";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "greeter";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GreeterPackage eINSTANCE = com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl.init();

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.ModelImpl
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getModel()
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
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.PersonImpl
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getPerson()
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
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LANG = 3;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreetingImpl
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 2;

  /**
   * The feature id for the '<em><b>Greetword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__GREETWORD = 0;

  /**
   * The feature id for the '<em><b>Person</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__PERSON = 1;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greetword <em>Greetword</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greetword
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getGreetword()
   * @generated
   */
  int GREETWORD = 3;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Language <em>Language</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Language
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getLanguage()
   * @generated
   */
  int LANGUAGE = 4;


  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Model#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Model#getPersons()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Persons();

  /**
   * Returns the meta object for the containment reference list '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person#getFn <em>Fn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fn</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person#getFn()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Fn();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person#getLn <em>Ln</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ln</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person#getLn()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Ln();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person#getLang()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Lang();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting#getGreetword <em>Greetword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Greetword</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting#getGreetword()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_Greetword();

  /**
   * Returns the meta object for the reference '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting#getPerson()
   * @see #getGreeting()
   * @generated
   */
  EReference getGreeting_Person();

  /**
   * Returns the meta object for enum '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greetword <em>Greetword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Greetword</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greetword
   * @generated
   */
  EEnum getGreetword();

  /**
   * Returns the meta object for enum '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Language</em>'.
   * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Language
   * @generated
   */
  EEnum getLanguage();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GreeterFactory getGreeterFactory();

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
     * The meta object literal for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.ModelImpl
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.PersonImpl
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getPerson()
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

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__LANG = eINSTANCE.getPerson_Lang();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreetingImpl
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Greetword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__GREETWORD = eINSTANCE.getGreeting_Greetword();

    /**
     * The meta object literal for the '<em><b>Person</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREETING__PERSON = eINSTANCE.getGreeting_Person();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greetword <em>Greetword</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greetword
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getGreetword()
     * @generated
     */
    EEnum GREETWORD = eINSTANCE.getGreetword();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.Language <em>Language</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.Language
     * @see com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.GreeterPackageImpl#getLanguage()
     * @generated
     */
    EEnum LANGUAGE = eINSTANCE.getLanguage();

  }

} //GreeterPackage
