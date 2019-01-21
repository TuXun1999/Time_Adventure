package Time_Travel;
import Roles.*;


import Stats.Stats;

public class adventure {
	static public people[] gen_aliens(){
		//How many aliens to generate
		int alien_number = (int)(Math.random() * Stats.people_number_max);
		
		people[] aliens = new people[alien_number];
		for(int i = 0; i < alien_number; i++){
			//For each alien, decide the attack, stamina, and armor of the alien in a range
			int attack = (int)(Math.random()*Stats.ppl_attack_range)+Stats.ppl_attack_min;
			int stamina = (int)(Math.random()*Stats.ppl_stamina_range)+Stats.ppl_stamina_min;
			int armor = (int)(Math.random()*Stats.ppl_armor_range)+Stats.ppl_armor_min;
			
			
			//Determine whether to generate a swift or a magic
			int chance = (int)(Math.random()*Stats.alien_total);
			if(chance <= Stats.alien_dodge){
				aliens[i] = new swift(attack, stamina, armor, Stats.alien_dodge_chance);
			}
			else{
				aliens[i] = new magic(attack, stamina, armor);
			}
		}
		
		return aliens;
	}
	
	static public monster[] gen_monsters(){
		//How many monsters to generate
		int mon_number = (int)(Math.random() * Stats.monster_number_max);
		
		monster[] mons = new monster[mon_number];
		for(int i = 0; i < mon_number; i++){
			//For each single monster, create its attack and stamina
			int attack = (int)(Math.random()*Stats.mon_attack_range)+Stats.mon_attack_min;
			int stamina = (int)(Math.random()*Stats.mon_stamina_range)+Stats.mon_stamina_min;
			
			
			//Determine which type of monster to generate
			int chance = (int)(Math.random()*Stats.mon_total);
			if(chance <= Stats.mon_common){
				mons[i] = new monster(attack, stamina);
			}
			else if(chance > Stats.mon_common && chance <= Stats.mon_worm){
				mons[i] = new worm(attack, stamina, Stats.mon_wpn_dmg);
			}
			else if (chance > Stats.mon_worm && chance <= Stats.mon_spider){
				mons[i] = new spider(attack, stamina);
			}
			else {
				mons[i] = new bomb(attack, stamina, Stats.mon_bmb_dmg);
			}
		}
		
		return mons;
	}
	
	static public boolean fight(warrior w, people[] aliens, monster[] mons){
		boolean isdead = false;
		for (int i = 0 ; i < mons.length; i++){
			isdead = battle(w, mons[i]);
			if(isdead = true){
				return isdead;
			}
		}
		
		for (int i = 0; i <aliens.length; i++){
			isdead = battle(w, aliens[i]);
			if(isdead = true)
				return isdead;
		}
		
		
		
	}
	
	private void battle(warrior w, monster m){
		int round = 0;
		while(w.show_stamina() > 0 && m.show_stamina() > 0){
			if(round%2 == 0){
				int chance = (int)(Math.random()*10);
				m.suffer(w.do_attack(chance));
			}
			else
				w.suffer(m.do_attack());
			
		}
	}
		
}
