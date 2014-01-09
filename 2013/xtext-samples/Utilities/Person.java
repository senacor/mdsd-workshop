package foo.bar;

/**
 * Basisklasse für generierte Abstract<vorname><nachname>Person-Klassen
 * Muss für generierte Artefakte sichtbar sein, bspw. im src-Folder des DSL-Editors
 */
public abstract class Person {
	protected abstract String getFirstname();
	protected abstract String getGreetword();

	public void greet(Person p) {
		System.out.println(getFirstname()+" says "+getGreetword()+" to "+p.getFirstname());
	}
}
