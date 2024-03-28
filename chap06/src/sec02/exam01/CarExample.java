package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("제작회사: " +myCar.company);
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " +myCar.speed);
	}

}
