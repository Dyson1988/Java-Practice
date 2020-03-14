package com.java.buildpattern.ex02;

/*
	학습 목표 : 많은 변수를 가진 객체의 생성을 가독성 높도록 코딩 할 수 있다.
	
	BuilderPattern 2 : 많은 인자를 가진 객체의 생성을 다른 객체의 도움으로 생성하는 패턴
*/

public class Main {
	
	public static void main(String[] args) {
		
		// 기존에 객체 생성방법을 통해 사용하게 되면 아래와 같이 어디가 어딘지 모르며 섞일 수 있다.
//		Computer examComputer = new Computer("i7", "i7", "i7", vga, keyboard, mouse);
		
		//그래서 명확하게 넣기 위해 아래와 같은 형식으로 값을 넣어 주게 되는 것 이다.
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
