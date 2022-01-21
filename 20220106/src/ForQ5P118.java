import java.util.Scanner;

public class ForQ5P118 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태로 정사각형이 찍히도록 
		// 중첩 반복문을 작성해주세요.
		// ex) 3 입력시 
		// ***
		// ***
		// ***
		// 위와 같이 3*3 형태로 출력
		// 가로줄을 출력할 때는 System.out.println("*");
		// 다음줄로 커서를 내릴때만 System.out.println();를 씁니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int a = scan.nextInt();
		
		// i for문 내부에서 println을 실행하므로 세로 길이를 담당
		for(int i = 0; i < a; i++) {
			// j for문 내부에서 print를 이용해 별을 일렬로 나열시키므로
			for(int j = 0; j < a; j++) {
			System.out.print("*"); 
		  } System.out.println();
	    }
		scan.close();
     }
  }