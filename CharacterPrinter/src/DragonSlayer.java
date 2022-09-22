
public class DragonSlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerStrength = 40;
		int dragonsHP = 500;
		boolean hasSword = true;
		
		
		if(playerStrength > dragonsHP) {
			System.out.println("You defeated the dragon!");
		} 
		else if (hasSword) {
			System.out.println("You're not strong enough to defeat the dragon. However, you remember your magic sword and use it to slay the beast.");	
		}
		
		else {
			System.out.println("the dragon defeated you!");
		}
	}

}
