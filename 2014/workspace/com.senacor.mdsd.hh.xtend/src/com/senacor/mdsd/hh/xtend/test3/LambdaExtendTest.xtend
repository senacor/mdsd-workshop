package com.senacor.mdsd.hh.xtend.test3

class LambdaExtendTest {
	def static void main(String[] args) {
		foo([str | 
			System.out.println("--> "+str)
		])
		
		filter
	}
	
	def static foo(LambdaInterface i) {
		val s = "Ein String ..."
		i.doSomethingWithAString(s)
	}
	
	def static filter() {
		(1 .. 1000).filter([it%17 == 0]).forEach[System.out.println(it)]
	}
}