
package com.iu.mobile;

import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		PhoneView pv = new PhoneView();
		Scanner sc = new Scanner(System.in);

		Pad pad = new Pad("APPLE", 200);
		Pad pad2 = new Pad();

		Phone p1 = new Phone();
		Phone p2 = new Phone(100);
		Phone p3 = new Phone(80, "Silver");
		Phone p4 = new Phone(50, "Blue", 5);

		p1.price = 200;
		pv.view(p1);
		pv.view(p2);
		pv.view(p3);
		pv.view(p4);

	}

}