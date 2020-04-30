package com.sri.tutorial;

public class TutorialService {

	public String getBestTutorial(String lang) {
		
		if(lang.equalsIgnoreCase("java")) {
			return "success";
		}
		
		return "error";
	}
}
