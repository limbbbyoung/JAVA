package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		// 차 2대 생성
		Car c1 = new Car();
		c1.model = "람보르기니 아벤타도르";
		c1.price = 400000000;
		c1.owner = "임병영";
		Car c2 = new Car();
		c2.model = "벤츠 AMG";
		c2.price = 200000000;
		c2.owner = "임병영";
        // 콘솔에 정보 조회하기
		c1.getInfo();
		c2.getInfo();
	}

}
