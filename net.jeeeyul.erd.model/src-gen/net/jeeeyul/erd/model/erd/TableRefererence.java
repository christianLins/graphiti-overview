/**
 */
package net.jeeeyul.erd.model.erd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Refererence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.jeeeyul.erd.model.erd.TableRefererence#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.TableRefererence#getName <em>Name</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.TableRefererence#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.TableRefererence#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.TableRefererence#getTargetCardinality <em>Target Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.jeeeyul.erd.model.erd.ErdPackage#getTableRefererence()
 * @model
 * @generated
 */
public interface TableRefererence extends EObject
{
  /**
   * Returns the value of the '<em><b>Uuid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uuid</em>' attribute.
   * @see #setUuid(String)
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTableRefererence_Uuid()
   * @model unique="false" id="true"
   * @generated
   */
  String getUuid();

  /**
   * Sets the value of the '{@link net.jeeeyul.erd.model.erd.TableRefererence#getUuid <em>Uuid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uuid</em>' attribute.
   * @see #getUuid()
   * @generated
   */
  void setUuid(String value);

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
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTableRefererence_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.jeeeyul.erd.model.erd.TableRefererence#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target Table</b></em>' reference.
   * It is bidirectional and its opposite is '{@link net.jeeeyul.erd.model.erd.Table#getReferees <em>Referees</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Table</em>' reference.
   * @see #setTargetTable(Table)
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTableRefererence_TargetTable()
   * @see net.jeeeyul.erd.model.erd.Table#getReferees
   * @model opposite="referees"
   * @generated
   */
  Table getTargetTable();

  /**
   * Sets the value of the '{@link net.jeeeyul.erd.model.erd.TableRefererence#getTargetTable <em>Target Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Table</em>' reference.
   * @see #getTargetTable()
   * @generated
   */
  void setTargetTable(Table value);

  /**
   * Returns the value of the '<em><b>Source Cardinality</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * The literals are from the enumeration {@link net.jeeeyul.erd.model.erd.Cardinality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Cardinality</em>' attribute.
   * @see net.jeeeyul.erd.model.erd.Cardinality
   * @see #setSourceCardinality(Cardinality)
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTableRefererence_SourceCardinality()
   * @model default="1" unique="false"
   * @generated
   */
  Cardinality getSourceCardinality();

  /**
   * Sets the value of the '{@link net.jeeeyul.erd.model.erd.TableRefererence#getSourceCardinality <em>Source Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Cardinality</em>' attribute.
   * @see net.jeeeyul.erd.model.erd.Cardinality
   * @see #getSourceCardinality()
   * @generated
   */
  void setSourceCardinality(Cardinality value);

  /**
   * Returns the value of the '<em><b>Target Cardinality</b></em>' attribute.
   * The default value is <code>"*"</code>.
   * The literals are from the enumeration {@link net.jeeeyul.erd.model.erd.Cardinality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Cardinality</em>' attribute.
   * @see net.jeeeyul.erd.model.erd.Cardinality
   * @see #setTargetCardinality(Cardinality)
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTableRefererence_TargetCardinality()
   * @model default="*" unique="false"
   * @generated
   */
  Cardinality getTargetCardinality();

  /**
   * Sets the value of the '{@link net.jeeeyul.erd.model.erd.TableRefererence#getTargetCardinality <em>Target Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Cardinality</em>' attribute.
   * @see net.jeeeyul.erd.model.erd.Cardinality
   * @see #getTargetCardinality()
   * @generated
   */
  void setTargetCardinality(Cardinality value);

} // TableRefererence
