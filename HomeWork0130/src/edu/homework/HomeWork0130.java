package edu.homework;

import java.util.Scanner;

class Car {
	private int speed;
	private int num;
	private String name;
	private String color;
	private String address;
	
	public Car(int pspeed, int pnum, String pname, String pcolor, String paddrees) {
		speed = pspeed;
		num = pnum;
		name = pname;
		color = pcolor;
		address = paddrees;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getAdress() {
		return address;
	}
}	

public class HomeWork0130 {

	public static void main(String[] args) {

// homework01
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		for (int i = 0; i < 6; i++) {
			boolean flag = true;
			while (flag) {
				flag = false;
				System.out.print("로또번호 입력 : ");
				int num = sc.nextInt();
				for (int j : arr) {
					if (num == j) {
						flag = true;
						System.out.println("같은 번호가 있습니다!");
						break;
					}
				}
				if (!flag) {
					arr[i] = num;
				}
			}
		}
		
		System.out.printf("입력된 로또번호 : \t%d\t%d\t%d\t%d\t%d\t%d\n", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
		
// homework02
		
		System.out.print("차 이름을 입력하시오. : ");
		String pname = sc.next();
		System.out.print("차 색을 입력하시오. : ");
		String pcolor = sc.next();
		System.out.print("차량 번호를 입력하시오. : ");
		int pnum = sc.nextInt();
		sc.nextLine();
		System.out.print("운전자 주소를 입력하시오. : ");
		String paddress = sc.nextLine();
		System.out.print("속도를 입력하시오. : ");
		int pspeed = sc.nextInt();
		
		Car mycar = new Car(pspeed, pnum, pname, pcolor, paddress);
		
		System.out.println();
		System.out.println("차 이름 : " + mycar.getName());
		System.out.println("차 색 : " + mycar.getColor());
		System.out.println("차량 번호 : " + mycar.getNum());
		System.out.println("운전자 주소 : " + mycar.getAdress());
		System.out.println("속도 : " + mycar.getSpeed());
	



		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] arr = new int[6];
		
		while (i < 6) {
			System.out.print("로또번호 입력 : ");
			int N = sc.nextInt();
			arr[i] = N;
			for (int j = 0; j < i; j++) {
				if (arr[j] == N) {
					System.out.println("같은 번호가 있습니다!");
					i -= 1;
					break;
				}
			}
			i += 1;
		}
		
		System.out.println();
		for (int k : arr) {
			System.out.println(k);
		}
	}
}
