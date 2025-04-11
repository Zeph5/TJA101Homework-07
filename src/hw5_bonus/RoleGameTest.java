package hw5_bonus;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
//		saber.attack();
//		saber.move();
//		
//		archer.attack();
//		archer.move();
		
		System.out.println();
		System.out.println(saber.getName() + " 已擊敗巨人");
		System.out.println(saber.getName() + " 獲得 738 經驗值！");
		saber.gainEXP(738);
		System.out.println();
		saber.getHeroInfo();
		
		System.out.println();
		System.out.println(archer.getName() + " 已擊敗");
		System.out.println(archer.getName() + " 獲得 146 經驗值！");
		archer.gainEXP(146);
		System.out.println();
		archer.getHeroInfo();
	}

}
