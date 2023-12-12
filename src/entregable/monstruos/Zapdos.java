package entregable.monstruos;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import entregable.ataques.*;
import game.attacks.Attack;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class Zapdos extends Monster {
	private List<Attack> skills = Arrays.asList(new ThunderShock(), new SkyAttack(), new DragonRush());
	private Random random = new Random();

	public Zapdos(String name) {
		super(1000, name);
		this.monsterName = name;
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.ELECTRIC, Type.FLYING);
	}

	@Override
	public void onDamageReceive(Integer damage, Monster monster) {

		if (monster.getActiveSkill() instanceof Electric) {
			this.life = this.life + damage;
			System.out.println(this + " recargo energia! Ahora tiene " + this.life + " puntos de vida");

		} else {
			this.life = this.life - damage;
			if (this.life < 0) {
				this.life = 0;
			}
			System.out.println(this + " fue herido, queda con " + this.life + " puntos de vida");
		}

	}

	@Override
	public void attack(Monster monster) {
		monster.onDamageReceive(this.getActiveSkill().damage(monster), this);
		this.changeActiveSkill();
	}

	@Override
	public void move(PathBox oldPathBox, PathBox newPathBox) {
		super.move(oldPathBox, newPathBox);
		this.changeActiveSkill();
	}

	private void changeActiveSkill() {
		this.activeSkill = skills.get(random.nextInt(3));
		System.out.println(
				this + " prepara " + this.getActiveSkill().getClass().getSimpleName() + " para su siguiente ataque");
	}
}
