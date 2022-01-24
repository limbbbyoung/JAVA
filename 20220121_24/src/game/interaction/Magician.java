package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
 
	public Magician() {
		this.hp = 20;
		this.mp = 40;
		this.atk = 3;
		this.lv = 1;
		this.exp = 0;	
	}
	
	// 오크와 교전할 수 있도록 huntOrc()를 만들어보겠습니다.
	public void huntOrc(Orc orc) { 
		// orc의 체력을 검사해서 0이하라면 공격 없이 바로 전투 종료
		// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨고
		// 메서드가 종료되게 해주세요.
		if(orc.getHp()<=0) {// 교전 전에 이미 죽은 상태
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
		
		// orc의 doBattle을 호출해 먼저 오크 체력을 깍고
		orc.doBattle(this.atk);
		
		if(orc.getHp()<=0) { // 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
			System.out.println("마법사의 경험치 : " + this.exp);
			}else { // 오크 공격력만큼 자신의 체력을 차감해줍니다.
		        this.hp -= orc.getAtk();
		} System.out.println("마법사의 남은 체력 : " + this.hp);
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
			System.out.println("마법사의 경험치 : " + this.exp);
			}else { 
		        this.hp -= dragon.getAtk();
		} System.out.println("마법사의 남은 체력 : " + this.hp);
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
			System.out.println("마법사의 경험치 : " + this.exp);
			}else { 
		        this.hp -= goblin.getAtk();
		} System.out.println("마법사의 남은 체력 : " + this.hp);
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
			System.out.println("마법사의 경험치 : " + this.exp);
			}else { 
		        this.hp -= rabbit.getAtk();
		} System.out.println("마법사의 남은 체력 : " + this.hp);
		}
	
	
	// 타 몬스터쪽에서 마법사 스탯을 조회할 수 있도록 Getter/Setter를 만들어주세요.
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
