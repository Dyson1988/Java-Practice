package com.java.buildpattern.ex02;

/*
	�н� ��ǥ : ���� ������ ���� ��ü�� ������ ������ ������ �ڵ� �� �� �ִ�.
	
	BuilderPattern 2 : ���� ���ڸ� ���� ��ü�� ������ �ٸ� ��ü�� �������� �����ϴ� ����
*/

public class Main {
	
	public static void main(String[] args) {
		
		// ������ ��ü ��������� ���� ����ϰ� �Ǹ� �Ʒ��� ���� ��� ����� �𸣸� ���� �� �ִ�.
//		Computer examComputer = new Computer("i7", "i7", "i7", vga, keyboard, mouse);
		
		//�׷��� ��Ȯ�ϰ� �ֱ� ���� �Ʒ��� ���� �������� ���� �־� �ְ� �Ǵ� �� �̴�.
		Computer computer = ComputerBuilder
//			.start()
//			.setCpu("i7")
			.startWithCpu("i7")
			.setStoarge("256GB SSD")
			.setVga("NDIVA GTX970")
			.setMouse("Logitech Series")
			.build();
		
		System.out.println(computer.toString());
		
		Computer cp = ComputerBuilder.startWithCpu("^^")
				.build();
		
		System.out.println(cp.toString());
	}

}
