package org.greens.scanner;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int empId=sc.nextInt();
		System.out.println("enter id "+empId);
		System.out.println("please enter name");
		String empName=sc.next();
		System.out.println("enter name is "+ empName);
		System.out.println("please enter salary");
		Float empSal=sc.nextFloat();
		System.out.println("salary for"+empName+"is"+ empSal);
	}
		

}
