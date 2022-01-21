package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말을 하나 생성해주시고 
		// 오버라이드된 메서드들을 하나씩 호출해보세요.
		
		Horse h1 = new Horse();
		h1.name = "호랑이";
	    h1.age = 3;
	    h1.gender = "암컷";
        h1.rank = 2;
        
        h1.getInfo();
        h1.howl();

	}

}
