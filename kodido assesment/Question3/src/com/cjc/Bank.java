package com.cjc;

import java.util.Scanner;

public class Bank {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the amount you want to deposit in bank");
		float f=sc.nextFloat();
		
		if(f<0) 
		{
			System.out.println("Custom Exception");
		}
		else
		{
			System.out.println("You have successfully deposited your money");
		}
	}
}
