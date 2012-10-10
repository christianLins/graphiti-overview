/**
 */
package net.jeeeyul.erd.model.erd.impl;

import net.jeeeyul.erd.model.erd.Cardinality;
import net.jeeeyul.erd.model.erd.ErdPackage;
import net.jeeeyul.erd.model.erd.Table;
import net.jeeeyul.erd.model.erd.TableRefererence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Refererence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl#getTargetTable <em>Target Table</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl#getSourceCardinality <em>Source Cardinality</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableRefererenceImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableRefererenceImpl extends MinimalEObjectImpl.Container implements TableRefererence
{
  /**
   * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUuid()
   * @generated
   * @ordered
   */
  protected static final String UUID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUuid()
   * @generated
   * @ordered
   */
  protected String uuid = UUID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTargetTable() <em>Target Table</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetTable()
   * @generated
   * @ordered
   */
  protected Table targetTable;

  /**
   * The default value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceCardinality()
   * @generated
   * @ordered
   */
  protected static final Cardinality SOURCE_CARDINALITY_EDEFAULT = Cardinality.ONE;

  /**
   * The cached value of the '{@link #getSourceCardinality() <em>Source Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceCardinality()
   * @generated
   * @ordered
   */
  protected Cardinality sourceCardinality = SOURCE_CARDINALITY_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetCardinality()
   * @generated
   * @ordered
   */
  protected static final Cardinality TARGET_CARDINALITY_EDEFAULT = Cardinality.MANY;

  /**
   * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetCardinality()
   * @generated
   * @ordered
   */
  protected Cardinality targetCardinality = TARGET_CARDINALITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableRefererenceImpl()
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
    return ErdPackage.Literals.TABLE_REFERERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUuid()
  {
    return uuid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUuid(String newUuid)
  {
    String oldUuid = uuid;
    uuid = newUuid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErdPackage.TABLE_REFERERENCE__UUID, oldUuid, uuid));
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErdPackage.TABLE_REFERERENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table getTargetTable()
  {
    if (targetTable != null && targetTable.eIsProxy())
    {
      InternalEObject oldTargetTable = (InternalEObject)targetTable;
      targetTable = (Table)eResolveProxy(oldTargetTable);
      if (targetTable != oldTargetTable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErdPackage.TABLE_REFERERENCE__TARGET_TABLE, oldTargetTable, targetTable));
      }
    }
    return targetTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table basicGetTargetTable()
  {
    return targetTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetTable(Table newTargetTable, NotificationChain msgs)
  {
    Table oldTargetTable = targetTable;
    targetTable = newTargetTable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErdPackage.TABLE_REFERERENCE__TARGET_TABLE, oldTargetTable, newTargetTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetTable(Table newTargetTable)
  {
    if (newTargetTable != targetTable)
    {
      NotificationChain msgs = null;
      if (targetTable != null)
        msgs = ((InternalEObject)targetTable).eInverseRemove(this, ErdPackage.TABLE__REFEREES, Table.class, msgs);
      if (newTargetTable != null)
        msgs = ((InternalEObject)newTargetTable).eInverseAdd(this, ErdPackage.TABLE__REFEREES, Table.class, msgs);
      msgs = basicSetTargetTable(newTargetTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErdPackage.TABLE_REFERERENCE__TARGET_TABLE, newTargetTable, newTargetTable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality getSourceCardinality()
  {
    return sourceCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceCardinality(Cardinality newSourceCardinality)
  {
    Cardinality oldSourceCardinality = sourceCardinality;
    sourceCardinality = newSourceCardinality == null ? SOURCE_CARDINALITY_EDEFAULT : newSourceCardinality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErdPackage.TABLE_REFERERENCE__SOURCE_CARDINALITY, oldSourceCardinality, sourceCardinality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality getTargetCardinality()
  {
    return targetCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetCardinality(Cardinality newTargetCardinality)
  {
    Cardinality oldTargetCardinality = targetCardinality;
    targetCardinality = newTargetCardinality == null ? TARGET_CARDINALITY_EDEFAULT : newTargetCardinality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ErdPackage.TABLE_REFERERENCE__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ErdPackage.TABLE_REFERERENCE__TARGET_TABLE:
        if (targetTable != null)
          msgs = ((InternalEObject)targetTable).eInverseRemove(this, ErdPackage.TABLE__REFEREES, Table.class, msgs);
        return basicSetTargetTable((Table)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case ErdPackage.TABLE_REFERERENCE__TARGET_TABLE:
        return basicSetTargetTable(null, msgs);
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
      case ErdPackage.TABLE_REFERERENCE__UUID:
        return getUuid();
      case ErdPackage.TABLE_REFERERENCE__NAME:
        return getName();
      case ErdPackage.TABLE_REFERERENCE__TARGET_TABLE:
        if (resolve) return getTargetTable();
        return basicGetTargetTable();
      case ErdPackage.TABLE_REFERERENCE__SOURCE_CARDINALITY:
        return getSourceCardinality();
      case ErdPackage.TABLE_REFERERENCE__TARGET_CARDINALITY:
        return getTargetCardinality();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ErdPackage.TABLE_REFERERENCE__UUID:
        setUuid((String)newValue);
        return;
      case ErdPackage.TABLE_REFERERENCE__NAME:
        setName((String)newValue);
        return;
      case ErdPackage.TABLE_REFERERENCE__TARGET_TABLE:
        setTargetTable((Table)newValue);
        return;
      case ErdPackage.TABLE_REFERERENCE__SOURCE_CARDINALITY:
        setSourceCardinality((Cardinality)newValue);
        return;
      case ErdPackage.TABLE_REFERERENCE__TARGET_CARDINALITY:
        setTargetCardinality((Cardinality)newValue);
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
      case ErdPackage.TABLE_REFERERENCE__UUID:
        setUuid(UUID_EDEFAULT);
        return;
      case ErdPackage.TABLE_REFERERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ErdPackage.TABLE_REFERERENCE__TARGET_TABLE:
        setTargetTable((Table)null);
        return;
      case ErdPackage.TABLE_REFERERENCE__SOURCE_CARDINALITY:
        setSourceCardinality(SOURCE_CARDINALITY_EDEFAULT);
        return;
      case ErdPackage.TABLE_REFERERENCE__TARGET_CARDINALITY:
        setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
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
      case ErdPackage.TABLE_REFERERENCE__UUID:
        return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
      case ErdPackage.TABLE_REFERERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ErdPackage.TABLE_REFERERENCE__TARGET_TABLE:
        return targetTable != null;
      case ErdPackage.TABLE_REFERERENCE__SOURCE_CARDINALITY:
        return sourceCardinality != SOURCE_CARDINALITY_EDEFAULT;
      case ErdPackage.TABLE_REFERERENCE__TARGET_CARDINALITY:
        return targetCardinality != TARGET_CARDINALITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (uuid: ");
    result.append(uuid);
    result.append(", name: ");
    result.append(name);
    result.append(", sourceCardinality: ");
    result.append(sourceCardinality);
    result.append(", targetCardinality: ");
    result.append(targetCardinality);
    result.append(')');
    return result.toString();
  }

} //TableRefererenceImpl
