/**
 */
package net.jeeeyul.erd.model.erd.impl;

import java.util.Collection;

import net.jeeeyul.erd.model.erd.Column;
import net.jeeeyul.erd.model.erd.ErdPackage;
import net.jeeeyul.erd.model.erd.Table;
import net.jeeeyul.erd.model.erd.TableRefererence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableImpl#getReferences <em>References</em>}</li>
 *   <li>{@link net.jeeeyul.erd.model.erd.impl.TableImpl#getReferees <em>Referees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table
{
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
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column> columns;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<TableRefererence> references;

  /**
   * The cached value of the '{@link #getReferees() <em>Referees</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferees()
   * @generated
   * @ordered
   */
  protected EList<TableRefererence> referees;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableImpl()
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
    return ErdPackage.Literals.TABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ErdPackage.TABLE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ErdPackage.TABLE__UUID, oldUuid, uuid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<Column>(Column.class, this, ErdPackage.TABLE__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableRefererence> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<TableRefererence>(TableRefererence.class, this, ErdPackage.TABLE__REFERENCES);
    }
    return references;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableRefererence> getReferees()
  {
    if (referees == null)
    {
      referees = new EObjectWithInverseResolvingEList<TableRefererence>(TableRefererence.class, this, ErdPackage.TABLE__REFEREES, ErdPackage.TABLE_REFERERENCE__TARGET_TABLE);
    }
    return referees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ErdPackage.TABLE__REFEREES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferees()).basicAdd(otherEnd, msgs);
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
      case ErdPackage.TABLE__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case ErdPackage.TABLE__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
      case ErdPackage.TABLE__REFEREES:
        return ((InternalEList<?>)getReferees()).basicRemove(otherEnd, msgs);
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
      case ErdPackage.TABLE__NAME:
        return getName();
      case ErdPackage.TABLE__UUID:
        return getUuid();
      case ErdPackage.TABLE__COLUMNS:
        return getColumns();
      case ErdPackage.TABLE__REFERENCES:
        return getReferences();
      case ErdPackage.TABLE__REFEREES:
        return getReferees();
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
      case ErdPackage.TABLE__NAME:
        setName((String)newValue);
        return;
      case ErdPackage.TABLE__UUID:
        setUuid((String)newValue);
        return;
      case ErdPackage.TABLE__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
      case ErdPackage.TABLE__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends TableRefererence>)newValue);
        return;
      case ErdPackage.TABLE__REFEREES:
        getReferees().clear();
        getReferees().addAll((Collection<? extends TableRefererence>)newValue);
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
      case ErdPackage.TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ErdPackage.TABLE__UUID:
        setUuid(UUID_EDEFAULT);
        return;
      case ErdPackage.TABLE__COLUMNS:
        getColumns().clear();
        return;
      case ErdPackage.TABLE__REFERENCES:
        getReferences().clear();
        return;
      case ErdPackage.TABLE__REFEREES:
        getReferees().clear();
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
      case ErdPackage.TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ErdPackage.TABLE__UUID:
        return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
      case ErdPackage.TABLE__COLUMNS:
        return columns != null && !columns.isEmpty();
      case ErdPackage.TABLE__REFERENCES:
        return references != null && !references.isEmpty();
      case ErdPackage.TABLE__REFEREES:
        return referees != null && !referees.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", uuid: ");
    result.append(uuid);
    result.append(')');
    return result.toString();
  }

} //TableImpl
