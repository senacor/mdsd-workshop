/**
 */
package com.senacor.mdsd.greeterDsl01;

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
 * @see com.senacor.mdsd.greeterDsl01.GreeterDsl01Factory
 * @model kind="package"
 * @generated
 */
public interface GreeterDsl01Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "greeterDsl01";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.senacor.com/mdsd/GreeterDsl01";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "greeterDsl01";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GreeterDsl01Package eINSTANCE = com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl.init();

  /**
   * The meta object id for the '{@link com.senacor.mdsd.greeterDsl01.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeterDsl01.impl.ModelImpl
   * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getModel()
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
   * The meta object id for the '{@link com.senacor.mdsd.greeterDsl01.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeterDsl01.impl.GreetingImpl
   * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.greeterDsl01.impl.MyGreetwordImpl <em>My Greetword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeterDsl01.impl.MyGreetwordImpl
   * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getMyGreetword()
   * @generated
   */
  int MY_GREETWORD = 2;

  /**
   * The feature id for the '<em><b>Adressat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_GREETWORD__ADRESSAT = GREETING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>My Greetword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_GREETWORD_FEATURE_COUNT = GREETING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.greeterDsl01.impl.GWImpl <em>GW</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeterDsl01.impl.GWImpl
   * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getGW()
   * @generated
   */
  int GW = 3;

  /**
   * The feature id for the '<em><b>Adressat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GW__ADRESSAT = GREETING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>GW</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GW_FEATURE_COUNT = GREETING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.senacor.mdsd.greeterDsl01.impl.FooImpl <em>Foo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.senacor.mdsd.greeterDsl01.impl.FooImpl
   * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getFoo()
   * @generated
   */
  int FOO = 4;

  /**
   * The feature id for the '<em><b>Adressat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOO__ADRESSAT = MY_GREETWORD__ADRESSAT;

  /**
   * The number of structural features of the '<em>Foo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOO_FEATURE_COUNT = MY_GREETWORD_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.greeterDsl01.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.senacor.mdsd.greeterDsl01.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.senacor.mdsd.greeterDsl01.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see com.senacor.mdsd.greeterDsl01.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.greeterDsl01.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see com.senacor.mdsd.greeterDsl01.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.greeterDsl01.MyGreetword <em>My Greetword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Greetword</em>'.
   * @see com.senacor.mdsd.greeterDsl01.MyGreetword
   * @generated
   */
  EClass getMyGreetword();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.greeterDsl01.GW <em>GW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GW</em>'.
   * @see com.senacor.mdsd.greeterDsl01.GW
   * @generated
   */
  EClass getGW();

  /**
   * Returns the meta object for the attribute '{@link com.senacor.mdsd.greeterDsl01.GW#getAdressat <em>Adressat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adressat</em>'.
   * @see com.senacor.mdsd.greeterDsl01.GW#getAdressat()
   * @see #getGW()
   * @generated
   */
  EAttribute getGW_Adressat();

  /**
   * Returns the meta object for class '{@link com.senacor.mdsd.greeterDsl01.Foo <em>Foo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foo</em>'.
   * @see com.senacor.mdsd.greeterDsl01.Foo
   * @generated
   */
  EClass getFoo();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GreeterDsl01Factory getGreeterDsl01Factory();

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
     * The meta object literal for the '{@link com.senacor.mdsd.greeterDsl01.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeterDsl01.impl.ModelImpl
     * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getModel()
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
     * The meta object literal for the '{@link com.senacor.mdsd.greeterDsl01.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeterDsl01.impl.GreetingImpl
     * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.greeterDsl01.impl.MyGreetwordImpl <em>My Greetword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeterDsl01.impl.MyGreetwordImpl
     * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getMyGreetword()
     * @generated
     */
    EClass MY_GREETWORD = eINSTANCE.getMyGreetword();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.greeterDsl01.impl.GWImpl <em>GW</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeterDsl01.impl.GWImpl
     * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getGW()
     * @generated
     */
    EClass GW = eINSTANCE.getGW();

    /**
     * The meta object literal for the '<em><b>Adressat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GW__ADRESSAT = eINSTANCE.getGW_Adressat();

    /**
     * The meta object literal for the '{@link com.senacor.mdsd.greeterDsl01.impl.FooImpl <em>Foo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.senacor.mdsd.greeterDsl01.impl.FooImpl
     * @see com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01PackageImpl#getFoo()
     * @generated
     */
    EClass FOO = eINSTANCE.getFoo();

  }

} //GreeterDsl01Package
