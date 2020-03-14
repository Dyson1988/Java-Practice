package com.java.buildpattern.ex01.practice;

public class LgGramNoteBook extends BluePrint {

	private Computer computer;
	
	public LgGramNoteBook() {
		computer = new Computer("default", "default", "default", "default", "none", "none"); 
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("Intel - i7");
	}

	@Override
	public void setRam() {
		computer.setRam("256GB");
	}

	@Override
	public void setStorage() {
		computer.setStorage("1TB HDD");
	}

	@Override
	public void setVga() {
		computer.setVga("NVIDIA - GTX-970");
	}

	@Override
	public void setKeyBoard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMouse() {
		computer.setMouse("logitech series");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}

}
