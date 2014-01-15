package lambda


class LambdaTestXtend {
	def static void main(String[] args) {
		LambdaTestJava.foo([str|System.out.println(str)])
		LambdaTestJava.foo([System.out.println(it)])
		
		filter
	}
	
	def static filter() {
		(1 .. 1000).filter([it%17 == 0]).forEach[System.out.println(it)]
	}
}