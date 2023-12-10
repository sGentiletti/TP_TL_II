package game.components.comparators;

import game.components.Monster;
import java.util.Comparator;

public class ComparatorPorNombre implements Comparator<Monster> {

	public int compare(Monster monster1, Monster monster2) {

		return monster1.getMonsterName().compareTo(monster2.getMonsterName());

	}

}
