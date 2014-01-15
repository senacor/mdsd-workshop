package lambda;

public class LambdaTestJava {
	public static void main(String[]args) {
		foo(new EventHandler() {
			@Override
			public void doSomethingWithAString(String s) {
				System.out.println(s);
			}
		});
	}
	
	public static void foo(EventHandler eh) {
		String s = "abc";
		eh.doSomethingWithAString(s);
	}
}
