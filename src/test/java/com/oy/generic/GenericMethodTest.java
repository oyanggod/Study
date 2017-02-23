package com.oy.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
    所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
    每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
    类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
    泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）。

 * @author Administrator
 *
 */
public class GenericMethodTest {
	public static <T> void printArray(T[] array){
		for (T str : array) {
			System.out.printf("%s ", str);
		}
		System.out.println();
	}
	
	/**
	 * ? 类型通配符
	 * @param data
	 */
	public static void getData(List<?> data){
		System.out.println("data:"+data.get(0));
	}
	
	/**
	 * 类型通配符下限通过形如 List<? super Number>来定义，表示类型只能接受Number及其三层父类类型，如Objec类型的实例
	 * @param data
	 */
	public static void getNumberData(List<? extends Number> data){
		System.out.println("data:"+data.get(0));
	}
	
	public static void main(String[] args) {
		String[] array1 = {"1","2","3"};
		printArray(array1);
		
		Integer[] array2 = {11, 22, 33};
		printArray(array2);
		
		Character[] array3 = {'H', 'E', 'L', 'L', 'O'};
		printArray(array3);
		
		
		//类型通配符
		List<String> list1 = new ArrayList<String>();
		list1.add("hahaha");
		
		List<Number> list2 = new ArrayList<Number>();
		list2.add(100);
		
		getData(list1);
		getData(list2);
		
//		getNumberData(list1);
		getNumberData(list2);
		
	}
}
