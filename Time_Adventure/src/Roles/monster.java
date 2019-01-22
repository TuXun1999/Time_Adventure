package Roles;
import Stats.Stats;
public class monster extends roles{
	public monster(int attack, int stamina){
		super(attack, stamina);
		this.type = "monster";
	}
	public boolean ispoisoned(){
		//Normally a monster has no poison
		return false;
	}
	
	public int damage_weapon(){
		return Stats.mon_wpn_dmg;
	}
	
	public int explode(){
		return 0;
	}

}

/*
 * There are three special types of monsters:
 * 1: dog: normal ones
 * 2: worm: do damage to the weapon
 * 3. spider: poisoning
 * 4. bomb: explosion on death
 */

//Special monster to damage weapon


//Special monster to cause poison


//Special monster to explode when killed


