package entregable.ataques;

import game.components.Monster;

public class SkyAttack implements Flying {

	@Override
	public int damage(Monster monster) {
		return 150;
	}

}
