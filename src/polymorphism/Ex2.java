package polymorphism;



/*
 * 쇼핑몰 회원관리 프로그램에 다형성 적용
 * */
public class Ex2 {

	public static void main(String[] args) {
		Customer3 customer1 = new Customer3 ("둘리");
		customer1.calcPrice(10000);
		customer1.showCustomerInfo();
		
		Customer3 customer2 = new VIPCustomer3 ("또치");
		customer2.calcPrice(10000);
		customer2.showCustomerInfo();
		//!! 다형성 -> 하나의 클래스로 참조변수 이용해서 다양한 인스턴스 처리
		}

}


//일반회원 클래스 
class Customer3 {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스포인트
	double bonusRatio; // 적립률

	public Customer3 (String name) {
		customerName = name;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}

	// 보너스 포인트를 적립하고, 지불할 가격을 계산하는 메소드
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio); // 보너스포인트 적립
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다.");
	}

	public void showCustomerInfo() {
	System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");	
	}

}
//Vip 회원 클래스
class VIPCustomer3 extends Customer3 { // 상속받기
	double saleRatio; // 할인률

	public VIPCustomer3 (String customerName) {
		super(customerName); // 부모 클래스의 생성자 호출  
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

	@Override
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price*bonusRatio);
		int salePrice = price - (int) (price*saleRatio); //saleRatio  double형이라 괄호안에것 계산하면 double나옴. 결과적으로 우항 값 double나옴. 좌항은 int지.
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
		//이전에 부모 타입의 calPrice메서드에서는 price를 결과값으로 넣어줬지만,
		// 오버라이딩 한 값에서는 price를 salePrice로 바꿈.
		
	}

	
	
}


class GOLDCustomer3 extends Customer3 { // 상속받기
	double saleRatio; // 할인률

	public GOLDCustomer3 (String customerName) {
		super(customerName); // 부모 클래스의 생성자 호출  
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

	@Override
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price*bonusRatio);
		int salePrice = price - (int) (price*saleRatio); //saleRatio  double형이라 괄호안에것 계산하면 double나옴. 결과적으로 우항 값 double나옴. 좌항은 int지.
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
		//이전에 부모 타입의 calPrice메서드에서는 price를 결과값으로 넣어줬지만,
		// 오버라이딩 한 값에서는 price를 salePrice로 바꿈.
		
	}

	
	
}