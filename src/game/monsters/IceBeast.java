package game.monsters;

import java.util.Arrays;
import java.util.List;

import game.attacks.Cold;
import game.attacks.ColdBreath;
import game.attacks.IceSpike;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class IceBeast extends Monster {

	private List<Cold> skills = Arrays.asList(new ColdBreath(), new IceSpike());

	public IceBeast(String name) {
		super(200, name);
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.COLD, Type.BEAST);
	}

	@Override
	public void attack(Monster monster) {
		monster.onDamageReceive(this.getActiveSkill().damage(monster), this);
	}

	@Override
	public void move(PathBox oldPathBox, PathBox newPathBox) {
		super.move(oldPathBox, newPathBox);
		if (this.getActiveSkill() instanceof ColdBreath) {
			this.activeSkill = skills.get(1);
		} else {
			this.activeSkill = skills.get(0);
		}
	}
}
