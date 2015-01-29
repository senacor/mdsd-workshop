package com.senacor.xtendtest

class Hello {
	val i = 5;
	var j = 2;
	
	def sayHello() {
		System.out.println("Hello, World!")
		
		"Hallo".dumpToConsole();
	}
	
	def dumpToConsole(String s) {
		System.out.println(s);
	}
	
	def helloTemplate(String name) '''
	kekjrkj 
	   ewrwer  ''
	      wertzewztezt
	   werzzwewze
	
	   werztwer
	
	
	*********
	*********
	Hello, « name »!
	*********
	*********
	'''
	
	def generateClass(String classname) '''
package com.senacor.xtendtest;

public class «classname» {
  public static void main(String[] args) {
	  Hello h = new Hello();
	  h.sayHello();
	  System.out.println(h.helloTemplate("Hamburg"));
  }
}
	'''
}