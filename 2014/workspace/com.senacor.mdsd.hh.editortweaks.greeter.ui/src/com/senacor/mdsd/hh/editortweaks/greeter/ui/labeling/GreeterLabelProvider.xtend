/*
* generated by Xtext
*/
package com.senacor.mdsd.hh.editortweaks.greeter.ui.labeling

import com.google.inject.Inject
import com.senacor.mdsd.hh.editortweaks.greeter.greeter.Greeting

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class GreeterLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	/*
	def text(Greeting greeting) {
		greeting.greetword+' to '+greeting.person.name
	}
	*/
}
