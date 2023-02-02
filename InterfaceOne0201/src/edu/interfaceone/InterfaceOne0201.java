package edu.interfaceone;

interface IVehicle {
	
	//int makeYear = 2022;
	//final int makeYear = 2022;
	//public final int makeYear = 2022;
	public static final int makeYear = 2022;
	
	//void start();
	public abstract void start();
	
	public abstract void driving();

	default public void stop() {
		System.out.println("정지한다");
	}
	
	private void show() {
		System.out.println("makeYear = " + makeYear);
	}
	
	public static void turn() {
		System.out.println("방향전환한다");
	}
	
	static class Price {
		int salePercent = 10;
	}
	
}

interface IZerg {
	
	public abstract void display();
	
	default public void zergAttack() {
		System.out.println("Zerg 공격개시");
	}
}

interface ITerran {
	
	public abstract void terranAttack();
	
}

interface IProtous {
	
	public abstract void protousAttack();
	
}

interface IGame extends IZerg, ITerran, IProtous {
	
	public abstract void Goodgame();
	
}

class StarCraft implements IGame {

	@Override
	public void display() {
		System.out.println("Zerg 종족 개수 표시");
		
	}

	@Override
	public void Goodgame() {
		System.out.println("좋은 게임이었다");
		
	}

	@Override
	public void terranAttack() {
		System.out.println("terran 공격개시");
		
	}

	@Override
	public void protousAttack() {
		System.out.println("protous 공격개시");
		
	}
	
}

class Carrier {
	public void fetch() {
		System.out.println("승객을 운반하다");
	}
}

class Car extends Carrier implements IVehicle {

	public void fecth() {
		System.out.println("Car가 승객을 탑승시킴");
	}
	public void driving() {
		System.out.println("Car 타고 드라이빙");
	}
	
	public Car() {
		System.out.println("나는 Car의 기본생성자");
	}
	
	@Override
	public void start() {
		System.out.println("Car가 출발한다");
	}

	@Override
	public void stop() {
		System.out.println("Car가 정지한다");
	}
	
}


public class InterfaceOne0201 {

	public static void main(String[] args) {
		
//		IVehicle iob = new IVehicle(); 인터페이스 단독으로 객체 생성 불가
		IVehicle k5 = new Car();
		k5.start();
		k5.stop();
		IVehicle.turn();
		k5.driving();
		
		IGame yunel = new StarCraft();
		yunel.zergAttack();
		yunel.display();
		yunel.Goodgame();
		yunel.protousAttack();
		yunel.terranAttack();
		
	}
	
}
