package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.HydroCannon;
import entregable.ataques.Water;
import game.components.Monster;
import game.types.Type;

public class FuryFish extends Monster {
	private static Long serialFury = 300L;
	private List<Water> skills = Arrays.asList(new HydroCannon());

	public FuryFish(String name) {
		super(800, name, serialFury);
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.WATER);
	}

	@Override
	public void attack(Monster monster) {
		monster.onDamageReceive(this.getActiveSkill().damage(monster), this);
	}

}
