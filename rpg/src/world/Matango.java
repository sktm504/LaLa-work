package world;

public class Matango {
	int hp = 50;
	char suffix;
	
	public Matango() {this.suffix = 'A';}
	public Matango (char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
		System.out.println(h.name +"のHP："+ h.hp);
	}
}

