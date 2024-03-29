package accessmodifier;

// Commoner를 상속합니다.
public class Magician extends Commoner {
	
	    // 생성자를 만들어주세요.
		// Magician측에서 설정하는 변수는 추가로 없지만
		// 생성자는 상속되지 않으므로 부모쪽 생성자를 
		// 처리할 수 있도록 만들어주세요.
		
	public Magician(String name) {
		super(name);
	}

	// 사냥 메서드를 만들겠습니다.
	public void hunt() { 
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; // private 요소는 자식쪽에서도 컨드롤 불가능.
		// public인 setter의 일종인 setHp()를 대신 활용합니다.
		// setHp(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청입니다.
		// 현재 원하는 것은 현재 hp값에서 2가 깍인 값이 새로운 hp로 저장되는 것입니다.
		// setter와 getter(setHp(), getHp()를 적절히 활용해
		// 전투할 때마다 체력이 2씩 깍이도록 로직을 작성해주세요.
		setHp(getHp() - 2);
		// 경험치도 마찬가지로
		// exp += 10; 을 직접 실행할 수 없으므로
		// setExp()를 활용합니다.
		// 현재 원하는 것은, 현 exp값에서 사냥시마다 10씩 경험치가 증가하는 것입니다.
		setExp(getExp() + 10);	
	}
	public void getInfo() {
		// 심지어 private는 수정만 안되는게 아니라 조회도 불가능합니다.
		// 따라서 getter를 이용해 상태를 조회할 수 있게 해주세요.
		System.out.println("이름 : " + getName() + ", 체력 : " + getHp()
		 + ", 마나 : " + getMp() + ", 레벨 : " + getLv() + ", 경험치 : " + 
				getExp() );
	}
	
	// fireball 기능을 추가해주세요.
	// 마나가 3줄고, 경험치는 20증가합니다.
	public void fireball() { 
		System.out.println(getName() + "이(가) 파이어볼을 사용합니다.");
		setMp(getMp() - 3); // 마나 3 사용 
		setExp(getExp() + 20); // 경험치 20 증가
	}
}
