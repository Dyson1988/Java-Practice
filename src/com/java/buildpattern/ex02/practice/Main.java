package com.java.buildpattern.ex02.practice;

public class Main {
	
	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder.start()
				.setCpu("i3 processor")
				.setRam("256GB")
				.setVga("NVIDIA GTX-2080TI")
				.setKeyBoard("samsung keyBoard")
				.build();
		
		System.out.println("주문하신 Lg Gram NoteBook의 사양 입니다. \n" + computer.toString());
	}
	

}
