package overloading;

public class Main01 {

	public static void main(String[] args) {
		// 1. Calculator를 생성해주세요.	
		Calculator c1 = new Calculator();
		// 2. plus(int)를 호출해보겠습니다.
		c1.plus(4);
		// 3. plus(int, int)를 호출해보세요.
		c1.plus(5,8);
		// 4. plus(double)을 호출해보세요.
		c1.plus(5.5);
		// 5. plus(String)을 호출해보세요.
		c1.plus("가나다라");

	}

}
