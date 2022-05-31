package chap09;

import world.Hero;
import world.Wizard;

public class Main345 {

	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		
		Hero h2 = new Hero("アサカ");
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		System.out.println(h1.name+"HP:"+h1.hp+ "  " +h2.name + "HP:" + h2.hp);
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.name+"HP:"+h1.hp+ "  " +h2.name + "HP:" + h2.hp);
	}

}
