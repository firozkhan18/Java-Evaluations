package com.java.prgr.jackson;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONToObjectJava {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String jsonString = "{\"name\": \"nadal\", \"age\": \"35\",	\"gender\": \"M\" }";

		ObjectMapper objectWriter = new ObjectMapper();
		
		Customer customer = objectWriter.readValue(jsonString, Customer.class);
		
		System.out.println("customer name : "+customer.getName());
		
		
	}

}
