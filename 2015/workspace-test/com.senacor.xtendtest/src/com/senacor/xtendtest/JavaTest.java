package com.senacor.xtendtest;

public class JavaTest {
  public static void main(String[] args) {
	  Hello h = new Hello();
	  h.sayHello();
	  System.out.println(h.helloTemplate("Hamburg"));
	  
	  System.out.println(h.generateClass("MeineGenerierteKlasse"));
  }
}
