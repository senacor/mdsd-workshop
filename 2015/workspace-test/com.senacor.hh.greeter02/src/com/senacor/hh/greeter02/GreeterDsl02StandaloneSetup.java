/*
* generated by Xtext
*/
package com.senacor.hh.greeter02;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GreeterDsl02StandaloneSetup extends GreeterDsl02StandaloneSetupGenerated{

	public static void doSetup() {
		new GreeterDsl02StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

