package com.nt.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.json.bo.Book;
import com.json.util.JSONUtils;

@Path(value = "book")
public class BookResource {
	static {
		System.out.println(BookResource.class.getName());
	}

	@POST
	@Path("/find")
	@Produces(MediaType.APPLICATION_JSON)
	public String findBookDetails() {
		System.out.println("findBookDetails");
		Book book = new Book();
		book.setId(101);
		book.setName("Java");
		book.setPrice(520);
		System.out.println(JSONUtils.convertJavaToJsno(book));
		return JSONUtils.convertJavaToJsno(book);

	}

	@POST
	@Path("/findById")
	@Produces("text/html")
	public Response findById(@QueryParam("no") Integer no) {
		String result = null;
		Book book = new Book();
		book.setId(101);
		book.setName("Java");
		book.setPrice(520);
		if (no == 101) {
			result = JSONUtils.convertJavaToJsno(book);
			result += "Id no : " + no;
		} else {
			result = "Recourd not found try again!  Id no : " + no;
		}

		return Response.status(200).entity(result).build();
	}

	@Path("/findAll")
	@POST
	@Produces("text/html")
	public Response findAll() {
		List<Book> list = new ArrayList<Book>();
		Book book = new Book();
		book.setId(101);
		book.setName("Java");
		book.setPrice(520);

		Book book2 = new Book();
		book2.setId(121);
		book2.setPrice(300);
		book2.setName("PHP");
		list.add(book2);
		list.add(book);
		String result = JSONUtils.convertJavaToJsnoList(list);

		return Response.status(200).entity(result).build();
	}

	@HEAD
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public Response userLogin(@HeaderParam("uname") String uname, @HeaderParam("pass") String pass) {
		String str = uname + "   " + pass;
		System.out.println(str);
		return Response.status(200).entity(str).build();
	}
	
	@GET
	@Path("/host")
	@Produces(MediaType.APPLICATION_JSON)
	public Response hostName(@HeaderParam(HttpHeaders.HOST) String host) {
		String str =host;
		System.out.println(str);
		return Response.status(200).entity(str).build();
	}
	@GET
	@Path("/context")
//	@Produces(MediaType.TEXT_PLAIN)
	public Response cintexParam(@Context HttpHeaders headers){
	
	     MultivaluedMap<String, String> rh = headers.getRequestHeaders();
	     String str = rh.entrySet()
                 .stream()
                 .map(e -> e.getKey() + " = " + e.getValue())
                 .collect(Collectors.joining("\n"));
	 
		return Response.status(200).entity(str).build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
