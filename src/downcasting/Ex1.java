package downcasting;

/*
 * 형변환된 변수를 다운캐스팅하기
 * */

public class Ex1 {

	public static void main(String[] args) {

		Animal animal = new Human();
//다운캐스팅 하기전에, 밑에 instanceof 식을 사용해서 다운캐스팅 가능한지를 확인해야하는 거다.
		if (animal instanceof Human) {
			Human human = (Human) animal;
			human.readBook();
		}
		if (animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.move();
		}
		
	}

}

//동물 클래스
class Animal { // 상위클래스
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal { // Animal을 상속받은 Human클래스
	public void move() { // 메소드 재정의
		System.out.println("사람이 두 발로 걷습니다. ");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}

class Tiger extends Animal { // Animal을 상속받은 Tiger클래스


	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

class Eagle extends Animal { // Animal을 상속받은 Eagle클래스
	public void move() {
		System.out.println("독수리가 하늘을 납니다 ");
	}

	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}
