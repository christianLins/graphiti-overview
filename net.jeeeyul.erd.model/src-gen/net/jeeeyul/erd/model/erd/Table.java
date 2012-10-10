/**
 */
package net.jeeeyul.erd.model.erd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.jeeeyul.erd.model.erd.Table#getName <em>Name</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.Table#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.Table#getReferences <em>References</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.Table#getReferees <em>Referees</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.jeeeyul.erd.model.erd.ErdPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
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
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTable_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.jeeeyul.erd.model.erd.Table#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTable_Uuid()
   * @model unique="false" id="true"
   * @generated
   */
  String getUuid();

  /**
   * Sets the value of the '{@link net.jeeeyul.erd.model.erd.Table#getUuid <em>Uuid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uuid</em>' attribute.
   * @see #getUuid()
   * @generated
   */
  void setUuid(String value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link net.jeeeyul.erd.model.erd.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTable_Columns()
   * @model containment="true"
   * @generated
   */
  EList<Column> getColumns();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link net.jeeeyul.erd.model.erd.TableRefererence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTable_References()
   * @model containment="true"
   * @generated
   */
  EList<TableRefererence> getReferences();

  /**
   * Returns the value of the '<em><b>Referees</b></em>' reference list.
   * The list contents are of type {@link net.jeeeyul.erd.model.erd.TableRefererence}.
   * It is bidirectional and its opposite is '{@link net.jeeeyul.erd.model.erd.TableRefererence#getTargetTable <em>Target Table</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referees</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referees</em>' reference list.
   * @see net.jeeeyul.erd.model.erd.ErdPackage#getTable_Referees()
   * @see net.jeeeyul.erd.model.erd.TableRefererence#getTargetTable
   * @model opposite="targetTable"
   * @generated
   */
  EList<TableRefererence> getReferees();

} // Table
