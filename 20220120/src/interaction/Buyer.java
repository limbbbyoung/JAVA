package interaction;

public class Buyer {
	// 구매자는 money(소지금), mango(소지망고개수)를 맴버변수로 가집니다.
	private int money;
	private int mango;
	private int MANGO_PRICE;
    // 생성자에는 돈을 받아 소지금을 초기화해주고 망고는 0으로 초기화합니다.
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.MANGO_PRICE = 6500;
	}
	// showBuyer()를 이용해 소지망고, 소지금을 볼 수 있습니다.
	public void showBuyer() {
		System.out.println("--------구매자 정보--------");
		System.out.println("현재 소지금 : " + this.money);
		System.out.println("현재 소지 망고 갯수 : " + this.mango);
	}
	
	// 구매자 입장에서 망고를 구매하는 buyMango를 만듭니다.
	// 구매자가 buyMango를 호출할 때 동시에 판매자의 sellMango도 동시에 호출되어야합니다.
	//                      누구에게        몇개를           구매할지 적습니다.
	public void buyMango(Seller seller, int mango) {
		// 판매자의 망고가 내가 구매하려는 망고보다 적은 경우
		// "망고 재고가 부족합니다." 라고 알리고 메서드를 중지시켜야합니다.
		// Seller쪽의 망고 재고를 Buyer쪽에서 미리 아는 방법은
		// getMango()를 Seller쪽에 만들어주는 수 밖에 없으므로 
		// getMango()를 Seller쪽에 생성해줘서 Buyer쪽에서 
		// 망고개수를 조회할 수 있도록 해주시고, 그 결과를 토대로 
		// 망고재고가 부족하다면 return;으로 buyMango가 실행되지 않게 해주세요.
		
		if(seller.getMango() < mango) { 
			System.out.println("망고 재고가 부족합니다. 망고재고 : " + seller.getMango()
			 + ", 소지금 : " + this.money);
			return;
			}
		// 내 금액이 차감되고 망고가 늘어나는 로직을 작성해주세요.
			this.money -= (this.MANGO_PRICE * mango);
		    this.mango += mango;
		// 판매자의 sellMango 호출
		seller.sellMango(mango);
		//  Buyer측에서 Seller의 망고개수를 조회하도록 게터 생성
	}
}









