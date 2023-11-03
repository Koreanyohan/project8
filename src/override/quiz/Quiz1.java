package override.quiz;
/*
 * 8장20페이지
 * */

public class Quiz1 {
// 자식 클래스들에 source - override/implements methods 기능도 사용해보자.
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.eatFoods();
		cat.bark();
		dog.eatFoods();
		dog.bark();
	}
}

class Animal {
	void eatFoods() {
		System.out.println("냠냠"); 
	}
	void bark() {
		System.out.println("카아악~~");
	}
}

class Cat extends Animal {
	void eatFoods() {
		System.out.println("고양이는 쥐를 먹는다");
	}
	void bark() {
		System.out.println("고양이는 야옹하고 짖는다.");
	}
}

class Dog extends Animal {
	void eatFoods() {
		System.out.println("개는 고기를 먹는다.");
		}
	void bark() {
		System.out.println("개는 멍멍하고 짖는다.");
	}
}


