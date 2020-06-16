/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.xmodel.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.xmodel.xModel.XClass;
import org.xtext.example.xmodel.xModel.Operation;
import org.xtext.example.xmodel.xModel.Parameter;
import org.xtext.example.xmodel.xModel.Property;
import org.xtext.example.xmodel.xModel.XModelPackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class XModelValidator extends AbstractXModelValidator {

 public static final String INVALID_CLASS_NAME = 'invalidClassName';
 public static final String INVALID_PROPERTY_NAME = 'invalidPropertyName';
 public static final String CLASS_NAME_EMPTY = "ClassNameEmpty";
 public static final String PROPERTY_NAME_EMPTY = "PropertyNameEmpty";
 public static final String OPERATION_NAME_EMPTY = "OperationNameEmpty";
 public static final String PARAMETER_NAME_EMPTY = "ParameterNameEmpty";

 /**
  * @author 斐雅琴
  * @description 验证实例类名是否以大写字母开头
  * @since 2020/6/2
 **/
 @Check
 def checkClassStartsWithCapital(XClass classes) {
  if (!Character.isUpperCase(classes.name.charAt(0))) {
   warning('Name should start with a capital!', 
     XModelPackage.Literals.XCLASS__NAME,
     INVALID_CLASS_NAME)
  }
 }


 /**
  * @author 斐雅琴
  * @description 验证变量是否以小写字母开头
  * @since 2020/6/6
 **/
 @Check
 def checkPropertyStartsWithLowercase(Property pro) {
  if (!Character.isLowerCase(pro.name.charAt(0))) {
   warning('Name should start with a lowercase!', 
     XModelPackage.Literals.PROPERTY__NAME,
     INVALID_PROPERTY_NAME)
  }
 }

 /**
  * @author 斐雅琴
  * @description 验证实例类名是否为空
  * @since 2020/6/2
 **/
 @Check
 def checkClassNameIsNotEmpty(XClass classes) {
  if(classes.getName().isEmpty()) {
   error("类名不可为空: ClassName cannot be empty!",
     XModelPackage.Literals.XCLASS__NAME,
     CLASS_NAME_EMPTY);
  }
 }
 
 /**
  * @author 斐雅琴
  * @description 验证变量名是否为空
  * @since 2020/6/2
 **/
 @Check
 def checkPropertyNameIsNotEmpty(Property pro) {
  if(pro.getName().isEmpty()) {
   error("变量名不可为空: Property Name cannot be empty!",
     XModelPackage.Literals.PROPERTY__NAME,
     PROPERTY_NAME_EMPTY);
  }
 }
 
 /**
  * @author 斐雅琴
  * @description 验证函数名是否为空
  * @since 2020/6/2
 **/
 @Check
 def checkOperationNameIsNotEmpty(Operation op) {
  if(op.getName().isEmpty()) {
   error("函数名不可为空: Operation Name cannot be empty!",
     XModelPackage.Literals.OPERATION__NAME,
     OPERATION_NAME_EMPTY);
  }
 }
 
 /**
  * @author 斐雅琴
  * @description 验证参数名是否为空
  * @since 2020/6/2
 **/
 @Check
 def checkParameterNameIsNotEmpty(Parameter pa) {
  if(pa.getName().isEmpty()) {
   error("变量名不可为空: Parameter Name cannot be empty!",
     XModelPackage.Literals.PARAMETER__NAME,
     PARAMETER_NAME_EMPTY);
  }
 }
 
 
}