import java.util.Scanner;

public class HomeWork0126 {

	public static void main(String[] args) {

		
// #1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("name!!");
		String my_name = sc.nextLine();
		
		System.out.println("major!!");
		String major_name = sc.nextLine();
		
		System.out.print("영어 점수 입력:");
		int eng = sc.nextInt();
		
		System.out.print("물리학 점수 입력:");
		int phy = sc.nextInt();
		
		System.out.print("미적분학 점수 입력:");
		int mth = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("주소를 입력하세요!!");
		String address = sc.nextLine();
		
		System.out.printf("이름 = %s, 학과명 = %s\n", my_name, major_name);
		System.out.printf("영어 = %d, 물리학 = %d, 미적분학 = %d\n", eng, phy, mth);
		System.out.printf("총점 = %d, 평균 = %.1f\n", eng + phy + mth, (float) ((eng + phy + mth) / 3));
		System.out.println(address);
	
// # 2
		System.out.print("연도를 입력하세요:");
		int year = sc.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				System.out.println("윤년입니다.");
		}} else {
			System.out.println("평년입니다.");
		}

	}

}
