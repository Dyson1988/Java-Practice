package com.java.buildpattern.ex02.practice;

public class Main {
	
	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder.start()
				.setCpu("i3 processor")
				.setRam("256GB")
				.setVga("NVIDIA GTX-2080TI")
				.setKeyBoard("samsung keyBoard")
				.build();
		
		System.out.println("�ֹ��Ͻ� Lg Gram NoteBook�� ��� �Դϴ�. \n" + computer.toString());
	}
	

}
