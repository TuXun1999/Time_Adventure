package Roles;

public class roles {
	/*
	 * Each role has stamina as well as attack
	 */
	protected int attack;
	protected int stamina;
	protected String type;
	
	public roles(int attack, int stamina){
		this.attack = attack;
		this.stamina = stamina;
		this.type = "role";
	}
	
	/*
	 * Some basic operations for a role:
	 * it can fight
	 * it can suffer
	 * it can also upgrade
	 * and it can be killed
	 */
	public int do_attack(){
		return attack;
	}
	public int show_stamina(){
		return stamina;
	}
	public void suffer(int damage){
		stamina -= damage;
	}
	
	public void improve_attack(int add){
		attack += add;
	}
	
	public void improve_stamina(int add){
		stamina += add;
	}
	public boolean isdead(){
		if (this.stamina <= 0){
			return true;
		}
		else
			return false;
	}

}


