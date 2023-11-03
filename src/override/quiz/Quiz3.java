package override.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		Computer computer2 = new Notebook();
		computer2.on(); // cf) 컨트롤누르고 on누르면 부모클래스로감. 실행된 상태가 아니라서 그런거임. 실행될때는 자손 클래스로 가지.
		computer2.off();
		Computer computer3 = new Desktop();
		computer3.on();
		computer3.off();

	}
}

class Computer {
	void on() {
		System.out.println("컴퓨터를 켭니다.");
	}

	void off() {
		System.out.println("컴퓨터를 끕니다.");
	}
}

class Notebook extends Computer {

	@Override
	void on() {
		System.out.println("노트북을 켭니다.");
	}

	@Override
	void off() {
		System.out.println("노트북을 끕니다.");
	}

}

class Desktop extends Computer {

	@Override
	void on() {
		System.out.println("데스크탑을 켭니다.");
	}

	@Override
	void off() {
		System.out.println("데스크탑을 끕니다.");
	}

}