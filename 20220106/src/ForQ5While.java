import java.util.Scanner;

public class ForQ5While {

	public static void main(String[] args) {
		// 본문은 for문의 문제에서 for이 아닌 while을 활용한 문제입니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int a = scan.nextInt();
		
		int i = 0;
		    while ( i < a ) { i += 1;
		int j = 0;
			while ( j < a ) { j += 1;
			System.out.print("*");
		} System.out.println();
	  }
		    
		    // 수업시간에 추가적을 풀어 본 문제인데 제출은 했는데 강사님의 코딩페이지와는 조금 다르다
		    // 여기서 맞혔다고 좋아할 것이 아니라 강사님이 짠 코드와 내가 짠 코드를 비교했을 때 
		    // 어떤 부분이 부족한지 파악하는 것이 중요한 점이라고 본다.
		    
		scan.close();     
    }
 }