
public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int level;
    int health;

    level = 1;
    health = 3;

    level += 10;
    level--;
    
    health *= level;
    health++;


  
    System.out.println("You find a fountain and drink from it.");
    level++;
    System.out.println("Blech! The water is poisonous! You took 1 damage.");
    health--;
    System.out.println("health: " + health);
    System.out.println("level: " + level);
	}

}
