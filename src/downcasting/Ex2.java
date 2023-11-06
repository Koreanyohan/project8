package downcasting;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Animal> aniList = new ArrayList<Animal>() ;
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		//ani List 리스트에 객체 주소값들 저장
		
		
		for (int i = 0; i< aniList.size(); i++) {
			
			Animal ani = aniList.get(i);
		
		
		if (ani instanceof Human) { // 참조변수 ani가 Human클래스로 형변환 가능 한가?
			Human h = (Human) ani; // ani instanceof Human 만족하면 ani의 주소값 h에 카피
			h.readBook();		
		} else if (ani instanceof Tiger) { 
			Tiger t = (Tiger) ani; // ani instanceof Tiger 만족하면 ani의 주소값 t에 카피
			t.hunting();
			
		}else if ( ani instanceof Eagle) {
			Eagle e = (Eagle) ani;// ani instanceof Eagle 만족하면 ani의 주소값 e에 카피
			e.flying();
			
			
		}
		
	}

}
}