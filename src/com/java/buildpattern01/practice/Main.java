package com.java.buildpattern01.practice;


public class Main {
	
	public static void main (String[] args) {

		//��ǻ�͸� �����ϴ� ������ ����
		ComputerFactory factory = new ComputerFactory();
		
		//���忡 Ư��ȸ�� ex)LG Computer�� ���赵�� �����ش�.
		factory.setBluePrint(new LgGramNoteBook());
		
		//��ǻ�Ͱ��忡���� ���赵�� ���� �����.
		Computer computer = factory.makeAndGet();
		
		//������� ��ǻ�͸� �޾� println���� Ȯ���Ѵ�.
		System.out.println("�ϼ��� ��ǻ�� : " + computer.toString());
	}

}
