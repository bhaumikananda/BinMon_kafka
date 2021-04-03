package org.binmon.kafka.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.binmon.kafka.message.MatchResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class BinmonKafkaRestController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@ResponseBody
	@RequestMapping(value = "/match", method = RequestMethod.GET)
	public MatchResult derbyMatch(@RequestParam(value = "team", required = true) String team) {
		System.out.println("This is a new request");
		return new MatchResult("EastBengal", team);
	}

	@ResponseBody
	@RequestMapping("/")
	public MatchResult match(String name) {
		System.out.println("Test 1");
		return new MatchResult(name, "EastBengal");
	}
	
}
