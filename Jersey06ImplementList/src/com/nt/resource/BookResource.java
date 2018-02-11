package com.nt.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nt.domain.Book;
import com.nt.utility.JSONUtil;

@Path("book")
public class BookResource {

	@GET
	@Path("/findAll")
	@Produces(MediaType.TEXT_PLAIN)
	public Response findAll(){
		List<Book> list=new ArrayList<Book>();
		Book book=new Book();
		book.setId(102);
		book.setName("JAVA");
		book.setPrice(200);
		Book book2=new Book(103, "PHP", 500);
		Book book3=new Book(104, "ORACLE", 400);
		Book book4=new Book(105, "PYATHON", 400);
		list.add(book);list.add(book2);list.add(book3);list.add(book4);
		//JSONUtil.convertJavaToJSON(list);
		return Response.status(200).entity(JSONUtil.convertJavaToJSON(list)).build();
	}
	@POST
	@Path("/savebook")
	@Produces(MediaType.TEXT_PLAIN)
	public Response saveBook(@QueryParam("name") final List<String> name){
		System.out.println(name);
		return Response.status(200).entity(name.iterator().toString()).build();
	}
}
