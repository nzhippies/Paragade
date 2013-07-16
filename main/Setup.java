package main;

import java.util.Scanner;
import data.Data;

public class Setup {
	
	Scanner input = new Scanner(System.in);
	public String name = Data.name;
	
	/*
	 * Initializes the first step in the setup process
	 */
	public void initialize() {
		System.out.println("This is your first time playing. Loading character setup.");
		promptName();
	}
	
	/*
	 * Prompts the user for a character name
	 */
	public void promptName() {
		System.out.println("What would you like your character's name to be?");
		name = input.next();
		System.out.println("Your name is " + name + ", is this correct? (Yes or No)");
		if (input.next().equalsIgnoreCase("yes")) {
			chooseClass();
		} else {
			promptName();
		}
	}
	
	/*
	 * Prompts the user for class
	 */
	public void chooseClass() {
		System.out.println("Hello " + name + ", and welcome to the amazing text-based game, Paragade.");
		System.out.println("There are three types of classes in this game: Fire, Water, and Earth.");
		System.out.println("Which class would you like to be? (Fire, Water, or Earth)?");
		if (input.next().equalsIgnoreCase("Fire")) {
			Data.classType = 1;
		} else if (input.next().equalsIgnoreCase("Water")) {
			Data.classType = 2;
		} else if (input.next().equalsIgnoreCase("Earth")) {
			Data.classType = 3;
		}
		System.out.println("You picked the " + Data.classType + " class, right?");
		} else if (intput.next().equalsIgnoreCase("yes")) {
		System.out.println("You are now a master of" + Data.classType + "!");
		}
	}
}
