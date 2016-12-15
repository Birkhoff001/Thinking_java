package andycpp;

class Characteristic {
	private String s;
	Characteristic (String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
	protected void dispose() {
		System.out.println("finalizing Characteristic " + s);
	}
}

class Description {
	private String s;
	Description(String s) {
		this.s = s;
		System.out.println("Creating Description " + s);
	}
	protected void dispose() {
		System.out.println("finalizing Description " + s);
	}
}

class LivingCreature {
	private Characteristic c = new Characteristic("is alive-----");
	private Description d = new Description("basic Living Creature----");
	LivingCreature() {
		System.out.println("LivingCreature()");
	}
	protected void dispose() {
		System.out.println("LivingCreature dispose");
		c.dispose();
		d.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic c = new Characteristic("has heart------");
	private Description d = new Description("Animal not vegetable----");
	Animal() {
		System.out.println("Animal()");
	}
	protected void dispose() {
		System.out.println("Animal dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic c = new Characteristic("can live in water-----");
	private Description d = new Description("Both water and land----");
	Amphibian() {
		System.out.println("Amphibian()");
	}
	protected void dispose() {
		System.out.println("Amphibian dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}
}

public class Frog extends Amphibian {
	private Characteristic c = new Characteristic("Croaks----");
	private Description d = new Description("Eats bugs-------");
	public Frog() {
		System.out.println("Frog()");
	}
	protected void dispose() {
		System.out.println("Frog dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		Frog f = new Frog();
		System.out.println("It's done----------");
		f.dispose();
	}
}
