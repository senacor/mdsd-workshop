package com.senacor.mdsd.hh.xtend.test3;

public class LambdaTest {
	public static void main(String args[]) {
		foo(new LambdaInterface() {
			@Override
			public void doSomethingWithAString(String s) {
				System.out.println("String was "+s);
			}
		});
	}
	
	public static void foo(LambdaInterface i) {
		String s = "Ein Sring ...";
		i.doSomethingWithAString(s);
	}
}
