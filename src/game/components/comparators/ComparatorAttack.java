package game.components.comparators;

import game.components.Monster;
import java.util.Comparator;

public class ComparatorAttack implements Comparator<Monster> {

	public int compare(Monster monster1, Monster monster2) {

		return monster2.getInicialDamage() - monster1.getInicialDamage();
		
	
	}
}
