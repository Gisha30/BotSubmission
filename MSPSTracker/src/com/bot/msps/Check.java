package com.bot.msps;



import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;

@Path("/test")
public class Check {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return "test0";
	}

}
