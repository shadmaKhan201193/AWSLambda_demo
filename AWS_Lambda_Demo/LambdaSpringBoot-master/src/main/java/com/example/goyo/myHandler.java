package com.example.goyo;

import java.util.function.Function;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class myHandler implements Function<Request,Response> {
	
	

//	@Override
//	public Response apply(Request req) {
//		Response resp = new Response();
//		resp.setResultado(req.getNumberOne() + req.getNumberTwo());
//		return resp;
//	}
	
	@GetMapping("/test")
	public String demo()
	{
		return "hiii";
		
	}

	@Override
	public Response apply(Request t) {
		
		return null;
	}
	
}
