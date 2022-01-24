package structure;

public class Structure03P190 {
	
	public static void getInfo(Cat c) {
		System.out.println(c.name + "의 정보입니다.");
		System.out.println("이름 : " + c.name + ", 나이 : "
				+ c.age + ", 성별 : " + c.gender);
	}

	public static void main(String[] args) {
		// 고양이 두마리를 생성해줍니다.
		Cat c1 = new Cat();
		c1.name = "방울이";
		c1.age = 3;
		c1.gender = "암컷";
		getInfo(c1);
		
		System.out.println("--------------------------------------");
		Cat c2 = new Cat();
		c2.name = "야옹이";
		c2.age = 2;
		c2.gender = "수컷";
        getInfo(c2);
        
	}

}
