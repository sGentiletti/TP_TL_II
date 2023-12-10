package game.components.comparators;

import game.components.Monster;
import java.util.Comparator;

public class ComparatorAttack implements Comparator<Monster> {

	public int compare(Monster monster1, Monster monster2) {

		return monster2.getActiveSkill().damage(monster2) - monster1.getActiveSkill().damage(monster1);
		
	
	}
}
