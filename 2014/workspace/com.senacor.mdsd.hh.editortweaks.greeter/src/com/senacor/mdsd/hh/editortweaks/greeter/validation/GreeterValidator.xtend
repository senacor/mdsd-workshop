/*
 * generated by Xtext
 */
package com.senacor.mdsd.hh.editortweaks.greeter.validation

import org.eclipse.xtext.validation.Check
import com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting
import com.senacor.mdsd.hh.editortweaks.greeter.greeter.GreeterPackage
import org.eclipse.emf.codegen.ecore.genmodel.impl.Literals

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class GreeterValidator extends AbstractGreeterValidator {
  /*
  @Check
  def checkPersonUndestandsGreeting(Greeting greeting) {
    // System.out.println(greeting.class.simpleName);
    // System.out.println("Greeting: "+greeting.greetword.name());
    // System.out.println("Language: "+greeting.person.lang.name());
    if (!greeting.greetword.name().equals(greeting.person.lang.name())) {
    	// System.out.println("oops ... didn't understand");
    	warning("Person might not understand greeting",
    		GreeterPackage.Literals.GREETING__GREETWORD,
    		'unknownLanguage'
    	)
    }
  }
  */
}
