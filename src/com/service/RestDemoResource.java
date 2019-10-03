package com.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.research.ws.wadl.Response;

@Path("/messages")
public class RestDemoResource {
		
	RestDemoResource r=new RestDemoResource();
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	
	public Response add(@FormParam("username")String username,
			@FormParam("password")String password) {
		
	}
}
  