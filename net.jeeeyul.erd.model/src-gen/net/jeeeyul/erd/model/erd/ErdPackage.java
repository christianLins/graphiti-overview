/**
 */
package net.jeeeyul.erd.model.erd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.jeeeyul.erd.model.erd.ErdFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore nsPrifix='e'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='net.jeeeyul.erd.model'"
 * @generated
 */
public interface ErdPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "erd";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://jeeeyul.net/erd";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "erd";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ErdPackage eINSTANCE = net.jeeeyul.erd.model.erd.impl.ErdPackageImpl.init();

  /**
   * The meta object id for the '{@link net.jeeeyul.erd.model.erd.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.jeeeyul.erd.model.erd.impl.TableImpl
   * @see net.jeeeyul.erd.model.erd.impl.ErdPackageImpl#getTable()
   * @generated
   */
  int TABLE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Uuid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__UUID = 1;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLUMNS = 2;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__REFERENCES = 3;

  /**
   * The feature id for the '<em><b>Referees</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__REFEREES = 4;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl <em>Table Refererence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl
   * @see net.jeeeyul.erd.model.erd.impl.ErdPackageImpl#getTableRefererence()
   * @generated
   */
  int TABLE_REFERERENCE = 1;

  /**
   * The feature id for the '<em><b>Uuid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFERERENCE__UUID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFERERENCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Target Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFERERENCE__TARGET_TABLE = 2;

  /**
   * The feature id for the '<em><b>Source Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFERERENCE__SOURCE_CARDINALITY = 3;

  /**
   * The feature id for the '<em><b>Target Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFERERENCE__TARGET_CARDINALITY = 4;

  /**
   * The number of structural features of the '<em>Table Refererence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFERERENCE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Table Refererence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_REFERERENCE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link net.jeeeyul.erd.model.erd.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.jeeeyul.erd.model.erd.impl.ColumnImpl
   * @see net.jeeeyul.erd.model.erd.impl.ErdPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 2;

  /**
   * The feature id for the '<em><b>Uuid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__UUID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 1;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link net.jeeeyul.erd.model.erd.Cardinality <em>Cardinality</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.jeeeyul.erd.model.erd.Cardinality
   * @see net.jeeeyul.erd.model.erd.impl.ErdPackageImpl#getCardinality()
   * @generated
   */
  int CARDINALITY = 3;


  /**
   * Returns the meta object for class '{@link net.jeeeyul.erd.model.erd.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see net.jeeeyul.erd.model.erd.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.erd.model.erd.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.jeeeyul.erd.model.erd.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.erd.model.erd.Table#getUuid <em>Uuid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uuid</em>'.
   * @see net.jeeeyul.erd.model.erd.Table#getUuid()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Uuid();

  /**
   * Returns the meta object for the containment reference list '{@link net.jeeeyul.erd.model.erd.Table#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Columns</em>'.
   * @see net.jeeeyul.erd.model.erd.Table#getColumns()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Columns();

  /**
   * Returns the meta object for the containment reference list '{@link net.jeeeyul.erd.model.erd.Table#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see net.jeeeyul.erd.model.erd.Table#getReferences()
   * @see #getTable()
   * @generated
   */
  EReference getTable_References();

  /**
   * Returns the meta object for the reference list '{@link net.jeeeyul.erd.model.erd.Table#getReferees <em>Referees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Referees</em>'.
   * @see net.jeeeyul.erd.model.erd.Table#getReferees()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Referees();

  /**
   * Returns the meta object for class '{@link net.jeeeyul.erd.model.erd.TableRefererence <em>Table Refererence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Refererence</em>'.
   * @see net.jeeeyul.erd.model.erd.TableRefererence
   * @generated
   */
  EClass getTableRefererence();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.erd.model.erd.TableRefererence#getUuid <em>Uuid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uuid</em>'.
   * @see net.jeeeyul.erd.model.erd.TableRefererence#getUuid()
   * @see #getTableRefererence()
   * @generated
   */
  EAttribute getTableRefererence_Uuid();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.erd.model.erd.TableRefererence#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.jeeeyul.erd.model.erd.TableRefererence#getName()
   * @see #getTableRefererence()
   * @generated
   */
  EAttribute getTableRefererence_Name();

  /**
   * Returns the meta object for the reference '{@link net.jeeeyul.erd.model.erd.TableRefererence#getTargetTable <em>Target Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Table</em>'.
   * @see net.jeeeyul.erd.model.erd.TableRefererence#getTargetTable()
   * @see #getTableRefererence()
   * @generated
   */
  EReference getTableRefererence_TargetTable();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.erd.model.erd.TableRefererence#getSourceCardinality <em>Source Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Cardinality</em>'.
   * @see net.jeeeyul.erd.model.erd.TableRefererence#getSourceCardinality()
   * @see #getTableRefererence()
   * @generated
   */
  EAttribute getTableRefererence_SourceCardinality();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.erd.model.erd.TableRefererence#getTargetCardinality <em>Target Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Cardinality</em>'.
   * @see net.jeeeyul.erd.model.erd.TableRefererence#getTargetCardinality()
   * @see #getTableRefererence()
   * @generated
   */
  EAttribute getTableRefererence_TargetCardinality();

  /**
   * Returns the meta object for class '{@link net.jeeeyul.erd.model.erd.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see net.jeeeyul.erd.model.erd.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.erd.model.erd.Column#getUuid <em>Uuid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uuid</em>'.
   * @see net.jeeeyul.erd.model.erd.Column#getUuid()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Uuid();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.erd.model.erd.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.jeeeyul.erd.model.erd.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for enum '{@link net.jeeeyul.erd.model.erd.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cardinality</em>'.
   * @see net.jeeeyul.erd.model.erd.Cardinality
   * @generated
   */
  EEnum getCardinality();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ErdFactory getErdFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.jeeeyul.erd.model.erd.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.jeeeyul.erd.model.erd.impl.TableImpl
     * @see net.jeeeyul.erd.model.erd.impl.ErdPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__UUID = eINSTANCE.getTable_Uuid();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__REFERENCES = eINSTANCE.getTable_References();

    /**
     * The meta object literal for the '<em><b>Referees</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__REFEREES = eINSTANCE.getTable_Referees();

    /**
     * The meta object literal for the '{@link net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl <em>Table Refererence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl
     * @see net.jeeeyul.erd.model.erd.impl.ErdPackageImpl#getTableRefererence()
     * @generated
     */
    EClass TABLE_REFERERENCE = eINSTANCE.getTableRefererence();

    /**
     * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_REFERERENCE__UUID = eINSTANCE.getTableRefererence_Uuid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_REFERERENCE__NAME = eINSTANCE.getTableRefererence_Name();

    /**
     * The meta object literal for the '<em><b>Target Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_REFERERENCE__TARGET_TABLE = eINSTANCE.getTableRefererence_TargetTable();

    /**
     * The meta object literal for the '<em><b>Source Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_REFERERENCE__SOURCE_CARDINALITY = eINSTANCE.getTableRefererence_SourceCardinality();

    /**
     * The meta object literal for the '<em><b>Target Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_REFERERENCE__TARGET_CARDINALITY = eINSTANCE.getTableRefererence_TargetCardinality();

    /**
     * The meta object literal for the '{@link net.jeeeyul.erd.model.erd.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.jeeeyul.erd.model.erd.impl.ColumnImpl
     * @see net.jeeeyul.erd.model.erd.impl.ErdPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__UUID = eINSTANCE.getColumn_Uuid();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '{@link net.jeeeyul.erd.model.erd.Cardinality <em>Cardinality</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.jeeeyul.erd.model.erd.Cardinality
     * @see net.jeeeyul.erd.model.erd.impl.ErdPackageImpl#getCardinality()
     * @generated
     */
    EEnum CARDINALITY = eINSTANCE.getCardinality();

  }

} //ErdPackage
