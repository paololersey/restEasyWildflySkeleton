package com.application.rest;

import java.util.Date;

public class CustomerTO implements java.io.Serializable {

	private static final long serialVersionUID = 8539824932895066025L;

	private String name;
	private String surname;
	private String fiscalCode;
	private Date dateOfBirth;

	public CustomerTO() {
	}

	public CustomerTO(Long id, String name, String surname, String fiscalCode, Date dateOfBirth) {
		super();
		this.name = name;
		this.surname = surname;
		this.fiscalCode = fiscalCode;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
