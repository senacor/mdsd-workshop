package foo.bar

class HelloWorld2 {
	def static void main(String[] args) {
		val v = "Hallo"
		System.out.println(dump(v))
	}
	
	
	def static dispatch dump(Object o) {
		"don't know my type"
	}

	def static dispatch dump(String s) {
		"I'm a String: "+s
	}
	
	def static dispatch dump(Number n) {
		"I'm a Number: "+n
	}
}