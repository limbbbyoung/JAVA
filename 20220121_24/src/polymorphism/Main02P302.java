package polymorphism;

public class Main02P302 {
 
	public static void main(String[] args) {
		// 새로 만든 직장인과 선생님을 호출해줍니다.
		// Salaryman 생성 및 정보조회, Person으로 Salaryman을 받음
		Salaryman sm1 = new Salaryman("병영", 25, 300);
		// Teacher 동일하게 생성
		Teacher t1 = new Teacher("영쌤", 25, "수학");
		
		sm1.showPerson();
		t1.showPerson();
		System.out.println("---------------------------");
		sm1.getInfomoney();
		t1.showSubject();
	}
	
}
