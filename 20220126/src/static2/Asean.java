package static2;

public class Asean {
	// 출석점수(check), 중간고사(midTerm), 기말고사(finalTerm)
	// 변수를 설정해주세요.
	// 위 변수들은 개별 객체가 따로따로 관리합니다.
	private int check;
	private int midTerm;
	private int finalTerm;
	// 공용 발표 점수인 presentationScore를 static으로 만들어주세요.
	// 이 점수는 19점입니다.
	private static int presentationScore = 19;
	// 생성자는 객체 생성시 출석, 중간고사, 기말고사 점수만
	// 받아서 수치를 입력해줍니다.
	public Asean (int check, int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	// 일반 메서드로 showAseanInfo()를 생성해주시되
	// 성적 전체를 콘솔에 조회하게 해주세요.
	// 중간고사 : XX점, 기말고사 : YY점 ...
	public void showAseanInfo() { 
		System.out.println("조원의 성적");
		System.out.println("중간고사 : " + this.midTerm + ", 기말고사 : " + 
	      this.finalTerm + ", 출석점수 : " + this.check +", 발표점수 : " + 
				presentationScore );
	}
	public static int getPresentationScore() {
		return presentationScore;
	}

	
 }


