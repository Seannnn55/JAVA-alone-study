package sec01.exam06;

import sec01.exam04.*;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.print("1)-------------------)");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		//MyClass 의 필드를 이용함.
		
		System.out.print("2)-------------------)");

		MyClass myCasll2 = new MyClass(new Audio());
		
		// 이 생성자의 경우 생성하면서 바로 함수를 사용
		
		
		System.out.print("3)-------------------)");

		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		//필드값을 audio 로 바꾸고 메소드 2개 를 실행
		
		
		System.out.print("4)-------------------)");

		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Televison());
		
		//초기값 메소드로 바로 실행해버
		
	}

}
