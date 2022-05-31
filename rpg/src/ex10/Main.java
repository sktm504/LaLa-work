package ex10;

import world.Hero;
import world.PoisonMatango;
import world.SuperHero;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("ミナト");
		PoisonMatango pm = new PoisonMatango('Z');
		//pm.attack(h);
		
		SuperHero sh = new SuperHero("ミカサ");
		pm.attack(sh);
		sh.fly();
		
		h.attack(pm);
		sh.attack(pm);
	}

}
