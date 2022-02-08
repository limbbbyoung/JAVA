package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 몇 장을 사야 당첨되는지 시물레이션 해보겠습니다.

		// Integer를 저장받는 빈 ArrayList 만들기
		List<Integer> lotto = new ArrayList<>();
		List<Integer> lotto2 = new ArrayList<>();
	
		// 로또번호를 받을 수 있는 변수 생성 후 0으로 초기화
        int getNum = 0;
        Random random = new Random();
        
        // While문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록
        while(lotto.size() != 6) {
        	//번호 뽑기
            int ranNum = random.nextInt(1, 45);
        	getNum = ranNum;
        	
        	//번호가 만약 기존에 뽑은 번호 목록에 포함되어있지 않다면
        	if(lotto.contains(getNum) == false) { 
        		// 추가하기
        		lotto.add(getNum);
        	} 
        }
        // 다 돌면 정렬하기
        Collections.sort(lotto);

    	int count = 0;
    	while(true) {
            // 로또 랜덤기
        	int getNum2 = 0;
        while(lotto2.size() != 6) {
        	//번호 뽑기
            int ranNum = random.nextInt(1, 45);
        	getNum2 = ranNum;
        	
        	//번호가 만약 기존에 뽑은 번호 목록에 포함되어있지 않다면
        	if(lotto2.contains(getNum2) == false) { 
        		// 추가하기
        		lotto2.add(getNum2);
        	}  
        }
        Collections.sort(lotto2);
    		if(lotto.equals(lotto2) == false) {
    			lotto2.clear();
    			count++;
    	        while(lotto2.size() != 6) {
    	        	//번호 뽑기
    	            int ranNum = random.nextInt(1, 45);
    	        	getNum2 = ranNum;
    	        	
    	        	//번호가 만약 기존에 뽑은 번호 목록에 포함되어있지 않다면
    	        	if(lotto2.contains(getNum2) == false) { 
    	        		// 추가하기
    	        		lotto2.add(getNum2);
    	        	}  
    	        }
    	        Collections.sort(lotto2);
    			  System.out.println("" + lotto + lotto2);
    	} else { 
    		System.out.println("" + lotto + lotto2);
    		break;
    	}
    		
    	} System.out.println("구매한 로또 복권의 개수 : " + count);
 
	}
	
	

}