package com.senacor.mdsd.greeter02.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractGreeterDsl02JavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.senacor.mdsd.greeter02.greeterDsl02.GreeterDsl02Package.eINSTANCE);
		return result;
	}

}
