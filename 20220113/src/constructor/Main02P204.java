package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		// 농구선수를 생성해주세요.
		BasketballPlayer p1 = new BasketballPlayer(195,100);
        p1.dunkshoot();
        
        BasketballPlayer p2 = new BasketballPlayer(210,95);
        p2.dunkshoot();
	}

}
