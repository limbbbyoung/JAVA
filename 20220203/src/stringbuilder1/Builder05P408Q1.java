package stringbuilder1;

public class Builder05P408Q1 {

		public static void main(String[] args) {
			// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
			// 힌트 : 반복문을 쓰세요
			
			// 오류에 대한 코드
			// 원하고자 하는 값을 출력하기 위해서 3번째마다 삭제해주는 로직을 짰지만 
			// 매번 인덱스의 번호를 다시 매겨 삭제하고자하는 알파벳을 삭제해주지 못함.
			StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
			for(int i = 0; i < a.length(); i++) {
				System.out.println("i % 3의 결과 : " + i % 3);
				System.out.println("현재 i의 값 : " + i);
				System.out.println(a);
				System.out.println("-----------------------");
				if(i % 3 == 0) {
					a.deleteCharAt(i);
				}
			}
			System.out.println(a);
		} 
	}
