package game.interaction;

public class Main02 {
	// 드래곤과 고블린을 생성한 후 
	// 두번째 전사를 만들어 사냥하는 메인입니다.

	public static void main(String[] args) {
		Warrior w2 = new Warrior();
		Dragon d1 = new Dragon();
		Goblin g1 = new Goblin();
		Rabbit r1 = new Rabbit();
		
		w2.huntDragon(d1);
		w2.huntDragon(d1);
		w2.huntDragon(d1);
		w2.huntDragon(d1);
		w2.huntDragon(d1);
		System.out.println("--------------------");
		w2.huntGoblin(g1);
		System.out.println("--------------------");
		w2.huntRabbit(r1);
		
	}

}
