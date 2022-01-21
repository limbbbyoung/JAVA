package accessmodifier;

public class Dog {// 정의부
	// 강아지의 정보를 자율적으로 3개 부여해주세요.
	// String name은 고정입니다.
	private String name;
	private int speed;
	private int weight;
	private int power;
	
	// 생성자로 강아지 정보를 처리하시되
    // 이름은 무조건 입력받게 해주세요.
	public Dog(String n) {
		speed = 10;
		weight = 18;
		power = 20;
		name = n;
	}
	
	// 수치 정보값이 변경되는 형태의 메서드 하나를 만들어주세요.
	public void eat() { 
		weight += 1;
		speed -= 2;
		System.out.println(name + " 이(가) 밥을 먹어서 몸무게가 " +
		weight + "이 되었고 달리는 속도가 " + speed + "가 되었습니다.");
	}
	
}
