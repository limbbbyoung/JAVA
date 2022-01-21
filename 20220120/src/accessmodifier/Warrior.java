package accessmodifier;

 // Commoner를 상속한 Warrior 클래스를 만들어주세요.
 // 전사는 hunt를 할 경우 체력이 1 까지고 
 // 경험치는 10을 먹습니다.
 // doubleAttack을 특수 스킬로 가지고 
 // 사용시 체력은 4씩 까지고 경험치는 25씩 증가합니다.
 // getInfo()는 Magician과 동일합니다.
 // 위와 같이 생성한 후 Main02를 이용해 
 // 전사를 생성해 각 스킬을 1번 이상 사용해보세요.
public class Warrior extends Commoner {

	public Warrior(String name) {
		super(name);
	}

	public void hunt() { 
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp() - 1);
		setExp(getExp() + 10);	
}
	public void getInfo() {
		System.out.println("이름 : " + getName() + ", 체력 : " + getHp()
		 + ", 마나 : " + getMp() + ", 레벨 : " + getLv() + ", 경험치 : " + 
				getExp() );
}
	public void doubleAttack() { 
		System.out.println(getName() + "이(가) 더블어택을 사용합니다.");
		setHp(getHp() - 4);
		setExp(getExp() + 25); 
}
	
	
}