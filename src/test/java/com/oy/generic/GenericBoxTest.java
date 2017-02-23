package com.oy.generic;

/**
 * 泛型类示例
 * @author Administrator
 *
 * @param <T>
 */
public class GenericBoxTest<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public static void main(String[] args) {
		GenericBoxTest<Integer> integerBox = new GenericBoxTest<Integer>();
		integerBox.setT(new Integer(10));
		
		GenericBoxTest<String> stringBox = new GenericBoxTest<String>();
		stringBox.setT(new String("hahaha"));
		
		System.out.println(integerBox.getT());
		System.out.println(stringBox.getT());
	}
	
}
