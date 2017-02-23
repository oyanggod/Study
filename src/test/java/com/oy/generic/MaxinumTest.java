package com.oy.generic;

/**
 * 声明一个有界的类型参数
 * @author Administrator
 *
 */
public class MaxinumTest {
	public static <T extends Comparable<T>> T maxinum(T x, T y, T z){
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.printf("%d , %d, %d 中最大的数为 %d \n\n", 2, 3 ,4 , maxinum(2, 3, 4));
		System.out.printf("%.1f , %.1f, %.1f 中最大的数为 %.1f \n\n", 2.2, 3.3 ,4.4 , maxinum(2.2, 3.3, 4.4));
		System.out.printf("%s , %s, %s 中最大的数为 %s \n\n", "pen", "apple" ,"pineapple" , maxinum("pen", "apple" ,"pineapple"));
	}
}
