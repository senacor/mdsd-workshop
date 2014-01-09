/**
 */
package com.senacor.mdsd.greeter02.greeterDsl02;

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
 * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Factory
 * @model kind="package"
 * @generated
 */
public interface GreeterDsl02Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "greeterDsl02";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.senacor.com/mdsd/greeter02/GreeterDsl02";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "greeterDsl02";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GreeterDsl02Package eINSTANCE = com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl.init();

  /**
   * The meta object id for the '{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.ModelImpl
   * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl#getModel()
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
   * The meta object id for the '{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.PersonImpl
   * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl#getPerson()
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
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__FIRSTNAME = 1;

  /**
   * The feature id for the '<em><b>Lastname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LASTNAME = 2;

  /**
   * The feature id for the '<em><b>Gender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__GENDER = 3;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreetingImpl
   * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 2;

  /**
   * The feature id for the '<em><b>Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__WORD = 0;

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
   * The meta object id for the '{@link com.senacor.mdsd.greeter02.greeterDsl02.Greetword <em>Greetword</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Greetword
   * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl#getGreetword()
   * @generated
   */
  int GREETWORD = 3;


  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.greeter02.greeterDsl02.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.senacor.mdsd.greeter02.greeterDsl02.Model#getPersons <em>Persons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Persons</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Model#getPersons()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Persons();

  /**
   * Returns the meta object for the containment reference list '{@link com.senacor.mdsd.greeter02.greeterDsl02.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.greeter02.greeterDsl02.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.greeter02.greeterDsl02.Person#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Person#getName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Name();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.greeter02.greeterDsl02.Person#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Person#getFirstname()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Firstname();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.greeter02.greeterDsl02.Person#getLastname <em>Lastname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lastname</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Person#getLastname()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Lastname();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.greeter02.greeterDsl02.Person#getGender <em>Gender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gender</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Person#getGender()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Gender();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.greeter02.greeterDsl02.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.greeter02.greeterDsl02.Greeting#getWord <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Word</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Greeting#getWord()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_Word();

  /**
   * Returns the meta object for the reference '{@link com.senacor.mdsd.greeter02.greeterDsl02.Greeting#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Greeting#getPerson()
   * @see #getGreeting()
   * @generated
   */
  EReference getGreeting_Person();

  /**
   * Returns the meta object for enum '{@link com.senacor.mdsd.greeter02.greeterDsl02.Greetword <em>Greetword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Greetword</em>'.
   * @see com.senacor.mdsd.greeter02.greeterDsl02.Greetword
   * @generated
   */
  EEnum getGreetword();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GreeterDsl02Factory getGreeterDsl02Factory();

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
     * The meta object literal for the '{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.ModelImpl
     * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl#getModel()
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
     * The meta object literal for the '{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.PersonImpl
     * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl#getPerson()
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
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

    /**
     * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

    /**
     * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.greeter02.greeterDsl02.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreetingImpl
     * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Word</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__WORD = eINSTANCE.getGreeting_Word();

    /**
     * The meta object literal for the '<em><b>Person</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREETING__PERSON = eINSTANCE.getGreeting_Person();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.greeter02.greeterDsl02.Greetword <em>Greetword</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeter02.greeterDsl02.Greetword
     * @see com.senacor.mdsd.greeter02.greeterDsl02.impl.GreeterDsl02PackageImpl#getGreetword()
     * @generated
     */
    EEnum GREETWORD = eINSTANCE.getGreetword();

  }

} //GreeterDsl02Package
