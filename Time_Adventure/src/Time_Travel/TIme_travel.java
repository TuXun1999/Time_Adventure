package Time_Travel;
import java.util.Scanner;
import Roles.*;

import HInt.HInts;
import Stats.Stats;

public class TIme_travel {
	public static void main(String[] args){
		
		int year = 2019;
		HInts.prompt(year);
		int bomb_year = (int)(Math.random()*year);
		Scanner user_input = new Scanner(System.in);
		int choice = -1;
		boolean result = false;
		int turns = 0;
		while(choice != bomb_year){
			System.out.println("Please select a year you want to enter: ");
			choice = user_input.nextInt();
			
			// Take an adventure
			result = adventure(choice, bomb_year);
			if(turns == 10 || result == true)
				break;
			else{
				turns++;
			}
			
			//Enter the store
			enter_store();
		}
		if(result == true){
			System.out.println("Great, you saved the universe!");
			
		}
		else{
			System.out.println("No, warrior, noooooooo... ...");
		}
		
	}
	
	
	//The function to travel in one year
	public static boolean adventure(int year, int bomb){
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
		fight(warrior, aliens, monsters);
		
		//Part III: give some hints!
		
		
	}
	
	//The function to do shopping in store
	public static void enter_store(){
		
	}

}