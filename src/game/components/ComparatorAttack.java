package game.components;

import java.util.Comparator;

public class ComparatorAttack implements Comparator<Monster> {
	
	public int compare(Monster monster1, Monster monster2) {
		
		return monster1.activeSkill.damage(monster2) - monster2.activeSkill.damage(monster1);
	
	}
}
