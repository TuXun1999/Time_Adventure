package Roles;

public class people extends roles{
	/*
	 * For people, normally they have some armor to protect them
	 */
	protected int armor;
	
	public people(int attack, int stamina, int armor){
		super(attack, stamina);
		this.armor = armor;
	}
	
	//Armor will be of no use in face of magic damage
	public void suffer(int damage, boolean magic){
		if (magic){
			stamina -= damage;
		}
		else{
			int extra = armor - damage;
			if(extra >= 0){
				armor -= damage;
			}
			else{
				armor = 0;
				stamina += extra;
			}
		}
		
	}
	
	public boolean ismagic(){
		//Normal people don't know magic
		return false;
	}
}
/*
 * Three special kinds of people:
 * 1. warrior: may cause huge attack
 * 2. swift alien: some chance to dodge the attack
 * 3. magical alien: ignore armor
 */



