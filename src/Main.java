import java.util.*;
import game.components.*;
import game.monsters.*;
public class Main {
	public static void main(String[] args) {
		RumbleGame rumbleGame = RumbleGame.getInstance();
		rumbleGame.init();

		List<Monster> monstersOne = Arrays.asList(new Spartan("Spartan 1"), new Spartan("Spartan 2"),
				new Spartan("Spartan 3"), new Spartan("Spartan 4"), new Spartan("Spartan 5"), new Spartan("Spartan 6"),
				new Spartan("Spartan 7"), new Spartan("Spartan 8"), new Spartan("Spartan 9"), new Spartan("Spartan 10"),
				new IceBeast("Ice Beast"), new Spartan("Spartan 24"), new Spartan("Spartan 224"),
				new Spartan("Spartan 34"), new Spartan("Spartan 44"), new Spartan("Spartan 64"),
				new Spartan("Spartan 15"));

		rumbleGame.getPlayerOne().setMonsters(monstersOne);
		
		for(Monster monster: monstersOne) {
			System.out.println(monster.toString());
			//System.out.println(monster.activeSkill.Damage);
		}
		System.out.println("-----------------------------");
		// ordenar Monstruos por cantidad de vida
		Collections.sort(monstersOne, new ComparatorLife() );
		for(Monster monster: monstersOne) {
			System.out.println(monster.toString());
		}
		System.out.println("-----------------------------");
		// ordenar Monstruos por Daño del ataque
		Collections.sort(monstersOne, new ComparatorAttack());
		for(Monster monster: monstersOne) {
			System.out.println(monster.toString());
		}
		System.out.println("-----------------------------");
		
		List<Monster> monstersTwo = Arrays.asList(new Spartan("Spartan A"), new Spartan("Spartan B"));
		
		
		for(Monster monster: monstersTwo) {
			System.out.println(monster.toString());
		}
		System.out.println("-----------------------------");
		// ordenar Monstruos por cantidad de vida
		Collections.sort(monstersTwo, new ComparatorLife() );
		for(Monster monster: monstersTwo) {
			System.out.println(monster.toString());
		}
		System.out.println("-----------------------------");
		// ordenar Monstruos por Daño del ataque
		Collections.sort(monstersTwo, new ComparatorAttack());
		for(Monster monster: monstersTwo) {
			System.out.println(monster.toString());
		}
		System.out.println("-----------------------------");
		
		
		rumbleGame.getPlayerTwo().setMonsters(monstersTwo);

		rumbleGame.startGame();
	}
}