package inheritance.quiz;

/*
 * 8장 10페이지
 * */

class Monster {
	int strength;
	int healthPoint;

	public void attack() { //몬스터 생성
		System.out.println("몬스터가 " + strength +"만큼 공격했다!");
	}

	public void showInfos() {
		System.out.println("몬스터의 공격력은 " + strength + "이고 체력은 "
										+ healthPoint + "이다.");
		}
}

class Slime extends Monster {//슬라임 생성
	String skill;

	public void spellSkill() {
		System.out.println("슬라임이 " + skill + "을 시전했다!");
	}
}

public class Quiz4 {

	public static void main(String[] args) {
		Monster monster = new Monster();
		monster.strength = 10;
		monster.healthPoint = 100;
		
		monster.showInfos();
		monster.attack();
		System.out.println();
		
		Slime slime = new Slime ();
		slime.strength = 30;
		slime.healthPoint = 200;
		slime.showInfos();
		slime.attack();
		slime.skill = "마비";
		slime.spellSkill();
		
		
		
	}

}
