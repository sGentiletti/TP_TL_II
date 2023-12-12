package game.monsters;

import java.util.Arrays;

import game.attacks.Slice;
import game.components.Monster;
import game.types.Type;

public class Spartan extends Monster {

	public Spartan(String name) {
		super(500, name);
		this.activeSkill = new Slice();
		this.types = Arrays.asList(Type.SWORD);
	}

	@Override
	public void attack(Monster enemy) {
		int damage = this.getActiveSkill().damage(enemy);
		System.out.println("--     [" + this + "] ataca a [" + enemy + "] haciendole " + damage + " de daño");
		enemy.onDamageReceive(damage, this);
	}
}
