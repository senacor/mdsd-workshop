package foo.bar;

public abstract class Person {
	protected abstract String getFirstname();
	protected abstract String getGreetword();

	public void greet(Person p) {
		System.out.println(getFirstname()+" says "+getGreetword()+" to "+p.getFirstname());
	}
}
