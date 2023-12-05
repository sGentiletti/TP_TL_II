package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.HydroCannon;
import entregable.ataques.Water;
import game.components.Monster;
import game.types.Type;

public class FuryFish extends Monster {
	private List<Water> skills = Arrays.asList(new HydroCannon());

	public FuryFish(String name) {
		this.life = 800;
		this.monsterName = name;
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.WATER);
	}

	@Override
	public void attack(Monster monster) {
		monster.onDamageReceive(this.activeSkill.damage(monster), this);
	}

}
