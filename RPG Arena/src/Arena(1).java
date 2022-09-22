
import java.util.Random;
public class Arena {

	public static Random generator = new Random();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//create new Characters
		Character player1 = new Rogue();
		Character player2 = new Rogue();


//check who is the winner		
		while(player1.isAlive() && player2.isAlive()) {
			int damage;
			System.out.println(player1.name + " vs. " + player2.name);
			System.out.println(player1.health + " vs. " + player2.health);
			damage = player1.attack(player2);
			player1.attack(player2);
			System.out.println(player1.name + " hits " + player2.name + " for " + damage);
			player2.attack(player1);
		}
		
//declaring who is the winner	
		if(player1.isAlive()) {
			System.out.println(player1.name + " is the winner!");
		
		}
		
		else if(player2.isAlive()) {
			System.out.println(player2.name + " is the winner!");
		}
		
		else {
			System.out.println("It's a draw!");
		}
		
		
	

	}

}
