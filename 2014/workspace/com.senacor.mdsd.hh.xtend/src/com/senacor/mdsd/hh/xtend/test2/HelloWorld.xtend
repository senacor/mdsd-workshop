package com.senacor.mdsd.hh.xtend.test2

import static extension com.senacor.mdsd.hh.xtend.test2.Extension.*;

class HelloWorld {
	def static main(String[] args) {
		val greeting = "GUTEN TAG"
		
		System::out.println(greeting.toLowerCase.toFraenkisch)
	}
}
