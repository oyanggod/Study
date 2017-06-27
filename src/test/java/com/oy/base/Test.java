package com.oy.base;

public class Test {
	public static void main(String[] args) {
		new Child("mike");//132
	}
}

class People {

	String name;

	public People() {
		System.out.print(1);
	}

	public People(String name) {

		System.out.print(2);

		this.name = name;

	}

}

class Child extends People {

	People father;

	public Child(String name) {

		System.out.print(3);

		this.name = name;

		father = new People(name + ":F");

	}

	public Child() {
		System.out.print(4);
	}

}

class Father{
	int a = 1;
	double b = 1.2;
	
	Father(){
		System.out.print("");
	}
}

class Son{
	
}
