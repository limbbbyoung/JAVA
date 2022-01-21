
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 수학(math) 평균점수를 내주시되, 합격자 평균만 내주세요.
		// 합격점수는 60점 이상입니다.
		
		
	    int math[] = {96, 23, 52, 82, 72, 31, 58};
	    int eng[] = {62, 42, 68, 31, 80, 77, 45};
	    int com[] = {10, 28, 39, 74, 65, 90, 98};
	    
	    //1. 총점 변수와 합격자수 변수 생성
	    int mathtotal = 0;
	    int mathcount = 0;
	    
	    // 영어와 컴퓨터식의 변수 생성
	    int engtotal = 0;
	    int engcount = 0;
	    int comtotal = 0;
	    int comcount = 0;
	    
	    //2. 반복문 실행
	    for(int score : math ) { 
	    	//3. 검사해서 60점 미만이면 스킵 
	    	if(score<60) { 
	    	 continue;
	    	} else { 
	    		// 4. 60점 이상이면 합격자수 1 더해주고, 총점에 합격점수 더해주기
	    		mathcount += 1;
		    	mathtotal += score;
	    	}
	    } System.out.println("합격자의 수학 평균은 " + mathtotal/mathcount + "입니다.");
	    
	    
	    // 영어 합격 점수 평균
	    for(int score2 : eng ) { 
	    	if(score2<60) { 
	    	 continue;
	    	} else { 
	    		engcount += 1;
		    	engtotal += score2;
	    	}
	    } System.out.println("합격자의 영어 평균은 " + engtotal/engcount + "입니다.");
	    
	    
	    // 컴퓨터 합격 점수 평균
	    for(int score3 : com ) { 
	    	if(score3<60) { 
	    	 continue;
	    	} else { 
	    		comcount += 1;
		    	comtotal += score3;
	    	}
	    } System.out.println("합격자의 컴퓨터 평균은 " + comtotal/comcount + "입니다.");
	}

}
