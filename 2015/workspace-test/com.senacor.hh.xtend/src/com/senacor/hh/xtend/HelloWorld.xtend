package com.senacor.hh.xtend

class HelloWorld {
	val i=5;
	var j=2;
	
	def dispatch print(String s) {
		System::out.println(s)
	}
	
	def dispatch print(int i) {
		System::out.println(i)
	}
	
	def returnHello() {
		"Hello, World!"
	}
	
	def sayHello() {
		"hallo".toConsole;		
		System::out.println("(inside xtend) Hello, World!");
	}
	
	def toConsole(String s) {
		System::out.println(s);
	}
	
	def templatedHello(String name) '''
	***********************
	**** Hello, «name» ****
	***********************
	'''
}