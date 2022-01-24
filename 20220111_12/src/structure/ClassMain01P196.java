package structure;

public class ClassMain01P196 {
	
	// PersonClass를 조회할 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass 내부에 필요한 메서드를 작성해놨기 때문입니다.

	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(PersonClass)
    PersonClass p1 = new PersonClass();
    p1.name = "병영1";
    p1.age = 25;
    p1.pNum = "123";
    p1.uNum = 1;
    p1.hobby = "농구";
    
    PersonClass p2 = new PersonClass();
    p2.name = "병영2";
    p2.age = 25;
    p2.pNum = "321";
    p2.uNum = 2;
    p2.hobby = "축구";
    // 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
    p1.getInfo();
    System.out.println();
    p2.getInfo();
	}

}
