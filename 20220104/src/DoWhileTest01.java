import java.util.Scanner;

public class DoWhileTest01 {

	public static void main(String[] args) {
		// 이 페이지는 1월 4일 퀴즈에 대한 해설 페이지입니다.
		// 해당 페이지에서 아래 있는 Q1파일에 대한 해설입니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("배달금액을 입력해주세요.");
		int order = scan.nextInt();
		
		do {
			System.out.println("주문금액은 " + order + "원입니다.");
			System.out.println("배달을 완료했습니다.");
			System.out.println("다음 배달금액을 입력해주세요.");
			order = scan.nextInt();
		}while(order>=15000);
		System.out.println("금액이 모자라 배달 서비스가 종료되었습니다.");
	}

	}

