package org.test;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,sum=0,temp;
		int num=sc.nextInt();
		temp=num;
		
		while(num>0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;}
			
			if(sum==temp){
				System.out.println("palidrome");
				}
			else{
				System.out.println("not palidrome");
		}
	}}



