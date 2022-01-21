

public class Break02P120 {

	public static void main(String[] args) {
		// 중첩반복문 사용시 안쪽 반복문에 사용하는 break는 
		// 전체 다 종료를 시키지 않고
		// 내부 반복문만 종료시키고, 외부 반복문은 계속 실행됩니다.
		// 구구단 출력, 단 n * 4 까지만 출력하는 예시
		
		for(int i = 2; i <= 9; i++) {
			 System.out.println(i + "단 출력.");
			 for( int j =1; j <= 9; j++) {
				 if(j > 4) {
					 System.out.println("5부터 직접 알아보세요.");
					 break;
				 }
				 System.out.println(i + "*" + j + "=" + i * j);
			 }
			 System.out.println("--------------------");
		}
        // 1월 7일 수업의 마지막 클래스인데 오늘 배운 개념 중 가장 중요한 것은 
		// stack과 heat에 대해서 가르쳐주신 부분이다.
		// 이 부분이 중요한 이유는 Java뿐만 아니라 다른 프로그래밍 언어에서도 이 개념이 활용되기 때문이다.
		// 그림판으로 그림을 그려가며 공부하는 것이 좋다고 말씀하셨기 때문에 코딩 노트를 하나 마련해서 
		// 거기에 이해하기 쉽게 그림을 그려서 내용을 충분히 익혀두자.
		
		
	}

}
