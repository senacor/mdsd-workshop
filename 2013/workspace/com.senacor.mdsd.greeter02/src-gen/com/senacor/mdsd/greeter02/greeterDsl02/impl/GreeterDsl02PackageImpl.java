/**
 */
package com.senacor.mdsd.greeter02.greeterDsl02.impl;

import com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Factory;
import com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package;
import com.senacor.mdsd.greeter02.greeterDsl02.Greeting;
import com.senacor.mdsd.greeter02.greeterDsl02.Greetword;
import com.senacor.mdsd.greeter02.greeterDsl02.Model;
import com.senacor.mdsd.greeter02.greeterDsl02.Person;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreeterDsl02PackageImpl extends EPackageImpl implements GreeterDsl02Package
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
  private EClass personEClass = null;

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
  private EEnum greetwordEEnum = null;

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
   * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package#eNS_URI
   * @see #init()
   * @generated
   */
  private GreeterDsl02PackageImpl()
  {
    super(eNS_URI, GreeterDsl02Factory.eINSTANCE);
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
   * <p>This method is used to initialize {@link GreeterDsl02Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GreeterDsl02Package init()
  {
    if (isInited) return (GreeterDsl02Package)EPackage.Registry.INSTANCE.getEPackage(GreeterDsl02Package.eNS_URI);

    // Obtain or create and register package
    GreeterDsl02PackageImpl theGreeterDsl02Package = (GreeterDsl02PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GreeterDsl02PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GreeterDsl02PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGreeterDsl02Package.createPackageContents();

    // Initialize created meta-data
    theGreeterDsl02Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGreeterDsl02Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GreeterDsl02Package.eNS_URI, theGreeterDsl02Package);
    return theGreeterDsl02Package;
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
  public EReference getModel_Persons()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Greetings()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerson()
  {
    return personEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_Name()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_Firstname()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_Lastname()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerson_Gender()
  {
    return (EAttribute)personEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getGreeting_Word()
  {
    return (EAttribute)greetingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreeting_Person()
  {
    return (EReference)greetingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGreetword()
  {
    return greetwordEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreeterDsl02Factory getGreeterDsl02Factory()
  {
    return (GreeterDsl02Factory)getEFactoryInstance();
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
    createEReference(modelEClass, MODEL__PERSONS);
    createEReference(modelEClass, MODEL__GREETINGS);

    personEClass = createEClass(PERSON);
    createEAttribute(personEClass, PERSON__NAME);
    createEAttribute(personEClass, PERSON__FIRSTNAME);
    createEAttribute(personEClass, PERSON__LASTNAME);
    createEAttribute(personEClass, PERSON__GENDER);

    greetingEClass = createEClass(GREETING);
    createEAttribute(greetingEClass, GREETING__WORD);
    createEReference(greetingEClass, GREETING__PERSON);

    // Create enums
    greetwordEEnum = createEEnum(GREETWORD);
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

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Persons(), this.getPerson(), null, "persons", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Greetings(), this.getGreeting(), null, "greetings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerson_Gender(), ecorePackage.getEString(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(greetingEClass, Greeting.class, "Greeting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGreeting_Word(), this.getGreetword(), "word", null, 0, 1, Greeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGreeting_Person(), this.getPerson(), null, "person", null, 0, 1, Greeting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(greetwordEEnum, Greetword.class, "Greetword");
    addEEnumLiteral(greetwordEEnum, Greetword.DE);
    addEEnumLiteral(greetwordEEnum, Greetword.EN);
    addEEnumLiteral(greetwordEEnum, Greetword.FR);

    // Create resource
    createResource(eNS_URI);
  }

} //GreeterDsl02PackageImpl
