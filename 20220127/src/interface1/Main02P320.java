package interface1;

public class Main02P320 {

	public static void main(String[] args) {
		// 기차를 만들어서 잘 작동하는지 체크해보세요.
		Vehicle t1 = new Train("임병영");
		
		t1.accel();
		t1.accel();
		t1.accel();
		t1.accel();
		t1.accel();
		t1.showStatus();
		t1.breakspeed();
		t1.showStatus();
		t1.reFuel();
		t1.showStatus();
	}

}
