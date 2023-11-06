package polymorphism.quiz;
//이거 보지 말고 답안보기. 가격부분에서 나는 return값안해놔서 오류뜸.
import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Customer4> customerList = new ArrayList<Customer4>();
		
		Customer4 customer1 = new Customer4 ("둘리");
		Customer4 customer2 = new VIPCustomer4 ("또치");
		Customer4 customer3 = new GOLDCustomer4 ("길동");
		
		customerList.add (customer1);
		customerList.add (customer2);
		customerList.add (customer3);
		
		
//		customerList.add(new Customer4("둘리"));
//		customerList.add(new GoldCustomer4("또치"));
//		customerList.add(new VIPCustomer4("도우너"));
		 // 람다식 for문
		for (Customer4 customer : customerList) {
			customer.calcPrice(10000); 
		}
		 //일반 for문
		for (int i = 0 ; i< customerList.size() ; i++){
			Customer4 customer = customerList.get(i);
			customer.calcPrice(10000);
		}
		
	
		for (Customer4 customer : customerList) {
			customer.showCustomerInfo() ;
		}
	}

}





//일반회원 클래스 
class Customer4 {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스포인트
	double bonusRatio; // 적립률

	public Customer4 (String name) {
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
class VIPCustomer4 extends Customer4 { // 상속받기
	double saleRatio; // 할인률

	public VIPCustomer4 (String customerName) {
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


class GOLDCustomer4 extends Customer4 { // 상속받기
	double saleRatio; // 할인률

	public GOLDCustomer4 (String customerName) {
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