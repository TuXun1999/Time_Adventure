package Roles;

public class warrior extends people{
	//For warrior, great damage can be caused
	
	private int anger;
	
	
	public warrior(int attack, int stamina, int armor, int anger){
		super(attack, stamina, armor);
		this.anger = anger;
	}
	
	public int do_attack(int chance){
		if (chance <= this.anger){
			return (this.attack * 2);
		}
		else{
			return this.attack;
		}
		
	}
	
	public void encourage(int add){
		anger += add;
	}
}
