
import java.util.InputMismatchException;
import java.util.Scanner;

public class ChooseGame {

	 public static void main(String[] args) {
         
	        // init scanner and money value
	        Scanner input = new Scanner(System.in);
	        int playerChoice = 0;
	         
	        // TODO Handle the error that occurs when the user doesn't enter a number.
	        try{
	        System.out.println("1. enter the cave");
	        System.out.println("2. leave the cave");
	        playerChoice = input.nextInt();
	        
	        if (playerChoice == 1) {
	        	System.out.println("you entered the cave");
	        }
	        else if(playerChoice == 2) {
	        	System.out.println("you leaved the cave");
	        	
	        }
	        else {
	        	System.out.println(playerChoice + " is not a choice");
	        }
	        }
	        catch(InputMismatchException e){
	        input.nextLine();
	        System.out.println("That's not a Number"); 
	        }
	       
	        
//went in to the cave	        
	        try {
	        	System.out.println("There is a fork on the road");
	 	        System.out.println("1. Go to the road on the left");
	 	        System.out.println("2. Go to the road on the right");
	 	        playerChoice = input.nextInt();
	 	        
	 	    if(playerChoice == 1) {
	 	    	System.out.println("you go to the left!");
	 	    }
	 	    else if{
	 	    	System.out.println("");
	 	    }
	    }
	 
	}