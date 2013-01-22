package foo.bar

class Test {
	static val s = "Hello";
	
	def static main(String[] args) {
		System::out.println(sayHello());
	}
	
	def static sayHello() {
		s+" World!"
	}
}