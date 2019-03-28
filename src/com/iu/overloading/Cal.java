
package com.iu.overloading;

// 계산 하는 클래스 
public class Cal {

	public void plus(int a, int b, int c) {
	}

	public int plus(int a, int b) { // 두개를 더할려고 하는것
		int sum = a + b;
		return sum;
	}

	public float plus(int a, float b) { // 메서드 오버로딩
		float sum = a + b;
		return sum; // 리턴
	}

	public float plus(float a, float b) {
		return a + b;
	}
}
