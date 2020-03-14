package com.java.buildpattern01.practice;


public class Main {
	
	public static void main (String[] args) {

		//컴퓨터를 생산하는 공장을 선언
		ComputerFactory factory = new ComputerFactory();
		
		//공장에 특정회사 ex)LG Computer의 설계도를 보내준다.
		factory.setBluePrint(new LgGramNoteBook());
		
		//컴퓨터공장에서는 설계도를 보고 만든다.
		Computer computer = factory.makeAndGet();
		
		//만들어진 컴퓨터를 받아 println으로 확인한다.
		System.out.println("완성된 컴퓨터 : " + computer.toString());
	}

}
