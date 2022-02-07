  package interface1;

// Vehicle을 구현하기 위해 implements를 활용합니다.
public class Train implements Vehicle {
	
	// 속도, 연료량, 기관사명을 선언합니다.
	private int speed;
	private int gas;
	private String driver;
	
	public Train(String driver) { 
		this.driver = driver;
		this.speed = ZERO_SPEED;
		this.gas = T_MAX_GAS;
	}
	
	@Override
	public void accel() {
		// 가속처리
		if( this.speed + T_INCREASE_SPEED > T_MAX_SPEED ) {
			speed = T_MAX_SPEED;
		} else { 
			speed += T_INCREASE_SPEED;
		} 
		// 가속 후 연료 차감
		gas -= T_DECREASE_GAS;
	}


	@Override
	public void breakspeed() {
		// 감속처리
		if(this.speed - T_DECREASE_SPEED < ZERO_SPEED) { 
			speed = ZERO_SPEED;
		} else {
			speed -= T_DECREASE_SPEED;
		}	
	}


	@Override
	public void reFuel() {
		// 연료 충전
		if(this.gas + T_REFUEL_GAS > T_MAX_GAS) {
			gas = T_MAX_GAS;
		} else {
			this.gas += T_REFUEL_GAS;
		}
	}


	@Override
	public void showStatus() {
		// 기차의 속도, 연료량, 기관사가 누군지 나오도록 해줍니다.
		System.out.println("현재 속도 : " + this.speed + ", 현재 연료량 : " + this.gas
				+ ", 현재 기관사 : " + this.driver );
		System.out.println("-----------------------------------");
	}
}


// 강사님과 비교했을 때 차이점 : 
// 1. 안만들어도 되는 변수를 만들어줌(ZERO_SPEED)
// 2. Train클래스 각 메서드에 가독성을 위해 주석을 사용해주지 않은 것
