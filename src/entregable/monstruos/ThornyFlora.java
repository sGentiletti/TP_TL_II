package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.Plant;
import entregable.ataques.RazorLeaf;
import entregable.ataques.Water;
import game.components.Monster;
import game.types.Type;

public class ThornyFlora extends Monster {
	private List<Plant> skills = Arrays.asList(new RazorLeaf());

	public ThornyFlora(String name) {
		this.life = 400;
		this.monsterName = name;
		this.activeSkill = skills.get(0);
		this.types = Arrays.asList(Type.PLANT);
	}

	@Override
	public void onDamageReceive(Integer damage, Monster monster) {

		if (monster.getActiveSkill() instanceof Water) {
			this.life = this.life + damage;
			System.out.println(this + " se recupero, ahora tiene " + this.life + " puntos de vida");
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
		monster.onDamageReceive(this.activeSkill.damage(monster), this);
	}

}
