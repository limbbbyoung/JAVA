package collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1~45범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort()대신
		// Collections.sort(ArrayList)를 사용합니다.
		
		// Integer를 저장받는 빈 ArrayList 만들기
		List<Integer> lotto = new ArrayList<>();
	
		// 로또번호를 받을 수 있는 변수 생성 후 0으로 초기화
        int getNum = 0;
        Random random = new Random();
        
        // While문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록
        while(lotto.size() != 6) {
        	//번호 뽑기]
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
        
        // 2등 당첨 번호 로직 만들기
        while(lotto.contains(getNum)) {
        	// 새로운 번호를 다시 getNum에 저장
            getNum = (int)(Math.random()*45) + 1;
        }	
        // +추가 내 생각 : 2등 당첨 번호 로직을 만들 때 부족했던 부분이 
        // while문의 실행조건에 대해서 .contains()로 만족시킬 수 있었던 것에 대해서 확실하게 이해하지 못하고 있었음
        // 그렇기 때문에 기본을 더 탄탄하게 만들어야한다는 것을 알 수 있었음
        
        // 추첨번호 보여주기
    	System.out.println("추첨된 번호 : " + lotto);
        System.out.println("2등 당첨 번호 : " + getNum);
	}
	
}
