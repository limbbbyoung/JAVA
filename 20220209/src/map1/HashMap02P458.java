package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// map 자료형을 이용해 식당 메뉴판을 만들어보겠습니다.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		Map<String, Integer> dish = new HashMap<>();
		dish.put("냉면", 5500);
		dish.put("돈까스", 6500);
		dish.put("초밥", 10000);
		dish.put("김치말이국수", 5500);
		dish.put("묵사발", 5000);
		
		System.out.println("냉면 가격 : " + dish.get("냉면"));
		System.out.println("돈까스 가격 : " + dish.get("돈까스"));
		System.out.println("초밥 가격 : " + dish.get("초밥"));

	}

}
