package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열이 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		StringBuilder a = new StringBuilder("abcdeabcdeabcdeabcdeabcde");

        for(int i = 0; i<a.length(); i++) {
    		int count = 0;
	     if(i == count) { 
        	a.deleteCharAt(count);
        	count = count + 2;
        } else { 
        	System.out.print(a.charAt(i)); 
        }
	} 
	}
}
