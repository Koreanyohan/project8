package typecasting;

public class Ex2 {
	public static void main(String[] args) {
		VIPCustomer2 vip = new VIPCustomer2 ("둘리") ;
	}
}
//일반회원 클래스 
class Customer2 {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스포인트
	double bonusRatio; // 적립률

	public Customer2 (String name) {
		customerName = name;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
}
//Vip 회원 클래스
class VIPCustomer2 extends Customer2 { // 상속받기
	double saleRatio; // 할인률

//	public VIPCustomer2 () {
//		super(); // 부모 클래스의 생성자 호출  
// ->부모클래스의 생성자가 클래스이름()형태가 아니라서 오류뜸.
//	 따라서 , 부모클래스의 생성자의 형태에 맞게 써줘야됨.
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//	System.out.println("VIPCustomer() 생성자 호출");
//	}
		
	public VIPCustomer2 (String customerName) {
		super(customerName); // 부모 클래스의 생성자 호출  
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
}