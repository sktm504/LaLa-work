package ex9;

import world.Thief;

public class Ex9_1 {
	public static int heal(int hp) {
		hp = hp +10;
		return hp;
	}
	public static void heal(Thief thief) {
		thief.hp = thief.hp +10;
	}
	

	public static void main(String[] args) {
		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		System.out.println(baseHp + " : " + t.hp);
		heal(baseHp);
		heal(t);
		System.out.println(heal(baseHp) + " : " + t.hp);
				
	}

}
