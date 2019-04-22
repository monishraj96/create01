package org.greens.overriding;

public class overriding1 extends overriding {
	public void fixed() {
		System.out.println("10");
		super.fixed();
	}
	public static void main(String[] args) {
		overriding1 r=new  overriding1();
		r.fixed();
	}

}
