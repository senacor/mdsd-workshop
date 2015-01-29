package com.senacor.hh.set;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class MyOutputConfigurationProvider implements
		IOutputConfigurationProvider {


	public static final String GEN_ONCE_OUTPUT = "gen-once";

	  /**
	   * @return a set of {@link OutputConfiguration} available for the generator
	   */
	   public Set<OutputConfiguration> getOutputConfigurations() {
	    OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
	    defaultOutput.setDescription("Output Folder");
	    defaultOutput.setOutputDirectory("./src-gen");
	    defaultOutput.setOverrideExistingResources(true);
	    defaultOutput.setCreateOutputDirectory(true);
	    defaultOutput.setCleanUpDerivedResources(true);
	    defaultOutput.setSetDerivedProperty(true);

	    OutputConfiguration readonlyOutput = new OutputConfiguration(GEN_ONCE_OUTPUT);
	    readonlyOutput.setDescription("Read-only Output Folder");
	    readonlyOutput.setOutputDirectory("./src-gen");
	    readonlyOutput.setOverrideExistingResources(false);
	    readonlyOutput.setCreateOutputDirectory(true);
	    readonlyOutput.setCleanUpDerivedResources(false);
	    readonlyOutput.setSetDerivedProperty(false);
	    
	    HashSet<OutputConfiguration> configs = new HashSet<>();
	    configs.add(defaultOutput);
	    configs.add(readonlyOutput);
	    
	    return configs;
	  }

}
