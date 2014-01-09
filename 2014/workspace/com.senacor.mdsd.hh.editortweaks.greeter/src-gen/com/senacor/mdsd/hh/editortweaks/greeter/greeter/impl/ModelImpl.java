/**
 */
package com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl;

import com.senacor.mdsd.hh.editortweaks.greeter.greeter.GreeterPackage;
import com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting;
import com.senacor.mdsd.hh.editortweaks.greeter.greeter.Model;
import com.senacor.mdsd.hh.editortweaks.greeter.greeter.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.ModelImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link com.senacor.mdsd.hh.editortweaks.greeter.greeter.impl.ModelImpl#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersons()
   * @generated
   * @ordered
   */
  protected EList<Person> persons;

  /**
   * The cached value of the '{@link #getGreetings() <em>Greetings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreetings()
   * @generated
   * @ordered
   */
  protected EList<Greeting> greetings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GreeterPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getPersons()
  {
    if (persons == null)
    {
      persons = new EObjectContainmentEList<Person>(Person.class, this, GreeterPackage.MODEL__PERSONS);
    }
    return persons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Greeting> getGreetings()
  {
    if (greetings == null)
    {
      greetings = new EObjectContainmentEList<Greeting>(Greeting.class, this, GreeterPackage.MODEL__GREETINGS);
    }
    return greetings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GreeterPackage.MODEL__PERSONS:
        return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
      case GreeterPackage.MODEL__GREETINGS:
        return ((InternalEList<?>)getGreetings()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GreeterPackage.MODEL__PERSONS:
        return getPersons();
      case GreeterPackage.MODEL__GREETINGS:
        return getGreetings();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreeterPackage.MODEL__PERSONS:
        getPersons().clear();
        getPersons().addAll((Collection<? extends Person>)newValue);
        return;
      case GreeterPackage.MODEL__GREETINGS:
        getGreetings().clear();
        getGreetings().addAll((Collection<? extends Greeting>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GreeterPackage.MODEL__PERSONS:
        getPersons().clear();
        return;
      case GreeterPackage.MODEL__GREETINGS:
        getGreetings().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GreeterPackage.MODEL__PERSONS:
        return persons != null && !persons.isEmpty();
      case GreeterPackage.MODEL__GREETINGS:
        return greetings != null && !greetings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
