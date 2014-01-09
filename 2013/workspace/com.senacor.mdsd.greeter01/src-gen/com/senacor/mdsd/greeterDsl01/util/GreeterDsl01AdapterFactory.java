/**
 */
package com.senacor.mdsd.greeterDsl01.util;

import com.senacor.mdsd.greeterDsl01.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.senacor.mdsd.greeterDsl01.GreeterDsl01Package
 * @generated
 */
public class GreeterDsl01AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GreeterDsl01Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GreeterDsl01AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GreeterDsl01Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GreeterDsl01Switch<Adapter> modelSwitch =
    new GreeterDsl01Switch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseGreeting(Greeting object)
      {
        return createGreetingAdapter();
      }
      @Override
      public Adapter caseMyGreetword(MyGreetword object)
      {
        return createMyGreetwordAdapter();
      }
      @Override
      public Adapter caseGW(GW object)
      {
        return createGWAdapter();
      }
      @Override
      public Adapter caseFoo(Foo object)
      {
        return createFooAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.senacor.mdsd.greeterDsl01.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.senacor.mdsd.greeterDsl01.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.senacor.mdsd.greeterDsl01.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.senacor.mdsd.greeterDsl01.Greeting
   * @generated
   */
  public Adapter createGreetingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.senacor.mdsd.greeterDsl01.MyGreetword <em>My Greetword</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.senacor.mdsd.greeterDsl01.MyGreetword
   * @generated
   */
  public Adapter createMyGreetwordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.senacor.mdsd.greeterDsl01.GW <em>GW</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.senacor.mdsd.greeterDsl01.GW
   * @generated
   */
  public Adapter createGWAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.senacor.mdsd.greeterDsl01.Foo <em>Foo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.senacor.mdsd.greeterDsl01.Foo
   * @generated
   */
  public Adapter createFooAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GreeterDsl01AdapterFactory
