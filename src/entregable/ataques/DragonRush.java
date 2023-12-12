package entregable.ataques;

import java.util.List;

import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class DragonRush implements Dragon {

	@Override
	public int damage(Monster monster) {
		int damage = RandomGenerator.getInstance().calculateDamage(0, 350);
		List<Type> monsterType = monster.getTypes();

		if (monsterType.contains(Type.DRAGON)) {
			damage = damage * 2;
		}

		return damage;
	}

}
