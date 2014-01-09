/**
 */
package com.senacor.mdsd.greeterDsl01.impl;

import com.senacor.mdsd.greeterDsl01.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreeterDsl01FactoryImpl extends EFactoryImpl implements GreeterDsl01Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GreeterDsl01Factory init()
  {
    try
    {
      GreeterDsl01Factory theGreeterDsl01Factory = (GreeterDsl01Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.senacor.com/mdsd/GreeterDsl01"); 
      if (theGreeterDsl01Factory != null)
      {
        return theGreeterDsl01Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GreeterDsl01FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreeterDsl01FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GreeterDsl01Package.MODEL: return createModel();
      case GreeterDsl01Package.GREETING: return createGreeting();
      case GreeterDsl01Package.MY_GREETWORD: return createMyGreetword();
      case GreeterDsl01Package.GW: return createGW();
      case GreeterDsl01Package.FOO: return createFoo();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyGreetword createMyGreetword()
  {
    MyGreetwordImpl myGreetword = new MyGreetwordImpl();
    return myGreetword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GW createGW()
  {
    GWImpl gw = new GWImpl();
    return gw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foo createFoo()
  {
    FooImpl foo = new FooImpl();
    return foo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreeterDsl01Package getGreeterDsl01Package()
  {
    return (GreeterDsl01Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GreeterDsl01Package getPackage()
  {
    return GreeterDsl01Package.eINSTANCE;
  }

} //GreeterDsl01FactoryImpl
