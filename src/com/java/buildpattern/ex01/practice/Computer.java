package com.java.buildpattern.ex01.practice;

public class Computer {

	private String cpu;
	private String ram;
	private String storage;
	private String vga;
	private String keyBoard;
	private String mouse;
	
	public Computer (String cpu, String ram, String storage, String vga, String keyBoard, String mouse) {
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
		this.vga = vga;
		this.keyBoard = keyBoard;
		this.mouse = mouse;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getVga() {
		return vga;
	}

	public void setVga(String vga) {
		this.vga = vga;
	}

	public String getKeyBoard() {
		return keyBoard;
	}

	public void setKeyBoard(String keyBoard) {
		this.keyBoard = keyBoard;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", vga=" + vga + ", keyBoard="
				+ keyBoard + ", mouse=" + mouse + "]";
	}
	
	
}
