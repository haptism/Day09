
package com.iu.mod;

public class MemberMine {

	public static void main(String[] args) {

		Member member = new Member("iu", 20, 96.3, 173.5);
		member.check();

//		// 관리후
//		
//		member.weight = 46.2;
//		member.check();

		member.setAge(1200);
		int age = member.getAge();
		System.out.println(age);

	}

}
