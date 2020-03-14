package com.java.buildpattern01.practice;

public abstract class BluePrint {
	
	public abstract void setCpu();
	public abstract void setRam();
	public abstract void setStorage();
	public abstract void setVga();
	public abstract void setKeyBoard();
	public abstract void setMouse();
	
	public abstract Computer getComputer();
	
}
