package day_17.step3;
class Car {
    Tire tire;
    public void run(){  this.tire.roll();    }
}

interface Tire {
    void roll();
}

class HankookTire implements Tire {
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
}
class KumhoTire implements Tire {
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}


public class Example3 {
	public static void main(String[] args) {
		 // Car 타입의 인스턴스 생성
		 Car myCar = new Car();
		 // Tire 인터페이스의 추상메소드가 클래스를 통해 구체화되지 않았기 때문에 null 
	     // myCar.run();
	     Car yourCar = new Car();
	    
	     // 인터페이스는 공통적인 부분을 추상메소드를 통해 만드는 것으로 인스턴스화 불가
	     // yourCar.tire = new Tire();
	     // yourCar 는 아직 Tire 인터페이스의 추상메소드를 구체화하는 클래스 타입을 할당받지 못함
	     // yourCar.run();

	     // 인터페이스는 공통적인 부분을 추상메소드를 통해 만드는 것으로 인스턴스화 불가
	     //myCar.tire = new Tire();
	     // Car 는 아직 Tire 인터페이스의 추상메소드를 구체화하는 클래스 타입을 할당받지 못함
	     //myCar.run();
	     
	     // HankookTire 인스턴스를 생성하여 tire 인터페이스를 구체화
	     myCar.tire = new HankookTire();
	     // HankookTire 클래스 내에서 구체화한 tire 의 run() 메소드 실행
	     myCar.run();

	     // KumhoTire 인스턴스르 생성하여 tire 인터페이스를 구체화
	     myCar.tire = new KumhoTire();
	     // KumhoTire 클래스 내에서 구체화한 tire 의 run() 메소드 실행
	     myCar.run();
	     //yourCar.run();

	     // myCar.tire 가 참조하는 인스턴스에 KumhoTire 타입 존재 여부 -> true
	     System.out.println( myCar.tire instanceof KumhoTire);
	     
	     if( myCar.tire instanceof Tire){	// myCar.tire 가 tire 인터페이스를 구현하는지 확인 -> true
	         myCar.tire = new HankookTire();	// true 이기 때문에 myCar.tire 멤버변수가 생성된 HankookTire 인스턴스 참조
	     }
	     myCar.run();
	}
}
