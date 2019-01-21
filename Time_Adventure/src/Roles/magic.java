package Roles;

public class magic extends people{
	public magic(int attack, int stamina, int armor){
		super(attack, stamina, armor);
		this.type = "magic";
	}
	public boolean ismagic(){
		//Special alien knows magic
		return true;
	}
}