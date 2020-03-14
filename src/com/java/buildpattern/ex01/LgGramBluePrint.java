package com.java.buildpattern.ex01;

public class LgGramBluePrint extends BluePrint {

	private Computer computer;
	
	public LgGramBluePrint() {
		computer = new Computer("default", "default", "default");
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("512GB");
	}

	@Override
	public void setStorage() {
		computer.setStorage("512GB SSD");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
