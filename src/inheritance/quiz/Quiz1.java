package inheritance.quiz;

/*
 * 동물(Animal)을 정의하는 클래스를 만드세요.
 * 속성 : 다리
 * 동물 클래스를 상속받는 호랑이(Tiger) 클래스를 만드세요.
 * 속성 : 꼬리
 * 동물 클래스를 상속받는 독수리 (Eagle) 클래스를 만드세요.
 * 속성 : 날개

 * 호랑이 인스턴스를 생성하세요. (다리 4개, 꼬리 1개)
 * 독수리 인스턴스를 생성하세요. (다리 2개, 날개 2개)
 * */

class Animal { // 부모클래스 (Tiger, Eagle클래스의)
	int numOfLegs;
}

class Tiger extends Animal { // 자식클래스
	int numOfTails;
}

class Eagle extends Animal { // 자식클래스
	int numOfWings;
}

public class Quiz1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.numOfLegs = 4; // 부모의 속성  자신의 속성처럼 이용
		tiger.numOfTails = 1;
		System.out.print("호랑이 다리 갯수 " + tiger.numOfLegs + "  , ");
		System.out.println("호랑이 꼬리 갯수 " + tiger.numOfTails);

		Eagle eagle = new Eagle();
		eagle.numOfLegs = 2; // 부모의 속성  자신의 속성처럼 이용
		eagle.numOfWings = 2;
		System.out.print("독수리 다리 갯수 " + eagle.numOfLegs + "  , ");
		System.out.println("독수리 날개 갯수 " + eagle.numOfWings);

	}
}






