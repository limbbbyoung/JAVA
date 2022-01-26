package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asean 조원 생성 없이 발표 점수를 콘솔에 찍어보세요.
		System.out.println(Asean.getPresentationScore());
		
		// Asean 조원 4명을 자율적으로 만든 다음, 각 인원의 성적을 조회해주세요.
		Asean a1 = new Asean(15,25,25);
		Asean a2 = new Asean(16,26,26);
		Asean a3 = new Asean(17,27,27);
		Asean a4 = new Asean(18,28,28);
		a1.showAseanInfo();
		System.out.println("-------------------------");
		a2.showAseanInfo();
		System.out.println("-------------------------");
		a3.showAseanInfo();
		System.out.println("-------------------------");
		a4.showAseanInfo();

	}

	
	// presentationScore는 private으로 전활될 경우
	// main지역에서 다이렉트로 조회가 불가능합니다.
	// Asean을 new키워드로 만들지 않고도
	// private presentationScore를 콘솔에 조회가능하도록
	// 조치를 취해보세요.
}
