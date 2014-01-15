package com.senacor.mdsd.hh.xtend.test4

class TemplateTest {
	def static void main(String[] args) {
		System.out.println(template("World"))	
		System.out.println(classTemplate("World"));
	}
	
	def static template(String s) {
		'''
		Dies ist ein Test mit einem Template.
		Im Grund ganz einfach ...
		Hello, �s�!
		Siehste.
		'''
	}
	
	def static classTemplate(String s) '''
	package foo.bar;
	
	class �s�Greeter extends SomeBaseclass {
	  public static void main(String[] args) {
	    sayHello();
	  }
	
	  public static void sayHello() {
	    System.out.println("Hello, �s�!");
	  }
	}
	'''
}