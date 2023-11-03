package typecasting;

public class Ex1 {

	public static void main(String[] args) {

		VIPCustomer vip = new VIPCustomer();
		//super()이라는 VIPCustomer내부의 생성자 때문에, 부모인 Customer클래스의 생성자도 호출됨.
	}
}

class Customer {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스포인트
	double bonusRatio; // 적립률

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;// 1퍼센트

		System.out.println("Customer() 생성자 호출");
	}
}

//Vip 회원 클래스
class VIPCustomer extends Customer { // 상속받기
	double saleRatio; // 할인률

	public VIPCustomer() {
		super(); // 부모 클래스의 생성자 호출. 생략해도 자동으로 추가.
		// 컨트롤누르고 클릭하면 부모 클래스의 생성자로 가는거 볼 수 있다.
		// 같은 클래스 내의 한 생성자의 첫줄에 반드시 다신 생성자 호출해야. 즉 super 클래스 첫줄에.
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;

		System.out.println("VIPCustomer() 생성자 호출");
	}

}
