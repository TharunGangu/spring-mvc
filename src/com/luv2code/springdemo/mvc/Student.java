package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private String[] operatingSystems;
	
	private String favoriteLanguage;
	
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	private LinkedHashMap<String, String> countryOptions;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IND", "India");
		countryOptions.put("SIN", "Singapore");
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("IRE", "Ireland");
		countryOptions.put("DUB", "Dubai");
		
		
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		System.out.println("Operating Systems: " + operatingSystems);
		this.operatingSystems = operatingSystems;
	}
	
	
}
