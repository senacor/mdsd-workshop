/**
 */
package com.senacor.mdsd.greeter02.greeterDsl02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Greetword</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package#getGreetword()
 * @model
 * @generated
 */
public enum Greetword implements Enumerator
{
  /**
   * The '<em><b>DE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DE_VALUE
   * @generated
   * @ordered
   */
  DE(0, "DE", "Hallo"),

  /**
   * The '<em><b>EN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EN_VALUE
   * @generated
   * @ordered
   */
  EN(1, "EN", "Hello"),

  /**
   * The '<em><b>FR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FR_VALUE
   * @generated
   * @ordered
   */
  FR(2, "FR", "Bonjour");

  /**
   * The '<em><b>DE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DE
   * @model literal="Hallo"
   * @generated
   * @ordered
   */
  public static final int DE_VALUE = 0;

  /**
   * The '<em><b>EN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EN
   * @model literal="Hello"
   * @generated
   * @ordered
   */
  public static final int EN_VALUE = 1;

  /**
   * The '<em><b>FR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FR
   * @model literal="Bonjour"
   * @generated
   * @ordered
   */
  public static final int FR_VALUE = 2;

  /**
   * An array of all the '<em><b>Greetword</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Greetword[] VALUES_ARRAY =
    new Greetword[]
    {
      DE,
      EN,
      FR,
    };

  /**
   * A public read-only list of all the '<em><b>Greetword</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Greetword> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Greetword</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Greetword get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Greetword result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Greetword</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Greetword getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Greetword result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Greetword</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Greetword get(int value)
  {
    switch (value)
    {
      case DE_VALUE: return DE;
      case EN_VALUE: return EN;
      case FR_VALUE: return FR;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Greetword(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Greetword
