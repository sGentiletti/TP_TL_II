package entregable.ataques;

import java.util.List;

import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class ThunderShock implements Electric {

	@Override
	public int damage(Monster monster) {
		int damage = RandomGenerator.getInstance().calculateDamage(60, 150);
		List<Type> monsterType = monster.getTypes();

		if (monsterType.contains(Type.WATER) || monsterType.contains(Type.SWORD)) {
			damage = damage * 2;
		}

		if (monsterType.contains(Type.ELECTRIC) || monsterType.contains(Type.PLANT)) {
			damage = 50;
		}

		return damage;
	}
}
