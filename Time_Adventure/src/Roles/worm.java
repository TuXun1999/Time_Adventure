package Roles;

public class worm extends monster{
	private int wpn_dmg;
	
	public worm(int attack, int stamina, int wpn_dmg){
		super(attack, stamina);
		this.wpn_dmg = wpn_dmg;
		this.type = "worm";
	}
	
	public int damage_weapon(){
		return wpn_dmg;
	}
}