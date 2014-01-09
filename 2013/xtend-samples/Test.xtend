package foo.bar

class Test {
	def printHello() {
		Util::dump(sayHello.toString)
	}
	
	def sayHello() {
		sayTemplatedHello("Hamburg")
	}
	
	def sayTemplatedHello(String name) '''
	
	******
	Hello, «name»!
	******
	
	'''
}