package com.java.buildpattern.ex01;

/*
 	�н� ��ǥ : ������ �ܰ谡 �ʿ��� �ν��Ͻ� ������ ���������� ���ؼ� ������ �� �ִ�.
 			  ������ �ܰ踦 ���ľ� �����Ǵ� ��ü�� ������ ���� Ŭ�������� �Ѱ��ִ� ����
 */

public class Main {
	
	public static void main(String[] args) {
		 
		/*
			ComputerFactory
				- ���赵�� �ϳ� ������ �ִ´�. 		.setBluePrint()
				- �� ���赵�� ������  �����.  		.setMake()
				- �� ���赵�� ������� ���� �����´�	.getComputer()
				- .setMake()�� .getComputer()�� ������ �����ϸ� ������ �� �� �ֱ⶧����
				  makeAndGet()�̷������� �� ���� ó���� �Ѵ�.
		 */
		
		ComputerFactory factory = new ComputerFactory();
		
		//factory�� LgGramBluePrint��� ���赵�� �־��ش�.
		factory.setBluePrint(new LgGramBluePrint());
		
		//�� ���赵�� �������� ������ش�.
		factory.make();
		
		//������� ���赵�� ��ǻ�ͷ� �����ͼ� println���� �����ش�.
		Computer computer = factory.getComputer(); 
		
//		Computer computer = new Computer("i7", "256gb", "512gb SSD");
		System.out.println("computer ���� : " + computer.toString());
	}
}
