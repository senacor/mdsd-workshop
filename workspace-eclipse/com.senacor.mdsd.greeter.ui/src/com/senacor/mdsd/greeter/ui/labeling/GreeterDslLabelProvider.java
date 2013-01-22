/*
* generated by Xtext
*/
package com.senacor.mdsd.greeter.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider; 
 
import com.google.inject.Inject;
import com.senacor.mdsd.greeter.greeterDsl.Greeting;
import com.senacor.mdsd.greeter.greeterDsl.Person;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class GreeterDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public GreeterDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	//Labels and icons can be computed like this:
	
	String text(Person p) {
		  return ("w".equalsIgnoreCase(p.getGender())?"Frau ":"Herr ")+p.getLastname();
		}
		 
	String text(Greeting grt) {
		  return "Huhu, "+grt.getPerson().getFirstname();
		}
		 
    String image(Greeting grt) {
      return "winken.gif";
    }
}
