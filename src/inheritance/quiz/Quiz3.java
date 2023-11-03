package inheritance.quiz;

/**
 * PPT 8장 9쪽
 */
class Pen {
	int thickness; // 펜의 굵기
	double remains;// 남은 양
	void showInfos() {
		System.out.println("펜의 굵기 : " + thickness + ", 남은 양 : " + remains*100 + "퍼센트");
	}
}

class BallPen extends Pen {
	String color; // 볼펜의 색
	void showInfoss() {
		System.out.println("볼펜의 색 : " + color);
	}
}

class ManYear extends Pen {
	String brand;
	void showInfosss() {
		System.out.println("볼펜의 브랜드 : " + brand);
}
}

public class Quiz3 {
	public static void main(String[] args) {
		Pen pen = new Pen();
		
		BallPen ballpen = new BallPen();
		ballpen.thickness = 2;
		ballpen.remains = 1;
		ballpen.color = "blue";
		
		
		ballpen.showInfos();
		ballpen.showInfoss();

		ManYear manyear = new ManYear();
		manyear.thickness = 3;
		manyear.remains = 0.8;
		manyear.brand = "Montblanc";
		
		manyear.showInfos();
		manyear.showInfosss();	
	}
}

