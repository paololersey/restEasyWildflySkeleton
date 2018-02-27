package com.application.mapper;

import com.application.dal.model.Customer;
import com.application.rest.CustomerTO;

public class Mapper {

	public Customer convertTOtoEntity(CustomerTO customerTO) {
		Customer customer = new Customer();
		customer.setDateOfBirth(customerTO.getDateOfBirth());
		customer.setFiscalCode(customerTO.getFiscalCode());
		customer.setName(customerTO.getName());
		customer.setSurname(customerTO.getSurname());
		return customer; 		
	}
	
	public CustomerTO convertEntitytoTO(Customer customer) {
		CustomerTO customerTO = new CustomerTO();
		customerTO.setDateOfBirth(customer.getDateOfBirth());
		customerTO.setFiscalCode(customer.getFiscalCode());
		customerTO.setName(customer.getName());
		customerTO.setSurname(customer.getSurname());
		return customerTO; 		
	}

	
}