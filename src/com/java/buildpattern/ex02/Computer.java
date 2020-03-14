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
	 * @param cpu		������ �Դϴ�.
	 * @param ram		�� �Դϴ�.
	 * @param storage	����� �Դϴ�.
	 * @param vga		�׷��� ī�� �Դϴ�.
	 * @param keyboard	Ű���� �Դϴ�.
	 * @param mouse		���콺 �Դϴ�.
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
