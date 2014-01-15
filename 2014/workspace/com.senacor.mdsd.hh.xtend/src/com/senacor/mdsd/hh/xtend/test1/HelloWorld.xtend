package com.senacor.mdsd.hh.xtend.test1

class HelloWorld {
	var static greeting = "Hello";
	
	def static main(String[] args) {
		System::out.println(greeting)
	}
	
	def sayHello() {
		System.out.println("Hello, World!")
	}
}