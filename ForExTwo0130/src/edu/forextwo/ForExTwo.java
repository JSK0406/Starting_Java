package edu.forextwo;

public class ForExTwo {

	public static void main(String[] args) {
		
		int num[] = {1, 2, 3};
		
		for (int i = 0; i <= 2; i++) {
			System.out.println(num[i]);
		}
		
		for (int k : num) {
			System.out.println(k);
		}
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
	}
	
}
