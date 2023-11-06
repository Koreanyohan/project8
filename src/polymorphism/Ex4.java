package polymorphism;
//이거 보지 말고 답안보기. 가격부분에서 나는 return값안해놔서 오류뜸.
import java.util.ArrayList;
//예제 3번에 있는 Customer와 VIP클래스 사용하기

public class Ex4 {

	public static void main(String[] args) {
		
		//회원을 담을 리스트 생성
		ArrayList<Customer2> customerList = new ArrayList<Customer2>();
		
		Customer2 customer1 = new Customer2("둘리");//일반 회원 생성
		Customer2 customer2 = new Customer2("또치");
		Customer2 customer3 = new Customer2("도우너");
		Customer2 customer4 = new VIPCustomer2("마이콜"); //vip 회원 생성 // 부모클래스 참조변수로 자손클래스 인스턴스화
		Customer2 customer5 = new VIPCustomer2("고길동");
		
		customerList.add(customer1) ; // 리스트에 회원 추가
		customerList.add(customer2) ; 
		customerList.add(customer3) ; 
		customerList.add(customer4) ; 
		customerList.add(customer5) ; 
		
		System.out.println("====== 회원 등급에 따라 할인율과 보너스 포인트 계산 ======");
		for (Customer2 customer : customerList) { // 배열의 요소를 하나씩 Customer 형으로 꺼내기
			System.out.println(customer.customerName + "님이 " + customer.calcPrice(10000) + "원 지불하였습니다.");// 실제 인스턴스에 따라 재정의된 메소드 호출
	}
		
		
		
		
		for (Customer2 customer : customerList) {
			customer.showCustomerInfo();
		}
		

}
}
