package com.senacor.mdsd.validation;

import org.eclipse.xtext.validation.Check;

import com.senacor.mdsd.greeterDsl01.GreeterDsl01Package;
import com.senacor.mdsd.greeterDsl01.Model;
 

public class GreeterDsl01JavaValidator extends AbstractGreeterDsl01JavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	@Check
	public void checkSomething(Model model) {
		if (model.getGreetings().size() > 3) {
			warning("nun ist's aber langsam gut ...", GreeterDsl01Package.Literals.MODEL__GREETINGS);
		}
		
	}

}
