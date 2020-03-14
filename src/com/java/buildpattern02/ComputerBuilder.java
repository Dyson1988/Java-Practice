package com.java.buildpattern02;

public class ComputerBuilder {
	
	private Computer computer;
	
	private ComputerBuilder() {
		computer = new Computer("default", "default", "default", "default", "default", "default");
	}
	
	public static ComputerBuilder startWithCpu(String string) {
		ComputerBuilder builder = new ComputerBuilder();
		builder.computer.setCpu(string);
		return builder;
	}

	public static ComputerBuilder start() {
		return new ComputerBuilder();
	}

	public ComputerBuilder setCpu(String string) {
		computer.setCpu(string);
		return this;
	}

	public ComputerBuilder setStoarge(String string) {
		computer.setStorage(string);
		return this;
	}

	public ComputerBuilder setVga(String string) {
		computer.setVga(string);
		return this;
	}

	public ComputerBuilder setMouse(String string) {
		computer.setMouse(string);
		return this;
	}

	public Computer build() {
		return this.computer;
	}


}
