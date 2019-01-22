package Roles;

//Special monster to explode when killed
public class bomb extends monster{
	private int hurt;
	public bomb(int attack, int stamina, int hurt){
		super(attack, stamina);
		this.hurt = hurt;
		this.type = "bomb";
	}
	public int explode(){
		if(isdead()){
			return hurt;
		}
		else
			return 0;
	}
}
