package com.java.buildpattern.ex01.practice;

public class ComputerFactory {
	
	private BluePrint bluePrint;
	
	public void setBluePrint(BluePrint bluePrint) {
		this.bluePrint = bluePrint;
	}
	
	public Computer makeAndGet() {
		bluePrint.setCpu();
		bluePrint.setRam();
		bluePrint.setVga();
		bluePrint.setStorage();
		bluePrint.setMouse();
		
		return bluePrint.getComputer();
	}
}
