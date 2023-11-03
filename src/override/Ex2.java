package override;
/*
 * 부모클래스로 형변환하고 재정의된 메서드 호출하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		Customer2 vc = new VIPCustomer2 ("둘리"); // Ex1에서 정의된 클래스들임.
		vc.calcPrice(10000); // 오버라이딩된 자식 메서드가 실행됨.
	//ㄴ Ex1에서 부모랑 자식 calcPrice브레이크걸고 여기 메인함수 브레이크걸고 보면, 자식꺼로 연산시에 간다.

	}

}
