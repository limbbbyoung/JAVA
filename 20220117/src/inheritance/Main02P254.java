package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐리러맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		// 생성한 객체의 정보를 get~~~~Info() 를 이용해 콘솔에도 같이 찍어주세요.
		
		Salaryman m1 = new Salaryman();
		m1.name = "임병영";
		m1.age = 25;
		m1.salary = 2990;
		
		
		m1.getSalaryInfo();
	    
		Student s3 = new Student();
		s3.name = "학생";
        s3.age = 62;
        s3.stuNum = 22;
        
     
        s3.getStuInfo();
	}

}
