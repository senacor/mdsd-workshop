/**
 */
package com.senacor.mdsd.hh.splitgreeter.greeter.greeter;

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
 * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.GreeterFactory
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
  String eNS_URI = "http://www.senacor.com/mdsd/hh/splitgreeter/greeter/Greeter";

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
  GreeterPackage eINSTANCE = com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreeterPackageImpl.init();

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.ModelImpl
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreeterPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreetingImpl
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreeterPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

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
   * The meta object id for the '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword <em>Greetword</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreeterPackageImpl#getGreetword()
   * @generated
   */
  int GREETWORD = 2;


  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting#getGreetword <em>Greetword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Greetword</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting#getGreetword()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_Greetword();

  /**
   * Returns the meta object for the reference '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting#getPerson <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greeting#getPerson()
   * @see #getGreeting()
   * @generated
   */
  EReference getGreeting_Person();

  /**
   * Returns the meta object for enum '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword <em>Greetword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Greetword</em>'.
   * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword
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
     * The meta object literal for the '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.ModelImpl
     * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreeterPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreetingImpl
     * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreeterPackageImpl#getGreeting()
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
     * The meta object literal for the '{@link com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword <em>Greetword</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.Greetword
     * @see com.senacor.mdsd.hh.splitgreeter.greeter.greeter.impl.GreeterPackageImpl#getGreetword()
     * @generated
     */
    EEnum GREETWORD = eINSTANCE.getGreetword();

  }

} //GreeterPackage
