package interaction;

public class Main01 {

	public static void main(String[] args) {
		// 판매자 하나 생성
		Seller s1 = new Seller(10);
		// 판매자 정보 조회
		s1.showSeller();
		
		// 구매자 하나 생성
		Buyer b1 = new Buyer(100000);
		// 구매자 정보 조회
		b1.showBuyer();
		
		// 구매자가 판매자를 지정해 망고 구매
		b1.buyMango(s1, 11);
        
		// 구매 후 판매자 정보 조회
		s1.showSeller();
		// 구매 후 구매자 정보 조회
		b1.showBuyer(); 
	}
    // seller 기준으로 재고가 부족한 경우만 로직을 짜서 경험해봤음
	// buyer 기준에서 금액이 부족한 경우도 로직을 짜줄 것
}
