package typecasting;

public class Ex3 {

	public static void main(String[] args) {
		// 부모타입(속성 4개) 변수 = 자식(부모타입 속성 에 1개 더 해서 속성 5개) 인스턴스 생성 
		Customer2 vc = new VIPCustomer2("둘리");  // 이거 Ex2에서 불러온거임. 그래서 여기 class들 이 클래스파일에없음
		System.out.println(vc.customerName);

	}
}

