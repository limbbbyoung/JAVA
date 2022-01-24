package game.interaction;

public class Dragon {
	// 드래곤은 hp, atk 을 가집니다.
	private int hp;
	private int atk;
	public Dragon() { 
		this.hp = 20;
		this.atk = 6;
	}
	
	// doBattle() 메서드를 만들겠습니다.
	// 유저의 공격력(uAtk)을 받아 드래곤의 체력을 차감합니다.
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("드래곤의 남은 체력 : " + this.hp);
		}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	

}
