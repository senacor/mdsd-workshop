package foo.bar;

public class ObjectDumper {
	public static void main(String[] args) {
		Object[] objs = new Object[] {"Hallo", "Test", new Double("1.3")};
		
		for (Object o : objs) {
			dumbdump(o);
			System.out.println(HelloWorld2.dump(o));
		}
	}
	
	private static void dumbdump(Object o) {
		if (o instanceof String) {
			System.out.println("string");
		} else if (o instanceof Double) {
			System.out.println("double");
		} else {
			System.out.println("don't know");
		}	
	}

}
