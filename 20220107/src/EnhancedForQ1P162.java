
public class EnhancedForQ1P162 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 위 3개의 변수명으로 배열을 만들어 자료를 담아주신 다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한 다음 
		// 콘솔창에 출력해주세요.
		
		int math [] = {96, 23, 52, 82, 72, 31, 58};
		int eng [] = {62, 42, 68, 31, 80, 77, 45};
		int com [] = {10, 28, 39, 74, 65, 90, 98};
		
		int mathTotal = 0;
		int engTotal = 0;
		int comTotal = 0;
		for(int score : math ) {
			mathTotal += score;
		} 
		for(int score2 : eng ) {
			engTotal += score2;
		}
		for(int score3 : com) { 
			comTotal += score3;
		}
		System.out.println("수학 평균 : " + mathTotal / math.length);
		System.out.println("영어 평균 : " + engTotal / eng.length);
		System.out.println("컴퓨터 평균 : " + comTotal / com.length);
		
		// 본 문제를 받았을 때 풀지 못한 이유는 복합 대입 연산자에 대한 이해도가 부족했기 때문
		
		

	}

}
