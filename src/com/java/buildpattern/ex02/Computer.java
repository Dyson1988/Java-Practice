package com.java.buildpattern.ex02;

public class Computer {
	
	private String cpu;
	private String ram;
	private String storage;
	private String vga;
	private String keyboard;
	private String mouse;
	/**
	 * 
	 * @param cpu		씨피유 입니다.
	 * @param ram		램 입니다.
	 * @param storage	저장소 입니다.
	 * @param vga		그래픽 카드 입니다.
	 * @param keyboard	키보드 입니다.
	 * @param mouse		마우스 입니다.
	 */
	
	public Computer(String cpu, String ram, String storage, String vga, String keyboard, String mouse) {
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
		this.vga = vga;
		this.keyboard = keyboard;
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

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	@Override
	public String toString() {
		return "Computer spec \n - cpu = " + cpu + "\n - ram = " + ram + "\n - storage = " + storage + "\n - vga = " + vga + "\n - keyboard = "
				+ keyboard + "\n - mouse = " + mouse;
	}

}
