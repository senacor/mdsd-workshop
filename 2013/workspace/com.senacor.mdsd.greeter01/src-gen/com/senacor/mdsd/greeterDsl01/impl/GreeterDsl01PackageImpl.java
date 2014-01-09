/**
 */
package com.senacor.mdsd.greeterDsl01.impl;

import com.senacor.mdsd.greeterDsl01.Foo;
import com.senacor.mdsd.greeterDsl01.GreeterDsl01Factory;
import com.senacor.mdsd.greeterDsl01.GreeterDsl01Package;
import com.senacor.mdsd.greeterDsl01.Greeting;
import com.senacor.mdsd.greeterDsl01.Model;
import com.senacor.mdsd.greeterDsl01.MyGreetword;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreeterDsl01PackageImpl extends EPackageImpl implements GreeterDsl01Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greetingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myGreetwordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gwEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fooEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.senacor.mdsd.greeterDsl01.GreeterDsl01Package#eNS_URI
   * @see #init()
   * @generated
   */
  private GreeterDsl01PackageImpl()
  {
    super(eNS_URI, GreeterDsl01Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GreeterDsl01Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GreeterDsl01Package init()
  {
    if (isInited) return (GreeterDsl01Package)EPackage.Registry.INSTANCE.getEPackage(GreeterDsl01Package.eNS_URI);

    // Obtain or create and register package
    GreeterDsl01PackageImpl theGreeterDsl01Package = (GreeterDsl01PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GreeterDsl01PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GreeterDsl01PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGreeterDsl01Package.createPackageContents();

    // Initialize created meta-data
    theGreeterDsl01Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGreeterDsl01Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GreeterDsl01Package.eNS_URI, theGreeterDsl01Package);
    return theGreeterDsl01Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Greetings()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreeting()
  {
    return greetingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyGreetword()
  {
    return myGreetwordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGW()
  {
    return gwEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGW_Adressat()
  {
    return (EAttribute)gwEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFoo()
  {
    return fooEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreeterDsl01Factory getGreeterDsl01Factory()
  {
    return (GreeterDsl01Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__GREETINGS);

    greetingEClass = createEClass(GREETING);

    myGreetwordEClass = createEClass(MY_GREETWORD);

    gwEClass = createEClass(GW);
    createEAttribute(gwEClass, GW__ADRESSAT);

    fooEClass = createEClass(FOO);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    myGreetwordEClass.getESuperTypes().add(this.getGreeting());
    myGreetwordEClass.getESuperTypes().add(this.getGW());
    gwEClass.getESuperTypes().add(this.getGreeting());
    fooEClass.getESuperTypes().add(this.getMyGreetword());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Greetings(), this.getGreeting(), null, "greetings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(greetingEClass, Greeting.class, "Greeting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(myGreetwordEClass, MyGreetword.class, "MyGreetword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gwEClass, com.senacor.mdsd.greeterDsl01.GW.class, "GW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGW_Adressat(), ecorePackage.getEString(), "adressat", null, 0, 1, com.senacor.mdsd.greeterDsl01.GW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fooEClass, Foo.class, "Foo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //GreeterDsl01PackageImpl
