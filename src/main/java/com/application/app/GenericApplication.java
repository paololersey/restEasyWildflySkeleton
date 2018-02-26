package com.application.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.application.rest.ApplicationRestService;
import com.application.rest.MessageRestService;

public class GenericApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public GenericApplication() {
		singletons.add(new MessageRestService());
		singletons.add(new ApplicationRestService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
