package game.components;

public class ComparatorAttack implements Comparable<Monster>{
	public int compare(Monster monster1, Monster monster2) {
		return monster1.activeSkill.damage(monster2) - monster2.activeSkill.damage(monster1);
	}
}
