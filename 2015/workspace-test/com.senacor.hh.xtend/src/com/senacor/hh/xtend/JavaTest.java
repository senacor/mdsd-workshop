package com.senacor.hh.xtend;

public class JavaTest {
  public static void main(String[] args) {
	  HelloWorld hw = new HelloWorld();
	  System.out.println("text from xtend: "+hw.returnHello());
	  hw.sayHello();
	  System.out.println(hw.templatedHello("Ralph"));
  }
}
