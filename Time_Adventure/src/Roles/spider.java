package Roles;

public class spider extends monster{
	public spider(int attack, int stamina){
		super(attack, stamina);
	}
	public boolean ispoisoned(){
		//Normally a monster has no poison
		return true;
	}
}