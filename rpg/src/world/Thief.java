package world;

public class Thief {
	public String name;
	public int hp;
	public int mp;

	public Thief(String name, int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}

	public Thief(String name, int hp) {
		this(name, hp, 5);
	}
	
	public Thief(String name) {
		this(name, 40);
	}
}
