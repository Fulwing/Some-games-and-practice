import java.util.Scanner;
import java.util.Random;
public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randomGenerator = new Random();
		//to make some random variable
		
		int playerLevel = 1;
		String playerName = "Yato";
		double playerHealth = 10.0;
		// to set up some basic information
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your character's name?");
		playerName = userInput.nextLine();
		// to let player set their name
		
		
		System.out.println("Welcome " + playerName + "!");
		System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");
        // to make a welcome
		
//Decision 1
		System.out.println("1. Enter the Cave of Wonders");
		System.out.println("2. Run away to the safety of your warm bed");
		// giving to choices
		
		
		int playerChoice;
		playerChoice = userInput.nextInt();
		
		if(playerChoice == 1) {
			// the player enters the cave
			
			System.out.println("You made it to the entrance of the cave.");
			playerLevel++;
			System.out.println("Your barely has rewarded you! Congratulations, you are now level " + playerLevel);
		
		    // the player met trap
			System.out.println("You travel forward into the dark cave. you feel something press against your leg...");
			System.out.println("It's a trap! Suddently, you're being bombarded by rocks from above.");
		
			int rockDamage;
			rockDamage = randomGenerator.nextInt(5);
			playerHealth -= rockDamage;
			
			System.out.println("The rock slide and hit you for");
			System.out.println("you have " + playerHealth + " health remaining");

			// the player find a chest
			System.out.println("You pick your self up from the cave floor and brush a cloud of dust from your clothes.");
			System.out.println("The cave narrows as you press on until you manage to squeeze through an opening in to a large natural cavern.");
			System.out.println("Before you is a treasure chest.");
		}

		else if (playerChoice == 2) {
			// the player run away
			System.out.println(playerName + " runs home and goes to sleep");
			System.exit(0);
		}

		else {
			//if their choice was bad
			System.out.println("This is not a choice!");
			System.exit(0);
		}
		
		
		

		//Decision 2
		boolean hasSword = false;
		System.out.println("1. Open the chest");
		System.out.println("2. Ignore the chest. Obvious trap is obvious.");

		playerChoice = userInput.nextInt();

		// the player choices of opening the box
		if(playerChoice == 1) {
			System.out.println("Uneasy after you brush with death, you slowly open the chest to reveal a magic sword!");
			System.out.println("You leave the carvrn with the chest and countinue your journey");
			hasSword = true;	
		}

		
		
		
		// the player met the dragon

		System.out.println("Up ahead the air grows warm and wet. You hear snoring");
		System.out.println("Peeking around the corner you see a monstrous shape! A dragon sleeps in the room ahead.");
		System.out.println("You swallow hard and decide it is time to leave");
		System.out.println("As you turn your foot find a rock. It thuds loudly against the cave wall. The dragon wakes up!");

		System.out.println("1. Fight the dragon.");
		System.out.println("2. run for your life.");

		playerChoice = userInput.nextInt();

		if(playerChoice == 1) {
			//the player fights the dragon
			System.out.println("You fell the courage surge through your body as you charge the dragon.");

			//if player has the magic sword
			if(hasSword) {
				System.out.println("You raise the magic sword and plunge it in to dragon slaying the beast.");

			} 
			else {
				System.out.println("You pummel the dragon with your fists to no avail. The dragon snarls and swallows you whole. Game Over!");
				System.exit(0); 
			}
		} 
		else {
			//the player flees
			System.out.println("As you run away to hide in the safety of your warm bed, the dragon yawns and return to its slumber.");

		}

		
		
		
		
		
		
	} 
}


