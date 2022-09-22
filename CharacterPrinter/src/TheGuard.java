
import java.util.Scanner;
public class TheGuard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose a class:\n1 - warrior\n2 - Theif\n3 - Mage");
		int playerClass = userInput.nextInt();
		System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - steal his wallet\n3 - Throw a fire ball\n4 - talk the guard in to leaving\n5 - Intimidate the guard\n6 - bond with the guard over your shared disdain for magic");
		int playerChoice = userInput.nextInt();
		
		if(playerClass == 1 && playerChoice == 1) {
			System.out.println("You use your awesome warrior skills and punch the guard.");
			
		  }
		else if(playerClass == 2 && playerChoice == 2) {
			System.out.println("You're so sneaky he doesn't notice his wallet is gone for days.");
		  }
		
		else if(playerClass == 3 && playerChoice == 3) {
			System.out.println("You throw a very bright and shiny fireball. The guard is slightly on fire.");
		  }
		else if((playerClass == 2 || playerClass == 3) && playerChoice == 4) {
			System.out.println("You're so charming! He is convinced to wander off for a bit.");
		}
		else if(!(playerClass ==3) && playerChoice == 6) {
			System.out.println("you break the guard into dust");
		}
	    else {
	    	System.out.println("You have been killed by the guard!");
	    	System.exit(0);
	    }
		       userInput.close();
	   }

	}


