import java.util.Random;
public class EndlessDungeon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//basic set up
		Random generator = new Random();
		int playerHealth, enemyHealth;
		int playerDamage, enemyDamage;
		int enemiesDefeated = 0;
		
		// giving numbers
		playerHealth = 100;
		enemyHealth = generator.nextInt(10) +1;
		
				
	    while(playerHealth > 0) {
	    	if(enemyHealth<= 0) {
	    		System.out.println("you have defeated the enemy! You kick down the door to the next room and prepare yourself to fight the next enemy.");
	    		enemyHealth = generator.nextInt(10) +1;
	    		enemiesDefeated++;
	    		
	    	}
	    	
	    	System.out.println("You have " + playerHealth + "HP left.");
	    	System.out.println("Enemy has " + enemyHealth);
	    
	    	playerDamage = generator.nextInt(5) +1;
			enemyDamage = generator.nextInt(3) +1;
			
			
			playerHealth -= enemyDamage;
			enemyHealth -= playerDamage;
			
			System.out.println("You attack enemy for " + playerDamage);
			System.out.println("The enemy attack you for " + enemyDamage);
	    }

	    
	    System.out.println("Game over, you defeated " + enemiesDefeated + " enemies");
	}

}
