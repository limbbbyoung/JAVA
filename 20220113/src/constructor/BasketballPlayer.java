package constructor;

public class BasketballPlayer {
	// 멤버변수(특성) 
	// 키 height
	// 점프력 jumpHeight를 선언해주시고
	public int height;
	public int jumpHeight;
	
	
	
	// 생성자 생성
	// int h, int j를 받아야 호출되도록
	// 설정해 height, jumpHeight을
	// 받아온 값으로 저장받게 만들어주세요.
	public BasketballPlayer (int h,int j) {
		height = h; 
		jumpHeight = j;
		System.out.println("생성한 농구 선수의 " +
		                  "키 : " + height
		                  + " 점프력 : " + jumpHeight);
     }
        
	// 덩크슛하기 기능 추가
	// height + jumpHeight 가 300을 넘기는 경우는
	// 덩크에 성공했습니다.
	// 를 출력하고
	// 그렇지 않다면
	// 골대에 닿지 않았습니다 라고 
	// 출력하도록 기능을 추가해주세요.
	// dunkshoot() 입니다.
	public void dunkshoot() {
		if((height + jumpHeight) > 300 ) { 
			System.out.println("덩크에 성공하였습니다.");
		} else {
			System.out.println("골대에 닿지 않았습니다.");
		}        
	}
	
	
}
