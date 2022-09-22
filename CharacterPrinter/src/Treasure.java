import java.util.Random;
public class Treasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		
		boolean gold;
		
		gold = generator.nextBoolean();
		
		System.out.println("you open the chest find " + gold + " gole pieces!");

	}

}
