package entregable.ataques;

import java.util.List;

import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class RazorLeaf implements Plant {

	@Override
	public int damage(Monster monster) {
		int damage = RandomGenerator.getInstance().calculateDamage(50, 200);
		List<Type> monsterType = monster.getTypes();

		if (monsterType.contains(Type.WATER)) {
			damage = damage * 2;
		}

		if (monsterType.contains(Type.FLYING) || monsterType.contains(Type.FIRE) || monsterType.contains(Type.DRAGON)) {
			damage = damage / 2;
		}

		return damage;
	}

}
