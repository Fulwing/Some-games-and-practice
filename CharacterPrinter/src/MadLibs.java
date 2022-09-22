
import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro();
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter an adjective: ");
		String adjective = userInput.nextLine();

		System.out.print("Enter a noun: ");
		String noun = userInput.nextLine();

		System.out.print("Enter an animal: ");
		String animal = userInput.nextLine();

		System.out.print("Enter a sound: ");
		String noise = userInput.nextLine();

		printMadLib(adjective, noun, animal, noise);  
		//adjective = "fast";
		printMadLib("fast", "car", "cat", "oink");

	}

	public static void intro() {
		 System.out.println("welcome to MadLibs");
		 
	 }	 
     public static void printMadLib(String adjective, String noun, String animal, String noise) {
    	 System.out.println(adjective + " Macdonald had a " + noun + " , E-I-E-I-O");
         System.out.println("and on that " + noun + " he had an " + animal + " , E-I-E-I-O");
         System.out.println("with a " + noise +" " + noise + " here");
         System.out.println("and a " + noise +" " + noise + " there,");
         System.out.println("here a " + noise + ", there a " + noise + ",");
         System.out.println("everywhere a " + noise +" " + noise + ",");
         System.out.println(adjective + " Macdonald had a " + noun + " , E-I-E-I-O.");
         }
	 }

