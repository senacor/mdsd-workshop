/**
 */
package com.senacor.mdsd.greeterDsl01;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.senacor.mdsd.greeterDsl01.GW#getAdressat <em>Adressat</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.senacor.mdsd.greeterDsl01.GreeterDsl01Package#getGW()
 * @model
 * @generated
 */
public interface GW extends Greeting
{
  /**
   * Returns the value of the '<em><b>Adressat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adressat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adressat</em>' attribute.
   * @see #setAdressat(String)
   * @see com.senacor.mdsd.greeterDsl01.GreeterDsl01Package#getGW_Adressat()
   * @model
   * @generated
   */
  String getAdressat();

  /**
   * Sets the value of the '{@link com.senacor.mdsd.greeterDsl01.GW#getAdressat <em>Adressat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adressat</em>' attribute.
   * @see #getAdressat()
   * @generated
   */
  void setAdressat(String value);

} // GW
