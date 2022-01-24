package structure;

public class Structure02P190 {

		// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
        public static void getInfo(Person p) {
        	System.out.println(p.name + "의 정보입니다.");
        	System.out.println("이름 : " + p.name + ", 나이 : " + p.age
        			+ ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
        }
        
        public static void main(String[] args) {
			// 사람을 두 명 만들어보세요(a, b)
        	Person a = new Person(); // a라는 사람
        	a.name = "흰둥이";
        	a.age = 15;
        	a.pNum = "01012341234";
        	a.uNum = 2;
        	getInfo(a);
        	
        	Person b = new Person(); // b라는 사람
        	b.name = "검둥이";
        	b.age = 15;
        	b.pNum = "01043214321";
        	b.uNum = 3;
        	System.out.println("--------------------------------------------");
        	getInfo(b);
        	
		}
}

