package org.binmon.kafka.message;

import org.springframework.context.annotation.Configuration;

@Configuration 
public class MatchResult{

	
private String teamOne;
private String teamTwo;

public MatchResult() {
}
public MatchResult(String teamOne, String teamTwo) {
	super();
	this.teamOne = teamOne;
	this.teamTwo = teamTwo;
}


public String getTeamOne() {
	return teamOne;
}

public void setTeamOne(String teamOne) {
	this.teamOne = teamOne;
}
public String getTeamTwo() {
	return teamTwo;
}

public void setTeamTwo(String teamTwo) {
	this.teamTwo = teamTwo;
}



}
	