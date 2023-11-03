package inheritance.quiz;

/*
 * 베이직티비 (BasicTV)를 정의하는 클래스를 만드세요.
 * 속성 : 전원상태, 채널, 볼륨
 * 
 * 베이직 티비 클래스를 상속받는 스마트티비 (SmarTV)클래스를 만드세요.
 * 속성 : 아이피
 * 
 * 베이직티비 인스턴스를 생성하세요 . (전원 상태:on, 채널 :7, 볼륨:20)
 * 스마트티비 인스턴스를 생성하세요 . (전원 상태:on, 채널 :11, 볼륨:30, 아이피 : 192.168.0.111)
 * 모든 인스턴스의 정보를 출력하세요.
 * */

class BasicTV{
	boolean power ; // true 면 on  false면 off
	int channel ;
	int volume;
	
	void showInfos() {
		System.out.printf("전원 상태 : " + power + "%n" +
						"채널 : " + channel + "%n"  +
						"볼륨 : " + volume + "%n"
						);
	}
}

class SmartTV extends BasicTV {
	String numOfIP ;
	
	void showInfos2() {
		System.out.printf(	"아이피 : " + numOfIP);
	}
}

public class Quiz2 {

	public static void main(String[] args) {
		 BasicTV basic = new BasicTV ();
		 basic.power = true ;
		 basic.channel = 7 ;
		 basic.volume = 20 ;
		 basic.showInfos();
		 System.out.println();
		 
		 SmartTV smart = new SmartTV();
		 smart.power = true ;
		 smart.channel = 11 ;
		 smart.volume = 30 ;
		 smart.numOfIP = "192.168.0.111";
		 smart.showInfos(); // 부모 메소드 사용함.
		 smart.showInfos2();
	}

}
