package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean() 기능을 이용해서 
		// 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서 
		// 프로그램이 다 끝났을때 앞면 몇 회, 뒷 몇 회인지
		// 콘솔창에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력받습니다.
		Scanner scan = new Scanner(System.in);
		
		// 동전 던질 횟수 입력받기
		System.out.println("동전 던지기를 하겠습니다.실행횟수를 입력해주세요.");
		int n = scan.nextInt();
		
		int front = 0;
		int back = 0;
		Random random = new Random();
		for(int i = 0; i < n; i++) { 
			boolean Throw = random.nextBoolean();
			if( Throw == true ) {
				front += 1;
			} else {
				back += 1;
			}
		} System.out.println("동전 던지기 게임 실행 횟수 : " + n);
		System.out.println("동전 던지기 게임 실행 결과 총 앞면 " + front + "회, 뒷면 " + back + "회 나왔습니다."); 

	}

}
