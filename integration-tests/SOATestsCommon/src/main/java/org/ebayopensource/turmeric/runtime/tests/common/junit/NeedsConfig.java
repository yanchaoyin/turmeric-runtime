/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.tests.common.junit;

import java.util.logging.Logger;

import org.ebayopensource.turmeric.runtime.sif.impl.internal.config.ClientConfigManager;
import org.ebayopensource.turmeric.runtime.spf.impl.internal.config.ServiceConfigManager;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;


/**
 * JUnit Rule to ensure that the SOA configuration is setup properly.
 */
public class NeedsConfig implements MethodRule {
	private static final Logger LOG = Logger.getLogger("test.needsconfig");
	private boolean forceReset = false;
	private String defaultConfig;
	
	public NeedsConfig(String configName) {
		this.defaultConfig = configName;
	}
	
	public String getName() {
		return defaultConfig;
	}
	
	@Override
	public Statement apply(final Statement statement, 
			final FrameworkMethod method, final Object target) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				String testConfig = defaultConfig;
				
				SOAConfig soaconfig = method.getAnnotation(SOAConfig.class);
				if(soaconfig != null) {
					testConfig = soaconfig.value();
				}
				
				// Set Config that Test needs
				LOG.info(String.format("NeedsConfig - setting (client & server) config \"%s\"", testConfig));
				ClientConfigManager.getInstance().setConfigTestCase(testConfig, forceReset);
				ServiceConfigManager.getInstance().setConfigTestCase(testConfig, forceReset);
				
				// Execute the test
				statement.evaluate();
			}
		};
	}
}
