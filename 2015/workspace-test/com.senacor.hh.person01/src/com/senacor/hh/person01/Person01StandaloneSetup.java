/*
* generated by Xtext
*/
package com.senacor.hh.person01;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Person01StandaloneSetup extends Person01StandaloneSetupGenerated{

	public static void doSetup() {
		new Person01StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

