package world;

public class PoisonMatango extends Matango {
	public int pcount = 5;
	
	public PoisonMatango (char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
		if(this.pcount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
		  int dmg = h.hp / 5;
		  h.hp = h.hp - dmg;
		  System.out.println(dmg + "ポイントのダメージ！");
		  pcount -= 1;
		  System.out.println
		  (h.name + "のHP："+ h.hp + "    毒攻撃の残り回数" + pcount);
		}
	}
}	