package com.git;
import java.util.Scanner;

public class Sample{
	public void addition(int a,int b) {
		int c = a+b;
		System.out.println("value of a" +a);
		System.out.println("value of b" +b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		Sample S = new Sample();
		S.addition(10, 40);
		
	}

	}