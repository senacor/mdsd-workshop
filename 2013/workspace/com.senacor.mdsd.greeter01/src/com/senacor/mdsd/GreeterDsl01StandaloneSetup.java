
package com.senacor.mdsd;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GreeterDsl01StandaloneSetup extends GreeterDsl01StandaloneSetupGenerated{

	public static void doSetup() {
		new GreeterDsl01StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

