package foo.bar;


public class Util {
	public static void dump(String s) {
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		Test t = new Test();
		t.printHello();
		
		Test2 t2 = new Test2();
		t2.dumpObject("Ich bin ein String");
		t2.dumpObject(new Integer("0815"));
		t2.dumpObject(new Float("1.234"));
	}
}
