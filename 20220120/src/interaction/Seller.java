package interaction;

public class Seller {
    // 변수로 int money(매출), int mango(재고)를 가집니다.
	private int money; // 매출액
	private int mango; // 재고(개수)
	private int MANGO_PRICE;
	
	// 생성자에서 money는 초기값이 0이고, mango는 입력받도록 해주세요.
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
		// 가독성을 높이기 위해 숫자대신 넣는 변수는 
		// 카멜케이스로 작성하지 않습니다.
		this.MANGO_PRICE = 6500;
	}

	// showSeller()를 이용해 현재 소지금, 망고 개수를 조회하도록 메서드를 작성해주세요.
    public void showSeller() { 
    	System.out.println("--------상인정보--------");
    	System.out.println("현재 소지금 : " + this.money);
    	System.out.println("현재 재고(망고개수) : " + this.mango); 	
    }
    
    // sellMango(int mango)를 이용해서 망고개수를 입력받으면
    // 자신의 망고는 입력받은 망고개수만큼 차감하고, this.money는
    // 망고갯수*망고가격만큼 증가하게 해주세요.
    public void sellMango(int mango) {
    	// 망고가 모자랄시 "망고가 모자랍니다."라고 하고 메서드를
    	// return; 을 마지막에 적어 강제종료시켜주세요.
        if(this.mango < mango) {
        	System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
        	return;
        }    	this.mango -= mango;
    	        this.money += mango * MANGO_PRICE; // 망고 가격 6500원  
        }

	//  Buyer측에서 Seller의 망고개수를 조회하도록 게터 생성
	public int getMango() { 
		return this.mango;
	
	} 
	}
    
	
