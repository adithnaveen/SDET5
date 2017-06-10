package com.fannie.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.fannie.beans.Greeting;

@Path("/hello")
public class HelloResource {
	
	/*@GET
	public String sayHello(){
		return "hello from rest resource";
	}*/
	
	
	/*@GET
	@Produces("text/html")
	public String sayHello(){
		return "<html><body><h2>Welcome to HTML </h2></body></html>";
	}*/
	/*
	@GET
	@Produces("application/xml")
	public String sayHelloAsXML(){
		return "<?xml version='1.0'?><message>Hello World</message>";
	}*/
	
	@GET
	@Produces("application/json")
	public Greeting sayHelloJson(){
		Greeting g = new Greeting();
		g.setName("Harry");
		g.setMessage("Welcome to Web Service");
		
		return g;
	}
	
}
