import java.util.Scanner;

public class ElseifQ1P97 {
       
	 public static void main(String[] args) {
	   // 성적 판독기를 만들어보겠습니다.
	   // if ~ else if ~ else 구문을 사용해 만들어주세요.
	   // 성적기준 95 이상 A+, 90이상 A0, 85이상 B+, 80이상 B0
	   // 75이상 C+, 70이상 C0, 65이상 D+, 60이상 D0
	   // 60미만 F 로 콘솔창에 출력해주세요.
	   // 스캐너로 int score; 변수에 성적을 입력한 결과로 콘솔에 성적이 나오면 됩니다.
	   /* 추가 설명 주석
	    중요한 점은 true가 나오는 경우의 수가 적은 것이 
	    위로 가야한다.즉,true의 범위가 넓은 것이 현재 코드에서 상위호환에 있는 것.
        더 많은 변수를 입력할 수 있기 때문임.  
	     */
		 
		 Scanner scan = new Scanner(System.in);
         System.out.println("성적을 입력해주세요.");
         int score = scan.nextInt();
         
         if(score >= 95) {//95점 이상 A+
        	 System.out.println("A+입니다.");
         } else if(score >= 90) {//90점 이상 A0
        	 System.out.println("A0입니다.");
         } else if(score >= 85) {//85점 이상 B+
        	 System.out.println("B+입니다.");
         } else if(score >= 80) {//80점 이상 B0
        	 System.out.println("B0입니다.");
         } else if(score >= 75) {//75점 이상 C+
        	 System.out.println("C+입니다.");
	     } else if(score >= 70) {//70점 이상 C0
	    	 System.out.println("C0입니다.");
	     } else if(score >= 65) {//65점 이상 D+
	    	 System.out.println("D+입니다.");
	     } else if(score >= 60) {//60점 이상 D0
	    	 System.out.println("D0입니다.");
	     } else { //60점 미만일 경우 F
	    	 System.out.println("F입니다.");
	     }
	     scan.close();
}
}