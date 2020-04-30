package com.sri.tutorial;

public class TutorialAction {

	private TutorialService tutorialService;
	private String msg;
	private String language;

	public String execute() {
//		System.out.println(getMsg());
		tutorialService=new TutorialService();
		
		return tutorialService.getBestTutorial(getLanguage());
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	 
}
