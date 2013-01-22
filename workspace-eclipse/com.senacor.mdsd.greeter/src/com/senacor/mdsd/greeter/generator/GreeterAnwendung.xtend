package com.senacor.mdsd.greeter.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import com.senacor.mdsd.greeter.greeterDsl.Person
import com.senacor.mdsd.greeter.greeterDsl.Model

class GreeterAnwendung {
	def static dispatch generateCode(EObject eo, IFileSystemAccess fsa) {
		// Sammler für alle Typen, die wir vorerst ignorieren
		System::out.println("ignoriere Element vom Typ "+eo.eClass.name);	
	}

	def static dispatch generateCode(Model m, IFileSystemAccess fsa) {
		fsa.generateFile("foo/bar/Greeter.java", content(m))	
	}
	
	def static dispatch generateCode(Person p, IFileSystemAccess fsa) {
		fsa.generateFile("foo/bar/Abstract"+p.firstname+p.lastname+"Person.java", contentAbstract(p))	
		fsa.generateFile("foo/bar/"+p.firstname+p.lastname+"Person.java", contentConcrete(p))	
	}
	
	def private static dispatch content(Model m) '''
	package foo.bar;
	
	import java.util.List;
	import java.util.ArrayList;
	
	public class Greeter {
		public static void main(String[] args) {
			System.out.println("Willkommen bei der vollautomatischen Grußanwendung!\n\n");
			
			List<Person> persons = new ArrayList<Person>();
			«FOR p:m.persons»
			persons.add(new «p.firstname»«p.lastname»Person());
			«ENDFOR»
			for (int i=0; i<«m.persons.size»; i++) {
				for (int j=0; j<«m.persons.size»; j++) {
					persons.get(i).greet(persons.get(j));
				}
			}
		}	
	}
	'''
	
	def private static dispatch contentAbstract(Person p) '''
	package foo.bar;
	
	public abstract class Abstract«p.firstname»«p.lastname»Person extends Person {
		protected final String getFirstname() {
			return "«p.firstname»";
		}
		
		protected String getGreetword() {
			return "hello";
		} 		
	}
	'''
	
	def private static dispatch contentConcrete(Person p) '''
	package foo.bar;
	
	public class «p.firstname»«p.lastname»Person extends Abstract«p.firstname»«p.lastname»Person {
	}
	'''
}