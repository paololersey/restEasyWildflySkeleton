package com.application.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.application.dal.dao.CustomerDataSet;
import com.application.dal.model.Customer;
import com.application.mapper.Mapper;

//http://localhost:8080/RESTfulExample/rest/application/insertEditCustomer
@Path("/application")
@RequestScoped
public class InsertEditPostRestService {

	@Inject
	private CustomerDataSet customerDataSet;

	@Inject
	private Mapper mapper;

	@Inject
	private Logger log;

	@POST
	@Path("/insertEditCustomer")
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertEditCustomer(CustomerTO customerTO) {

		CustomerTO customerTOreturned = null;
		try {
			Customer customer = mapper.convertTOtoEntity(customerTO);
			customer = customerDataSet.writeCustomer(customer);
			customerTOreturned = mapper.convertEntitytoTO(customer);
		} catch (Exception e) {
			log.error(e);
			return Response.ok("Error with exception " + e.getCause()).status(500).build();
		}

		return Response.ok(customerTOreturned).status(200).build();

	}

}