package polymorphism;

public class Teacher extends Person {

	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
    public void showPerson() {
    	// 부모쪽 showPerson() 에 이미 name, age를 출력해주는 구문이 있음.
    	super.showPerson();
    	System.out.println("과목 : " + subject);
    }
    
    public void showSubject() { 
    	System.out.println("담당 과목은 " + subject + "입니다.");
    }

}

