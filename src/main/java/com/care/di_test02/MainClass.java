package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String path = "classpath:application_test02.xml";
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext(path);
		SaveClass sc = ctx.getBean("sc", SaveClass.class);
		sc.setNum1(input.nextInt());
		sc.setOp(input.next());
		sc.setNum2(input.nextInt());
		sc.operationClass();
		sc.printClass();
	}
}
