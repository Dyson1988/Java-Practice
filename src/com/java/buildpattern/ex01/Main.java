package com.java.buildpattern.ex01;

/*
 	학습 목표 : 복잡한 단계가 필요한 인스턴스 생성을 빌더패턴을 통해서 구현할 수 있다.
 			  복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴
 */

public class Main {
	
	public static void main(String[] args) {
		 
		/*
			ComputerFactory
				- 설계도를 하나 가지고 있는다. 		.setBluePrint()
				- 그 설계도를 가지고  만든다.  		.setMake()
				- 그 설계도로 만들어진 것을 가져온다	.getComputer()
				- .setMake()와 .getComputer()를 순서로 실행하면 문제가 될 수 있기때문에
				  makeAndGet()이런식으로 한 번에 처리를 한다.
		 */
		
		ComputerFactory factory = new ComputerFactory();
		
		//factory에 LgGramBluePrint라는 설계도를 넣어준다.
		factory.setBluePrint(new LgGramBluePrint());
		
		//그 설계도를 바탕으로 만들어준다.
		factory.make();
		
		//만들어진 설계도를 컴퓨터로 가져와서 println으로 보여준다.
		Computer computer = factory.getComputer(); 
		
//		Computer computer = new Computer("i7", "256gb", "512gb SSD");
		System.out.println("computer 스팩 : " + computer.toString());
	}
}
