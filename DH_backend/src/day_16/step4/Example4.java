package day_16.step4;
// 부모클래스 : Object
class Car {
	// 멤버변수
	// Tire 타입의 멤버변수를 가짐
    Tire tire;
    
    // 메소드
    public void run(){  this.tire.roll();    }
}

// 부모클래스 : Object 자식클래스 : HankookTire, KumhoTire
class Tire {
	// 메소드
    public void roll(){
        System.out.println("일반 타이어가 회전합니다.");
    }
}

// 부모클래스 : Object , Tire
class HankookTire extends Tire {
	// Tire 메소드 오버라이딩
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
}
class KumhoTire extends Tire {
	// Tire 메소드 오버라이딩
	@Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}

public class Example4 {
    public static void main(String[] args) {
    	// Car 클래스 인스턴스 생성_1
        Car myCar = new Car(); // Car -> Object
        // Car 클래스의 멤버변수가 Tire 타입이기 때문에 Car 클래스의 인스턴스만 생성했을 시 null 출력 
        // myCar.run();
        
        // Car 클래스 인스턴스 생성_2
        Car yourCar = new Car(); // Car -> Object
        
        // Tire 인스턴스를 생성 -> myCar 의 tire 멤버변수가 참조   
        yourCar.tire = new Tire();
        // yourCar.tire 가 Tire 클래스의 인스턴스를 참조하고 있기 때문에 Tire 클래스의 메소드 실행
        yourCar.run();	

        // Tire 인스턴스를 생성 -> myCar 의 tire 멤버변수가 참조
        myCar.tire = new Tire();
        // myCar.tire 가 Tire 클래스의 인스턴스를 참조하고 있기 때문에 Tire 클래스의 메소드 실행
        myCar.run();

        // HankookTire 인스턴스 생성 -> myCar.tire 멤버변수가 참조
        myCar.tire = new HankookTire();
        // myCar.tire 가 HankookTire 인스턴스를 참조하고 있기 때문에 HankookTire 클래스에 오버라이딩된 메소드 실행
        myCar.run();

        // KumhoTire 인스턴스 생성 -> myCar.tire 멤버변수가 참조
        myCar.tire = new KumhoTire();
        // myCar.tire 가 KumhoTire 인스턴스를 참조하고 있기 때문에 KumhoTire 클래스에 오버라이딩된 메소드 실행
        myCar.run();
        
        
        // yourCar 변수는 Tire 인스턴스를 참조하고 있기 때문에 Tire 클래스의 메소드 실행 
        yourCar.run();

        // myCar.tire 이 참조하는 인스턴스에 KumhoTire 타입 존재 여부 -> true
        System.out.println( myCar.tire instanceof  KumhoTire  );
        
        // 만약 해당 인스턴스에 Tire 타입이 존재 시
        if( myCar.tire instanceof Tire ){ // -> true
            myCar.tire = new HankookTire();	// HankookTire 인스턴스를 생성 -> myCar의 tire 멤버변수가 참조
        }
        
        // if 문 실행 결과 myCar 에는 HankookTire 인스턴스가 참조되고 있는 상태 -> HankookTire 클래스에 오버라이딩된 메소드 실행
        myCar.run();
    }
}
