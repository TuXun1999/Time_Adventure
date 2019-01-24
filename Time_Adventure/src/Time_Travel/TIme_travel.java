package Time_Travel;
import java.util.Scanner;
import Roles.*;

import HInt.HInts;
import Stats.Stats;

public class TIme_travel {
	public static void main(String[] args){
		
		int year = 2019;
		//HInts.prompt(year);
		int bomb_year = (int)(Math.random()*year);
		Scanner user_input = new Scanner(System.in);
		int choice = -1;
		int result = 1; //0: find the bomb; 1: failed to find the bomb, but survived; 2: dead...
		int turns = 0;
		System.out.println("Testing: " + bomb_year);
		warrior my_warrior = new warrior(
				Stats.war_attack, Stats.war_stamina, Stats.war_armor, Stats.war_anger);
		while(choice != bomb_year){
			System.out.println("Please select a year you want to enter: ");
			choice = user_input.nextInt();
			
			// Take an adventure
			result = adventure(choice, bomb_year, my_warrior);
			if(turns == 10 || result != 1)
				break;
			else{
				turns++;
			}
			
			System.out.println("----------------------------------------------");
			//Enter the store
			enter_store();
		}
		if(result == 0){
			System.out.println("Great, you saved the universe!");
			
		}
		else{
			System.out.println("No, warrior, noooooooo... ...");
		}
		user_input.close();
		
	}
	
	
	//The function to travel in one year
	public static int adventure(int year, int bomb, warrior my_warrior){
		/*
		 * The adventure in a year consists of three parts:
		 * 1. generate enemies
		 * 2. fighting system
		 * 3. give hints
		 */
		
		
		//Part I: generating system
		
		people[] aliens = adventure.gen_aliens();
		monster[] monsters = adventure.gen_monsters();
		
		
		//Part II: violent fighting!!
		boolean isdead = adventure.fight(my_warrior, aliens, monsters);
		if(isdead == true){
			return 2;
		}
		//Part III: give some hints!
		if(year == bomb){
			System.out.println("It is the bomb!!!!1");
			return 0;
		}
		else{
			String hint = (year < bomb)? "You enter a smaller year":"You enter a bigger year";
			System.out.println(hint);
			return 1;
		}
		
	}
	
	//The function to do shopping in store
	public static void enter_store(){
		
	}

}
