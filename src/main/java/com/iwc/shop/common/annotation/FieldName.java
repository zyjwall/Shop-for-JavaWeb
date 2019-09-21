package com.iwc.shop.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * bean中文名注解
 */

// @Target：

// 　　　@Target说明了Annotation所修饰的对象范围：Annotation可被用于 packages、types（类、接口、枚举、Annotation类型）、类型成员（方法、构造方法、成员变量、枚举值）、方法参数和本地变量（如循环变量、catch参数）。在Annotation类型的声明中使用了target可更加明晰其修饰的目标。

// 　　作用：用于描述注解的使用范围（即：被描述的注解可以用在什么地方）

// 　　取值(ElementType)有：

// 　　　　1.CONSTRUCTOR:用于描述构造器
// 　　　　2.FIELD:用于描述域
// 　　　　3.LOCAL_VARIABLE:用于描述局部变量
// 　　　　4.METHOD:用于描述方法
// 　　　　5.PACKAGE:用于描述包
// 　　　　6.PARAMETER:用于描述参数
// 　　　　7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
//https://www.cnblogs.com/gmq-sh/p/4798194.html
@Target(ElementType.METHOD)  
@Retention(RetentionPolicy.RUNTIME)  

//　　使用@interface自定义注解时，自动继承了java.lang.annotation.Annotation接口，由编译程序自动完成其他细节。在定义注解时，不能继承其他的注解或接口。@interface用来声明一个注解，其中的每一个方法实际上是声明了一个配置参数。方法的名称就是参数的名称，返回值类型就是参数的类型（返回值类型只能是基本类型、Class、String、enum）。可以通过default来声明参数的默认值。

// 　　定义注解格式：
// 　　public @interface 注解名 {定义体}

// 　　注解参数的可支持数据类型：

// 　　　　1.所有基本数据类型（int,float,boolean,byte,double,char,long,short)
// 　　　　2.String类型
// 　　　　3.Class类型
// 　　　　4.enum类型
// 　　　　5.Annotation类型
// 　　　　6.以上所有类型的数组
public @interface FieldName {

	String value();
	
}
