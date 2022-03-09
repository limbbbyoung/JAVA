import java.util.Scanner;

public class BackQuiz {
	
     public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
    	 System.out.println("첫번째 정수를 입력해주세요.");
         int A = in.nextInt();
         System.out.println("두번째 정수를 입력해주세요.");
         int B = in.nextInt();
         String strB = String.valueOf(B);
         for(int i = strB.length(); i > 0; i--) { 
               int C = strB.charAt(i) * A;
               System.out.println(C);			
		}
    }
}
