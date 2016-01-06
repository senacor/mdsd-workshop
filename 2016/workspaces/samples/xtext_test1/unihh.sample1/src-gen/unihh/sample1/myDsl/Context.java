/**
 * generated by Xtext 2.9.0
 */
package unihh.sample1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unihh.sample1.myDsl.Context#getName <em>Name</em>}</li>
 *   <li>{@link unihh.sample1.myDsl.Context#getAggregates <em>Aggregates</em>}</li>
 * </ul>
 *
 * @see unihh.sample1.myDsl.MyDslPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see unihh.sample1.myDsl.MyDslPackage#getContext_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link unihh.sample1.myDsl.Context#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Aggregates</b></em>' reference list.
   * The list contents are of type {@link unihh.sample1.myDsl.Aggregate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregates</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregates</em>' reference list.
   * @see unihh.sample1.myDsl.MyDslPackage#getContext_Aggregates()
   * @model
   * @generated
   */
  EList<Aggregate> getAggregates();

} // Context
