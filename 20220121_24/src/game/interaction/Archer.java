package game.interaction;

public class Archer {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
 
	public Archer() {
		this.hp = 30;
		this.mp = 30;
		this.atk = 3;
		this.lv = 1;
		this.exp = 0;	
	}
	

	public void huntOrc(Orc orc) { 
		if(orc.getHp()<=0) {// 교전 전에 이미 죽은 상태
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
		
		orc.doBattle(this.atk);
		
		if(orc.getHp()<=0) { // 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
			System.out.println("궁수의 경험치 : " + this.exp);
			}else { // 오크 공격력만큼 자신의 체력을 차감해줍니다.
		        this.hp -= orc.getAtk();
		} System.out.println("궁수의 남은 체력 : " + this.hp);
		}
	
	

	public void huntDragon(Dragon dragon) { // 드래곤 사냥

		if(dragon.getHp()<=0) {// 교전 전에 이미 죽은 상태
			System.out.println("드래곤이 이미 죽은 상태입니다.");
			return;
		}
		
		dragon.doBattle(this.atk);
		
		if(dragon.getHp()<=0) { 
			this.exp += 50;
			System.out.println("드래곤을 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
			System.out.println("궁수의 경험치 : " + this.exp);
			}else { 
		        this.hp -= dragon.getAtk();
		} System.out.println("궁수의 남은 체력 : " + this.hp);
		}
	
	

	public void huntGoblin(Goblin goblin) { // 고블린 사냥
	
		if(goblin.getHp()<=0) {// 교전 전에 이미 죽은 상태
			System.out.println("고블린이 이미 죽은 상태입니다.");
			return;
		}
		
		goblin.doBattle(this.atk);

		if(goblin.getHp()<=0) { 
			this.exp += 8;
			System.out.println("고블린을 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
			System.out.println("궁수의 경험치 : " + this.exp);
			}else { 
		        this.hp -= goblin.getAtk();
		} System.out.println("궁수의 남은 체력 : " + this.hp);
		}

	
	public void huntRabbit(Rabbit rabbit) { 
		
		if(rabbit.getHp()<=0) {// 교전 전에 이미 죽은 상태
			System.out.println("토끼가 이미 죽은 상태입니다.");
			return;
		}
		
		rabbit.doBattle(this.atk);
		
		if(rabbit.getHp()<=0) { 
			this.exp += 5;
			System.out.println("토끼를 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
			System.out.println("궁수의 경험치 : " + this.exp);
			}else { 
		        this.hp -= rabbit.getAtk();
		} System.out.println("궁수의 남은 체력 : " + this.hp);
		}
	
	
	// 타 몬스터쪽에서 궁수 스탯을 조회할 수 있도록 Getter/Setter를 만들어주세요.
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
}
