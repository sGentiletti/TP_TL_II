package game.monsters;

import java.util.Arrays;

import game.attacks.Curse;
import game.components.Monster;
import game.types.Type;

public class EvilBeast extends Monster {
	private static Long serialEvilBeast = 305L;
	
	public EvilBeast(String name) {
		super(700, name, serialEvilBeast);
		this.activeSkill = new Curse();
		this.types = Arrays.asList(Type.BEAST, Type.DEMON, Type.FIRE);
	}

	@Override
	public void attack(Monster enemy) {
		enemy.onDamageReceive(this.getActiveSkill().damage(enemy), this);
	}
}
