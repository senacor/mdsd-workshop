/**
 */
package com.senacor.mdsd.greeter03.greeterDsl03.impl;

import com.senacor.mdsd.greeter03.greeterDsl03.*;

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
public class GreeterDsl03FactoryImpl extends EFactoryImpl implements GreeterDsl03Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GreeterDsl03Factory init()
  {
    try
    {
      GreeterDsl03Factory theGreeterDsl03Factory = (GreeterDsl03Factory)EPackage.Registry.INSTANCE.getEFactory(GreeterDsl03Package.eNS_URI);
      if (theGreeterDsl03Factory != null)
      {
        return theGreeterDsl03Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GreeterDsl03FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreeterDsl03FactoryImpl()
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
      case GreeterDsl03Package.MODEL: return createModel();
      case GreeterDsl03Package.GREETING: return createGreeting();
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
  public GreeterDsl03Package getGreeterDsl03Package()
  {
    return (GreeterDsl03Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GreeterDsl03Package getPackage()
  {
    return GreeterDsl03Package.eINSTANCE;
  }

} //GreeterDsl03FactoryImpl
