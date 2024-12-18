package day_8;

public class Person {
	
	int age;
	String name;
	boolean married;
	int children;
	
	public static void main(String[] args) {
		Person man = new Person();
		
		man.age = 40;
		man.name = "James";
		man.married = true;
		man.children = 3;
		
		System.out.println( "이름 : " + man.name + " 나이 : " + man.age + " 결혼여부 : " + man.married + " 자녀수 : " + man.children );
	}

}
