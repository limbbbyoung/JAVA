package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		// 마법사와 궁수를 생성한 후 만든 메인입니다.
		Magician m1 = new Magician();
		Archer a1 = new Archer();
		Rabbit r1 = new Rabbit();
		Orc o1 = new Orc();
		
		m1.huntRabbit(r1);
		System.out.println("--------------");
		a1.huntOrc(o1);

	}

}
