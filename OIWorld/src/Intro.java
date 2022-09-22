
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.InputMismatchException;
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basic things		
		String playerName;
		Scanner input = new Scanner(System.in);
		int playerChoice;
		int playerLevel;
		int playerHealth = 10;
		String playerUserName;

		//password system
		System.out.println("Registration Page");
		System.out.println("NOTE: your username is a unique one so it cannot be changed.");
		System.out.printf("Username: ");
		String user = input.next();
		System.out.printf("Password: ");
		String pass = input.next();
		System.out.printf("Confirm Password: ");
		String conf = input.next();
		int length = pass.length();
		//int passInt = Integer.parseInt(pass);
		//int confInt = Integer.parseInt(conf);
		File file = new File("C:\\Users\\iD Student\\Documents\\Accouts.txt");

		if (length < 6) {
			System.out.println("Your password is too short, it must be more than 6 character");

		}
		else {

			if(pass.equals(conf)) {


				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String current;
					boolean checkName = false;
					while ((current = br.readLine()) != null) {
						if(current.equalsIgnoreCase(user)){
							checkName = true;
						}

					}	
					if(checkName) {
						System.out.println("This username is already used, please use annother one");
					}
					else {
						Formatter x = null;
						try {
							FileWriter f = new FileWriter(file.getAbsoluteFile());
							BufferedWriter bw = new BufferedWriter(f);
							bw.write(user);
							bw.close();
							x = new Formatter(f);
							x.format("%s %s%n", user.toUpperCase(), pass);
							System.out.println("You registered succesfully");
							x.close();
						}
						catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				catch (Exception e) {

				}
			}
			else {
				System.out.println("Password and confirm password are not matching");
			}
		}


		//get a start		
		System.out.println("Enter your name to get start:");
		playerName = input.next();

		//ask for name
		try {
			System.out.println("Hi " + playerName + " welcome to OIWorld!");
			System.out.println("This world will be very scared, it might kill you");
			System.out.println("are you still going in?");
			System.out.println("1. go to OIWorld");
			System.out.println("2. stay back, and go home");

			playerChoice = input.nextInt();

			//start game or not	


			if (playerChoice == 1) {
				System.out.println("You entered the OIWorld");

			}
			else if(playerChoice == 2) {
				System.out.println("You went home");
				System.exit(0);
			}
			else {
				System.out.println(playerChoice + " is not a choice");
				System.exit(0);
			}}
		catch(InputMismatchException e){
			input.nextLine();
			System.out.println("That's not a Number");
			System.exit(0);
		}



		//password system

		System.out.println("Hi " + playerName + ", I think you should create your own accout");
		System.out.println("Choose your user Name first");
		playerUserName = input.next();
		System.out.println("is " + playerUserName + " your username?");
		System.out.println("1. Yes");
		System.out.println("2. no");	


		//went in to the cave	        
		try {
			System.out.println("There is a fork on the road");
			System.out.println("1. Go to the road on the left");
			System.out.println("2. Go to the road on the right");
			playerChoice = input.nextInt();

			if(playerChoice == 1) {
				System.out.println("you go to the left!");
			}
			else if(playerChoice == 2){
				System.out.println("you go to the right");
			}
			else {
				System.out.println(playerChoice + " is not a choice");
				System.exit(0);
			} }
		catch(InputMismatchException e){
			input.nextLine();
			System.out.println("That's not a Number");
			System.exit(0);
		}
	}

}


