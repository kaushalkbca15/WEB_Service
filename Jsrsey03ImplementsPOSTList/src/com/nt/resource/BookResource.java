package com.nt.resource;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.bo.Book;
import com.nt.util.ConvertJSON;

@Path(value="book")
public class BookResource {
	
	static{
		System.out.println("class is loaded");
	}
	@POST
	@Path(value="/details")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBookdetails(@QueryParam("name") final List<String> name){
		System.out.println(name);
		Book book=new Book();
		book.setId(120);
		book.setName("JAVA");
		book.setAuthor("kk");
		return  ConvertJSON.converJavaToJSON(book)+name;
		
	}
}
