package edu.switchtwo;

public class SwitchSecond {

	public static void main(String[] args) {
		WhoIsIt("호랑이");
		WhoIsIt("사자");
		WhoIsIt("독수리");
		WhoIsIt("참새");
		WhoIsIt("고등어");
		WhoIsIt("연어");
		WhoIsIt("곰팡이");
		String tmp = null;
		tmp = Fone(1);
		System.out.println("tmp = " + tmp);
		tmp = Fone(2);
		System.out.println("tmp = " + tmp);
		tmp = Fone(3);
		System.out.println("tmp = " + tmp);
		
	}
	
//	static void WhoIsIt(String bio) {
//		switch(bio) {
//		case "호랑이":
//		case "사자":
//			String kind = "포유류";
//			break;
//		case "독수리":
//		case "참새":
//			String kind = "조류";
//			break;
//		case "고등어":
//			String kind = "어류";
//		default:
//			System.out.println("어이쿠");
//			String kind = "...";
//		}
//		return kind;
	
/*
	static String WhoIsIt(String bio) {
		switch(bio) {
		case "호랑이":
		case "사자":
			String kind = "포유류";
			break;
		case "독수리":
		case "참새":
			String kind = "조류";
			break;
		case "고등어":
			String kind = "어류";
			break;
		default:
			System.out.println("어이쿠");
			String kind = "...";
		}
		return kind;
	
	static String WhoIsIt(String bio) {
		String kind;
		switch(bio) {
			case "호랑이", "사자" -> kind = "포유류";
			case "독수리", "참새" -> kind = "조류";
			case "고등어", "연어" -> kind = "어류";
			default -> {
				System.out.println("어이쿠");
				kind = "...";
			}
		}
		return kind;
*/
	
	static void WhoIsIt(String bio) {
		String kind =
		switch(bio) {
			case "호랑이", "사자" -> "포유류";
			case "독수리", "참새" -> "조류";
			case "고등어", "연어" -> "어류";
			default -> {
				System.out.println("어이쿠");
				yield  "...";
			}
		};
		System.out.printf("%s는 %s다.\n", bio, kind);
	}
	
	public static String Fone(int n) {
		return switch(n) {
		case 1 -> "한개";
		case 2 -> "두개";
		default -> "많이";
		};
	}

}
