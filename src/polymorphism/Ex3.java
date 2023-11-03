package polymorphism;

public class Ex3 {
// 밑에 클래스들 전부 ex1에 있음.
	public static void main(String[] args) {
		moveAnimal (new Human());
		moveAnimal (new Tiger());
		moveAnimal (new Eagle());
	}
	
//부모 클래스가 매개변수에 있어서 자식클래스인 사람, 호랑이,독수리를 받을 수 있음.
	public static void moveAnimal (Animal animal) {//여기에 new Human()따위 대입
			//ㄴmoveAnimal메서드 호출될 시 -> Animal animal = new Human();이라 생각.
		animal.move();
	}
}
//cf)메인함수보면 'static' void main이지. 그래서 인스턴스 메서드 못온다. 스테틱 메서드만 올 수 있다.


//만약 다형성을 활용하지 않는다면 각각의 클래스를 매개변수로 사용하는 메소드를 만들어야함
//public static void moveAnimal(Human human) {
//	human.move();
//}
//
//public static void moveAnimal(Tiger tiger) {
//	tiger.move();
//}
//
//public static void moveAnimal(Eagle eagle) {
//	eagle.move();
//}
}
