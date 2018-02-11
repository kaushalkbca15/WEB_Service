package com.nt.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value="rest")
public class RestAppClass {

	static{
		System.out.println("static");
	  }
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/hello")
	public String sayHello(@QueryParam("no")Integer no,@QueryParam("name")String name){
		System.out.println("value="+no+"::::::::::"+name);
		return "welcome Rest-Full Application"+name;
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/java")
	public String sayjava(@QueryParam("no")Integer no,@QueryParam("name")String name){
		System.out.println("value="+no+"::::::::::"+name);
		return "welcome Rest-Full Application    "+name;
	}
	
}
