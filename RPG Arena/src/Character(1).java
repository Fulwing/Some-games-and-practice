
public class Character {

//giving basic things
	public String name;
	
	public int strength;
	public int health;
	public int defense;
	
	public static String[] nameList = {"Yato", "Fulwin", "Steve"};
	
	
	public Character() {
		this.name = nameList[Arena.generator.nextInt(nameList.length)];
	}
	
	public Character(int str, int def, int health) {
		this();
		this.strength = str;
		this.defense = def;
		this.health = health;
	}
	
//the damage that taken
	public int takeDamage( int damage ) {
		int damageTaken = damage - this.defense;
		this.health -= damageTaken;
		return damageTaken;
	}
	
//the attack
	public int attack(Character target) {
		int damage = this.strength * 2;
		target.takeDamage(damage);
		int damageDealt = target.takeDamage(damage);
		return damageDealt;
	}
	
//check is character alive
	public boolean isAlive() {
		return this.health > 0;
	}
}
