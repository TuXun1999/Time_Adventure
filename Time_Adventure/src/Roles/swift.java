package Roles;

public class swift extends people{
	/*
	 * swift alien have the chance to dodge an attack
	 */
	private double chance;
	public swift(int attack,  int stamina, int armor, double chance){
		super(attack, stamina, armor);
		this.chance = chance;
		this.type = "swift";
	}
	
	public void suffer(int damage, double chance, boolean magic){
		if(chance <= this.chance){
			System.out.println("Attack Missed!!");
		}
		else{
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
	}
}