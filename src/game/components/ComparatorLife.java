package game.components;
import java.util.Comparator;
public class ComparatorLife implements Comparable<Monster>{
	public int compare(Monster monster1, Monster monster2) {
		return monster1.getLife() - monster2.getLife();
	}
}
