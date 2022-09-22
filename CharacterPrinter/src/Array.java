
import java.util.Random;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] monsters = { "Ghost" , "Goblin", "Ghoul" };
		Random generator = new Random();
		int monsterIndex = generator.nextInt(monsters.length);
		String monster;
		monster = monsters[monsterIndex];
		
		System.out.println("A " + monster + " appears");
		
	
		
   
	}

}
