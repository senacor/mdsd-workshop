/**
 */
package com.senacor.mdsd.greeterDsl01;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.senacor.mdsd.greeterDsl01.GreeterDsl01Package
 * @generated
 */
public interface GreeterDsl01Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GreeterDsl01Factory eINSTANCE = com.senacor.mdsd.greeterDsl01.impl.GreeterDsl01FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Greeting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greeting</em>'.
   * @generated
   */
  Greeting createGreeting();

  /**
   * Returns a new object of class '<em>My Greetword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Greetword</em>'.
   * @generated
   */
  MyGreetword createMyGreetword();

  /**
   * Returns a new object of class '<em>GW</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GW</em>'.
   * @generated
   */
  GW createGW();

  /**
   * Returns a new object of class '<em>Foo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foo</em>'.
   * @generated
   */
  Foo createFoo();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GreeterDsl01Package getGreeterDsl01Package();

} //GreeterDsl01Factory
