package polymorphism.quiz;
//이거 보지 말고 답안보기. 가격부분에서 나는 return값안해놔서 오류뜸.


class Car {
	public void run() {
		System.out.println("자동차가 달린다");
	}
}

class Bus extends Car {
	public void run() {
		System.out.println("버스가 달린다.");
	}
}

class SportCar extends Car {
	public void run() {
		System.out.println("스포츠 카가 달린다.");
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		
		runCar(new Car());
		runCar(new Bus());//Car car = new Bus()됨. 따라서 Car클래스참조변수로 Bus다루기 가능.
		runCar(new SportCar());

	public static void runCar(Car car) {//메인함수 static이라 메소드도 static이어야.
		//매개변수에 자식 클래스인 버스, 스포츠카 받을 수 있다.
		//만약 다형성을 활용하지 않는다면 각 클래스를 매개변수로 사용하는 클래스를 만들어야 함.
		car.run();
	}
}	
}