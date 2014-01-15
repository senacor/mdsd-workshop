package generator

class TemplateTest {
	def static main(String[] args) {
		System.out.println(classTemplate("Ralph"))
	}
	
	def static template(String name) {
		'''
		Hallo!
		
		dies ist ein Test.
		     Eine neue Zeile
		Dein Name ist �name�, stimmt's?
		'''
	}
	
	def static classTemplate(String name) {
		'''
		package foo.bar;
		
		import bla.fasel;
		
		public class �name�Greeter {
		  public static void main(String[] args) {
		    System.out.println("Hallo, �name�!");
		  }
		}
		'''
	}
}