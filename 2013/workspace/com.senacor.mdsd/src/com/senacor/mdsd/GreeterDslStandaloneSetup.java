
package com.senacor.mdsd;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GreeterDslStandaloneSetup extends GreeterDslStandaloneSetupGenerated{

	public static void doSetup() {
		new GreeterDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

