
public class Rogue extends Character {
	
	public int dexterity = 20;
	
	public Rogue() {
		super();
		this.strength = 8;
		this.defense = 4;
		this.health = 100;
	}
	
	public int attack(Character target) {
		boolean criticalHit = Arena.generator.nextInt(100) < dexterity;
		int damage = this.strength * 2;
		if(criticalHit) {
			damage *= 2;
			System.out.println("*** Critical Hit ***");
		}
		target.takeDamage(damage);
		int damageDealt = target.takeDamage(damage);
		return damageDealt;
	}

}
