package game.polymorphism;

public class Main01 {

	public static void main(String[] args) {
		// Warrior 하나, Orc 하나를 생성해주세요.
		Orc o1 = new Orc("Orc");
		Dragon d1 = new Dragon("Dragon");
		Goblin g1 = new Goblin("Goblin");
		Warrior w1 = new Warrior("임병영");
		// 생성 후 교전까지 해주세요.
		w1.hunt(o1);
		System.out.println("---------------------");
		w1.hunt(o1);
		System.out.println("---------------------");
		w1.hunt(o1);
		System.out.println("---------------------");
		w1.hunt(d1);
		System.out.println("---------------------");
		w1.hunt(g1);
	}
}
