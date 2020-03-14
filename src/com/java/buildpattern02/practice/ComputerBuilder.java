package com.java.buildpattern02.practice;

public class ComputerBuilder {

	private Computer computer;
	
	private ComputerBuilder() {
		computer = new Computer("none", "none", "none", "none", "none", "none");
	}
	
	public static ComputerBuilder start() {
		
		return new ComputerBuilder();
	}

	public ComputerBuilder setCpu(String string) {
		computer.setCpu(string);
		return this;
	}

	public ComputerBuilder setRam(String string) {
		computer.setRam(string);
		return this;
	}

	public ComputerBuilder setVga(String string) {
		computer.setVga(string);
		return this;
	}
	public ComputerBuilder setKeyBoard(String string) {
		computer.setKeyBoard(string);
		return this;
	}
	
	public Computer build() {
		return computer;
	}
}
