package entregable.ataques;

import java.util.List;

import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class HydroCannon implements Water {

	@Override
	public int damage(Monster monster) {
		int damage = RandomGenerator.getInstance().calculateDamage(100, 500);
		List<Type> monsterType = monster.getTypes();

		if (monsterType.contains(Type.FIRE)) {
			damage = damage * 2;
		}

		if (monsterType.contains(Type.WATER) || monsterType.contains(Type.PLANT)) {
			damage = damage / 2;
		}

		return damage;
	}

}
