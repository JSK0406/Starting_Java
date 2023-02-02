package edu.homework;

import java.util.Scanner;

class Car {
	
	protected int vel, num;
	protected String name, color, add;
	
	public Car(int vel, int num, String name, String color, String add) {
		this.vel = vel;
		this.num = num;
		this.name = name;
		this.color = color;
		this.add = add;
	}
	public int getVel() {
		return vel;
	}
	public void setVel(int vel) {
		this.vel = vel;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
}

class LentCar extends Car {
	
	private int fare;
	private String comp;
	
	public LentCar(int vel, int num, String name, String color, String add, int fare, String comp) {
		super(vel, num, name, color, add);
		this.fare = fare;
		this.comp = comp;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}
	
}

public class HomeWork0201 {

	public static void main(String[] args) {
	
// 01		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("차량 이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("차량 색깔을 입력하세요 : ");
		String color = sc.next();
		System.out.print("차량 번호를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("운전자주소를 입력하세요 : ");
		sc.nextLine();
		String add = sc.nextLine();
		System.out.print("현재 속도를 입력하세요 : ");
		int vel = sc.nextInt();
		System.out.print("렌트비를 입력하세요 : ");
		int fare = sc.nextInt();
		System.out.print("렌트회사를 입력하세요 : ");
		sc.nextLine();
		String comp = sc.nextLine();
		
		LentCar mycar = new LentCar(vel, num, name, color, add, fare, comp);
		
		System.out.println("현재 속도 : " + mycar.getVel());
		System.out.println("차량 이름 : " + mycar.getName());
		System.out.println("차량 번호 : " + mycar.getNum());
		System.out.println("차량 색깔 : " + mycar.getColor());
		System.out.println("운전자 주소 : " + mycar.getAdd());
		System.out.println("렌트 요금 : " + mycar.getFare());
		System.out.println("렌트 회사 : " + mycar.getComp());
		
		System.out.print("속도를 얼마나 올리시겠습니까 : ");
		mycar.setVel(mycar.getVel() + sc.nextInt());
		System.out.println("현재 속도 : " + mycar.getVel());
		System.out.print("속도를 얼마나 내리시겠습니까 : ");
		mycar.setVel(mycar.getVel() - sc.nextInt());
		System.out.println("현재 속도 : " + mycar.getVel());
		
		
//02
		
		int[] numarr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			numarr[i] = i+1;
		}
				
		for(int i : numarr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i+=2) {
			int tmp = numarr[i+1];
			numarr[i+1] = numarr[i];
			numarr[i] = tmp;
		}
		
		for(int i : numarr) {
			System.out.print(i + " ");
		}
		
	}
	
}
