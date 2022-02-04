package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열이 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvWxyz");
        System.out.println(a);
        int checkNum = a.length() % 3;
        System.out.println(checkNum);
        
        int loopNum = a.length() - checkNum;
        
        for(int i = loopNum; i > -1;i--) {
        	
        }
	}
}
