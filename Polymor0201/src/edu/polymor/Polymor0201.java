package edu.polymor;

abstract class Mammal {
	
	abstract public void moving();
	
	public Mammal() {
		System.out.println("난 Mammal 기본생성자");
	}
	
	public void talk() {
		
	}
	
	public void show() {
		
	}
		
}



class Person extends Mammal{
	protected final int IQ = 140;
	protected String name = null;
	protected int age = 0;
	
	static char blood = 'A';
	
	public static void display() {
		System.out.println("display method" + blood);
	}
	
	public Person() {
		System.out.println("난 Person 기본 생성자");
	}
	
	public Person(String name, int age) {
		super();
		System.out.println("난 매개변수 2개인 Person 생성자");
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String pn) {
		name = pn;
	}
	
	public String getName() {
		return name;
	}
	
	public void talk() {
		System.out.println("talk()메서드이다.");
		name = "아무개";
	}
				
	public void talk(String shouting) {
		System.out.println(shouting);
	}
	
	public void talk(String shouting, int page) {
		System.out.print(shouting);
		System.out.print(page);
	}
	
	public void talk(int page, String shouting) {
		System.out.print(shouting);
		System.out.print(page);
	}
	
	public void breathe() {
		age = 1;
	}
	
	public void show() {
		System.out.println("난 Person의 show");
		System.out.printf("name=%s, age=%d\n", name, age);
	}
	
	public void moving() {
		System.out.println("Person이 움직인다.");
	}
}

class Man extends Person {
	
	final int IQ = 150;
	private int money;
	protected String job;
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}


	public Man() {
		super();
		System.out.println("나는 Man의 기본생성자");
	}
	
	public Man(String name, int age, int money, String job) {
//		super();
		super(name, age);
		System.out.println("난 인자 4개인 생성자");
//		this.name = name;
//		this.age = age;
		this.money = money;
		this.job = job;
	}
	
	
	public void show() {
		super.show();
		System.out.printf("ManIQ=%d\nPersonIQ=%d\n", this.IQ, super.IQ);
//		System.out.printf("name=%s, age=%d\n", name, age);
		System.out.printf("money=%d, job=%s\n", money, job);
	}
	
	public void work() {
		System.out.println("man이 일한다.");
	}
	
	public void moving() {
		System.out.println("Man이 움직인다.");
	}

	
}

class tmp extends Man{
	
	public tmp(String name, int age, int money, String job) {
		super();
	}
	
	public void show() {
		System.out.println("tmp의 show메소드");
	}
}



public class Polymor0201 {

	public static void main(String[] args) {
 
		Mammal jaesuk = new Man("유재석", 51, 70000, "국민MC");
		jaesuk.show();
		jaesuk.talk();
		jaesuk.moving();
		
		
	}

}
