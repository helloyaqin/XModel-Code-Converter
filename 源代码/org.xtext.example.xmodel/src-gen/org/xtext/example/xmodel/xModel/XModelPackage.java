/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.xmodel.xModel;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.xmodel.xModel.XModelFactory
 * @model kind="package"
 * @generated
 */
public interface XModelPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "xModel";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.xtext.org/example/xmodel/XModel";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "xModel";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  XModelPackage eINSTANCE = org.xtext.example.xmodel.xModel.impl.XModelPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.xtext.example.xmodel.xModel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.example.xmodel.xModel.impl.PackageImpl
	 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getPackage()
	 * @generated
	 */
  int PACKAGE = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PACKAGE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PACKAGE__CLASS = 1;

  /**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PACKAGE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.xtext.example.xmodel.xModel.impl.XClassImpl <em>XClass</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.example.xmodel.xModel.impl.XClassImpl
	 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getXClass()
	 * @generated
	 */
  int XCLASS = 1;

  /**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int XCLASS__IS_ABSTRACT = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int XCLASS__NAME = 1;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int XCLASS__DESCRIPTION = 2;

  /**
	 * The feature id for the '<em><b>Extend</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int XCLASS__EXTEND = 3;

  /**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int XCLASS__PROPERTY = 4;

  /**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int XCLASS__OPERATION = 5;

  /**
	 * The number of structural features of the '<em>XClass</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int XCLASS_FEATURE_COUNT = 6;

  /**
	 * The meta object id for the '{@link org.xtext.example.xmodel.xModel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.example.xmodel.xModel.impl.PropertyImpl
	 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getProperty()
	 * @generated
	 */
  int PROPERTY = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY__VISIBILITY = 2;

  /**
	 * The feature id for the '<em><b>Xtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY__XTYPE = 3;

  /**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PROPERTY_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.xtext.example.xmodel.xModel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.example.xmodel.xModel.impl.OperationImpl
	 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getOperation()
	 * @generated
	 */
  int OPERATION = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION__NAME = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION__DESCRIPTION = 1;

  /**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION__VISIBILITY = 2;

  /**
	 * The feature id for the '<em><b>Xtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION__XTYPE = 3;

  /**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION__PARAMETER = 4;

  /**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int OPERATION_FEATURE_COUNT = 5;

  /**
	 * The meta object id for the '{@link org.xtext.example.xmodel.xModel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.example.xmodel.xModel.impl.ParameterImpl
	 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getParameter()
	 * @generated
	 */
  int PARAMETER = 4;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER__NAME = 0;

  /**
	 * The feature id for the '<em><b>Xtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER__XTYPE = 1;

  /**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.xtext.example.xmodel.xModel.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.example.xmodel.xModel.Visibility
	 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getVisibility()
	 * @generated
	 */
  int VISIBILITY = 5;

  /**
	 * The meta object id for the '{@link org.xtext.example.xmodel.xModel.XType <em>XType</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.example.xmodel.xModel.XType
	 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getXType()
	 * @generated
	 */
  int XTYPE = 6;


  /**
	 * Returns the meta object for class '{@link org.xtext.example.xmodel.xModel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.xtext.example.xmodel.xModel.Package
	 * @generated
	 */
  EClass getPackage();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.example.xmodel.xModel.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
  EAttribute getPackage_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.xmodel.xModel.Package#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see org.xtext.example.xmodel.xModel.Package#getClass_()
	 * @see #getPackage()
	 * @generated
	 */
  EReference getPackage_Class();

  /**
	 * Returns the meta object for class '{@link org.xtext.example.xmodel.xModel.XClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XClass</em>'.
	 * @see org.xtext.example.xmodel.xModel.XClass
	 * @generated
	 */
  EClass getXClass();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.XClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.xtext.example.xmodel.xModel.XClass#isIsAbstract()
	 * @see #getXClass()
	 * @generated
	 */
  EAttribute getXClass_IsAbstract();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.XClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.example.xmodel.xModel.XClass#getName()
	 * @see #getXClass()
	 * @generated
	 */
  EAttribute getXClass_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.XClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.example.xmodel.xModel.XClass#getDescription()
	 * @see #getXClass()
	 * @generated
	 */
  EAttribute getXClass_Description();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.XClass#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extend</em>'.
	 * @see org.xtext.example.xmodel.xModel.XClass#getExtend()
	 * @see #getXClass()
	 * @generated
	 */
  EAttribute getXClass_Extend();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.xmodel.xModel.XClass#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.xtext.example.xmodel.xModel.XClass#getProperty()
	 * @see #getXClass()
	 * @generated
	 */
  EReference getXClass_Property();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.xmodel.xModel.XClass#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.xtext.example.xmodel.xModel.XClass#getOperation()
	 * @see #getXClass()
	 * @generated
	 */
  EReference getXClass_Operation();

  /**
	 * Returns the meta object for class '{@link org.xtext.example.xmodel.xModel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.xtext.example.xmodel.xModel.Property
	 * @generated
	 */
  EClass getProperty();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.example.xmodel.xModel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
  EAttribute getProperty_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.example.xmodel.xModel.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
  EAttribute getProperty_Description();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Property#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.xtext.example.xmodel.xModel.Property#getVisibility()
	 * @see #getProperty()
	 * @generated
	 */
  EAttribute getProperty_Visibility();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Property#getXtype <em>Xtype</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xtype</em>'.
	 * @see org.xtext.example.xmodel.xModel.Property#getXtype()
	 * @see #getProperty()
	 * @generated
	 */
  EAttribute getProperty_Xtype();

  /**
	 * Returns the meta object for class '{@link org.xtext.example.xmodel.xModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.xtext.example.xmodel.xModel.Operation
	 * @generated
	 */
  EClass getOperation();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.example.xmodel.xModel.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
  EAttribute getOperation_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Operation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.xtext.example.xmodel.xModel.Operation#getDescription()
	 * @see #getOperation()
	 * @generated
	 */
  EAttribute getOperation_Description();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Operation#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.xtext.example.xmodel.xModel.Operation#getVisibility()
	 * @see #getOperation()
	 * @generated
	 */
  EAttribute getOperation_Visibility();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Operation#getXtype <em>Xtype</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xtype</em>'.
	 * @see org.xtext.example.xmodel.xModel.Operation#getXtype()
	 * @see #getOperation()
	 * @generated
	 */
  EAttribute getOperation_Xtype();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.example.xmodel.xModel.Operation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.xtext.example.xmodel.xModel.Operation#getParameter()
	 * @see #getOperation()
	 * @generated
	 */
  EReference getOperation_Parameter();

  /**
	 * Returns the meta object for class '{@link org.xtext.example.xmodel.xModel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.xtext.example.xmodel.xModel.Parameter
	 * @generated
	 */
  EClass getParameter();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.example.xmodel.xModel.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
  EAttribute getParameter_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.example.xmodel.xModel.Parameter#getXtype <em>Xtype</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xtype</em>'.
	 * @see org.xtext.example.xmodel.xModel.Parameter#getXtype()
	 * @see #getParameter()
	 * @generated
	 */
  EAttribute getParameter_Xtype();

  /**
	 * Returns the meta object for enum '{@link org.xtext.example.xmodel.xModel.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.xtext.example.xmodel.xModel.Visibility
	 * @generated
	 */
  EEnum getVisibility();

  /**
	 * Returns the meta object for enum '{@link org.xtext.example.xmodel.xModel.XType <em>XType</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XType</em>'.
	 * @see org.xtext.example.xmodel.xModel.XType
	 * @generated
	 */
  EEnum getXType();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  XModelFactory getXModelFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.xtext.example.xmodel.xModel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.example.xmodel.xModel.impl.PackageImpl
		 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getPackage()
		 * @generated
		 */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference PACKAGE__CLASS = eINSTANCE.getPackage_Class();

    /**
		 * The meta object literal for the '{@link org.xtext.example.xmodel.xModel.impl.XClassImpl <em>XClass</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.example.xmodel.xModel.impl.XClassImpl
		 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getXClass()
		 * @generated
		 */
    EClass XCLASS = eINSTANCE.getXClass();

    /**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute XCLASS__IS_ABSTRACT = eINSTANCE.getXClass_IsAbstract();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute XCLASS__NAME = eINSTANCE.getXClass_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute XCLASS__DESCRIPTION = eINSTANCE.getXClass_Description();

    /**
		 * The meta object literal for the '<em><b>Extend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute XCLASS__EXTEND = eINSTANCE.getXClass_Extend();

    /**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference XCLASS__PROPERTY = eINSTANCE.getXClass_Property();

    /**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference XCLASS__OPERATION = eINSTANCE.getXClass_Operation();

    /**
		 * The meta object literal for the '{@link org.xtext.example.xmodel.xModel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.example.xmodel.xModel.impl.PropertyImpl
		 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getProperty()
		 * @generated
		 */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROPERTY__VISIBILITY = eINSTANCE.getProperty_Visibility();

    /**
		 * The meta object literal for the '<em><b>Xtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PROPERTY__XTYPE = eINSTANCE.getProperty_Xtype();

    /**
		 * The meta object literal for the '{@link org.xtext.example.xmodel.xModel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.example.xmodel.xModel.impl.OperationImpl
		 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getOperation()
		 * @generated
		 */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OPERATION__DESCRIPTION = eINSTANCE.getOperation_Description();

    /**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OPERATION__VISIBILITY = eINSTANCE.getOperation_Visibility();

    /**
		 * The meta object literal for the '<em><b>Xtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute OPERATION__XTYPE = eINSTANCE.getOperation_Xtype();

    /**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference OPERATION__PARAMETER = eINSTANCE.getOperation_Parameter();

    /**
		 * The meta object literal for the '{@link org.xtext.example.xmodel.xModel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.example.xmodel.xModel.impl.ParameterImpl
		 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getParameter()
		 * @generated
		 */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
		 * The meta object literal for the '<em><b>Xtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PARAMETER__XTYPE = eINSTANCE.getParameter_Xtype();

    /**
		 * The meta object literal for the '{@link org.xtext.example.xmodel.xModel.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.example.xmodel.xModel.Visibility
		 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getVisibility()
		 * @generated
		 */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

    /**
		 * The meta object literal for the '{@link org.xtext.example.xmodel.xModel.XType <em>XType</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.example.xmodel.xModel.XType
		 * @see org.xtext.example.xmodel.xModel.impl.XModelPackageImpl#getXType()
		 * @generated
		 */
    EEnum XTYPE = eINSTANCE.getXType();

  }

} //XModelPackage
