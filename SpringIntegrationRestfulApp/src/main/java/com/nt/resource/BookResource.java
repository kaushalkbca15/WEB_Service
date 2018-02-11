package com.nt.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.bo.BookBO;
import com.nt.util.JsonUtil;

@RestController
//@Controller
public class BookResource {
	static {
		System.out.println("BookResource");
	}

	@RequestMapping(value = "all", method = RequestMethod.POST)
	@ResponseBody
	public String findAll(@RequestBody String boa) {
		System.out.println("bookDetails:"+boa);
		BookBO bo = new BookBO();
		bo.setId(101);
		bo.setAuthor("KK");
		bo.setName("JAVA");
		String s = JsonUtil.convertJavatoJson(bo);
		System.out.println(s);
		return s;
	}
	@RequestMapping(value = "findbyid", method = RequestMethod.POST)
	@ResponseBody
	public String findById(@RequestBody String boa) {
		System.out.println("bookDetails:"+boa);
		BookBO bo = new BookBO();
		bo.setId(101);
		bo.setAuthor("KK");
		bo.setName("JAVA");
		String s = JsonUtil.convertJavatoJson(bo);
		System.out.println(s);
		return s;
	}
}
