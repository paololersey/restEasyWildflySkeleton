package com.application.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.application.rest.InsertEditPostRestService;
import com.application.rest.MessageGetRestService;

public class GenericApplication extends Application {

	/* don't use singleton since CDI @Inject doen't work */
	// private Set<Object> singletons = new HashSet<Object>();

	/*
	 * public GenericApplication() { //singletons.add(new MessageRestService());
	 * //singletons.add(new ApplicationRestService()); }
	 */

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();

		classes.add(MessageGetRestService.class);
		classes.add(InsertEditPostRestService.class);
		return classes;
	}

}
