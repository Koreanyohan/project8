package inheritance;

/*
 * 쇼핑몰 회원관리 프로그램 구현하기
 * 
 * */
public class Ex3_toBeUsed {

	public static void main(String[] args) {
		// 일반 회원 생성
		Customer customer = new Customer();
		customer.customerName = "둘리";
		customer.calcPrice(10000);
		customer.showInfo();
		//Vip 회원 생성
		VIPCustomer vip = new VIPCustomer() ;
		vip.customerName = "또치";
		vip.calcPrice(10000); // 오버라이팅 해어됨. 10퍼할인되야하는데 계산메소드 부모에게 받은거라서
		vip.showInfo();
	}
}

//일반회원 클래스 
class Customer {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스포인트
	double bonusRatio; // 적립률

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;// 1퍼센트
	}

	// 보너스 포인트를 적립하고, 지불할 가격을 계산하는 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio); // 보너스포인트 적립
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showInfo() {
//	System.out.println(customerName+ "님의 등급은 "+ ~~ );	
	}

}

//Vip 회원 클래스
class VIPCustomer extends Customer { // 상속받기
	double saleRatio; // 할인률

	public VIPCustomer() {
		super(); // 부모 클래스의 생성자 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	
}
