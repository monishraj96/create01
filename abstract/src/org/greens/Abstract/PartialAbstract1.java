package org.greens.Abstract;

public class PartialAbstract1 extends PartialAbstract {

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("5");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("10");
	}

	@Override
	public void current() {
		// TODO Auto-generated method stub
		System.out.println("15");
	}
public static void main(String[] args) {
	PartialAbstract1 a=new PartialAbstract1();
	a.savings();
	a.deposit();
	a.current();
}
}
