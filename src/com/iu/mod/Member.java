package com.iu.mod;

//생성자를 만들기 위한 예제
public class Member {
	// getter 받기위한
	// setter 저장하기 위한

	private String name;
	private int age;
	private double weight;
	private double height;

	public void setAge(int age) { // 메서드를 통해서 넣자
		if (age > 0 && age < 130) {
			this.age = age;
		} else {
			this.age = 25;
		}
	}

	public int getAge() {
		if (age < 0 || age > 130) {
			this.age = 25;
		}
		return this.age;
	}

	public Member(String name, int age, double weight, double height) {
		if (age > 0 && age < 130) {
			this.age = age;
		} else {
			this.age = 25;
		}

		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	// 생성자 두개
	// 디폴트 생성자
	// 회원 정보를 매개변수로 받는 생성자

	public void check() {
		double st = (this.height - 100) * 0.95;
		if (this.weight > st) {
			System.out.println("비만");
		} else if (this.weight < st) {
			System.out.println("저체중");
		} else {
			System.out.println("표준");
		}

	}
	// 자기 키 - 100 한 결과물에
	// 0.95 곱한 결과물
	// 결과물이 자기 몸무게보다 작다면 비만출력
	// 결과물이 자기 몸무게 보다 크다면 저체중
	// 표준 출력

}
