package string1;

import java.util.Scanner;

public class StringPractice01 {
      public static void main(String[] args) {
  		// Scanner를 통해서 전체 문장을 입력받으세요.
  		// 다음으로 문장내에서 찾고 싶은 단어를 추가로 입력받으세요.
  		// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
  		// 출력해주는 코드를 작성해 보세요.
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("문장을 입력해주세요.");
    	  String sentence = scan.nextLine();
    	  
    	  System.out.println("문장내 찾고 싶은 단어를 입력해주세요.");
    	  String word = scan.nextLine();
    	  
    	  int count = 0;
    	  int fidx = -1;
    	  boolean bool = true;
    	  while(bool) {
    		  int get = sentence.indexOf(word, fidx + 1);
    		  if(get == -1) {
    			  bool = false;
    		  } else { 
    			  fidx = get;
    			  count++;
    			  System.out.println(get + "번 인덱스에서 " + count + "번째 "
    					  + word + "이(가) 검출되었습니다.");
    		  }
    				  
    	  } System.out.println(word + "의 총 출현 횟수는 " + count + "회입니다.");
    	  
	}
}
