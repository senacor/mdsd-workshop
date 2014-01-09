package foo.bar

class Test2 {
	def dispatch dumpObject(String s) {
		System::out.println("ein String");
	}
	
	def dispatch dumpObject(Integer i) {
		System::out.println("ein Integer");
	}

    /*	
	def dispatch dumpObject(Number n) {
		System::out.println("eine Zahl");
	}	
    */
}