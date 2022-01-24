package polymorphism;

public class Salaryman extends Person{

	private int money;
	
	public Salaryman(String name, int age, int money) {
		super(name, age);
		this.money = money;
	}
    public void showPerson() {
    	// 부모쪽 showPerson() 에 이미 name, age를 출력해주는 구문이 있음.
    	super.showPerson(); // 부모쪽에 조회 메서드 호출해서 name, age 출력
    	System.out.println("월급 : " + money); // 부모쪽에 없는 요소 추가 출력
    }
    
    public void getInfomoney() {
    	System.out.println("직장인이 월급을 " + money + "만큼 받고 있습니다.");
    }

}
