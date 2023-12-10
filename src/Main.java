import java.util.*;
import game.components.*;
import game.monsters.*;
import game.components.comparators.*;

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

		Random random = new Random();
		
		rumbleGame.getPlayerOne().setMonsters(monstersOne);
		
		mostrarTodosLosOrdenes(monstersOne);
		
		seleccionarOrdenRandom(random, monstersOne);
		
		List<Monster> monstersTwo = Arrays.asList(new Spartan("Spartan A"), new Spartan("Spartan B"));

		mostrarTodosLosOrdenes(monstersTwo);

		seleccionarOrdenRandom(random, monstersTwo);
		
		rumbleGame.getPlayerTwo().setMonsters(monstersTwo);

		rumbleGame.startGame();
	}

	private static List<Monster> seleccionarOrdenRandom(Random random, List<Monster> monsters) {
		int value = random.nextInt((3 - 1 ) + 1) + 1;
		
		switch (value){
			case 1: Collections.sort(monsters, new ComparatorLife());
			case 2: Collections.sort(monsters, new ComparatorAttack());
			case 3: Collections.sort(monsters, new ComparatorName());
		}
		return monsters;
	}

	private static void mostrarTodosLosOrdenes(List<Monster> monsters) {
		System.out.println("Monstruos sin Orden \n");
		mostrarListaDeMonstruos(monsters);

		System.out.println("Monstruos por vida");
		Collections.sort(monsters, new ComparatorLife());
		mostrarListaDeMonstruos(monsters);

		System.out.println("Monstruos por cantidad de daño \n");
		Collections.sort(monsters, new ComparatorAttack());
		mostrarListaDeMonstruos(monsters);

		System.out.println("Monstruos por nombre \n");
		Collections.sort(monsters, new ComparatorName());
		mostrarListaDeMonstruos(monsters);
	}

	private static void mostrarListaDeMonstruos(List<Monster> monsters) {
		for (Monster monster : monsters) {
			System.out.println(monster.getMonsterName());
			System.out.println(monster.getLife());
			System.out.println(monster.getActiveSkill().damage(monster));
		}
		System.out.println("-----------------------------");
	}
}