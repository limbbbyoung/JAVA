
public class ForQ6While {

	public static void main(String[] args) {
		// 본문은 for문의 문제에서 for이 아닌 while을 활용한 문제입니다.
		
		int i = 1;
		while(i <= 4) {
		int j = 1;   
		while(j <= i ) {
	    System.out.print("*");
	    j += 1;} 
		System.out.println();
	    i += 1;}
	}
}
