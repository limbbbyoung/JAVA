package superkeyword;

public class Main02 {

	public static void main(String[] args) {
		// 초음속 비행기를 만들겠습니다. 초기속도는 300입니다.
		SupersonicAirplane sp1 = new SupersonicAirplane(300);
		// 비행을 2번 하게 해보세요.
        sp1.fly();
        sp1.fly();
	}

}
