package game.components;

import java.util.List;

import game.attacks.Attack;
import game.types.Type;

public abstract class Monster {

	protected Integer life;
	protected Attack activeSkill;
	private Player player;
	protected String monsterName;
	protected List<Type> types;
	private Integer inicialDamage = null;

	public Monster(Integer life, String monsterName) {
		this.life = life;
		this.monsterName = monsterName;
	}

	public abstract void attack(Monster monster);

	public void onDamageReceive(Integer damage, Monster monster) {
		this.life = this.life - damage;
		if (this.life < 0) {
			this.life = 0;
		}
		System.out.println(this + " fue herido, queda con " + this.life + " puntos de vida");
	}

	public void move(PathBox oldPathBox, PathBox newPathBox) {
		oldPathBox.setMonster(null);
		newPathBox.setMonster(this);
	}

	/*
	 * GENERAMOS UN INICIAL-DAMAGE, EN EL CUAL OBTENEMOS UN DAÑO PRINCIPAL, DE OTRO
	 * MODO SIEMPRE SE CREA UN DAÑO CADA VEZ QUE QUEREMOS ACCEDER AL DAÑO CON ESTE
	 * CRITERIO VAMOS A ESTABLECER EL ORDEN DE UNA LISTA.
	 */

	public int getInicialDamage() {
		if (this.inicialDamage == null) {
			this.inicialDamage = activeSkill.damage(this);
		}
		return this.inicialDamage;
	}

	public String getMonsterName() {
		return monsterName;
	}

	public Attack getActiveSkill() {
		return activeSkill;
	}

	public Integer getLife() {
		return life;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public List<Type> getTypes() {
		return types;
	}

	@Override
	public String toString() {
		return monsterName;
	}

}
