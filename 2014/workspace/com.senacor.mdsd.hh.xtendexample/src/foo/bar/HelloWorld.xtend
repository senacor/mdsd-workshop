package foo.bar

// import foo.bar.NameProvider
import static extension foo.bar.StringExtensions.*

class HelloWorld {
	var static greeting ="Hello"
	
	def static void main(String[] args) {
		sayHello(NameProvider.name)
        System.out.println("Hamburg".length)
        System.out.println("Guten Tag".toFraenkisch)
	}
	
	def static sayHello(String name) {
		greeting = greeting+" "+name;
		System.out.println(greeting)
	}
	
    def static length(String s){
    	return 5;
    }
}