import java.util.*;

import game.components.*;
import game.monsters.*;
import entregable.monstruos.*;
import game.components.comparators.*;

public class Main {
	public static void main(String[] args) {
		RumbleGame rumbleGame = RumbleGame.getInstance();
		rumbleGame.init();

		List<Monster> monstersOne = Arrays.asList(new Spartan("Spartan 1 - J1"), new EvilBeast("EvilBeast 1 - J1"),
				new EvilBeast("EvilBeast 2 - J1"), new Zapdos("Zapdos 1 - J1"), new IceBeast("Ice Beast 1 - J1"),
				new FuryFish("Fury Fish 1 - J1"), new Spartan("Spartan 2 - J1"), new ThornyFlora("Thorny Flora 1 - J1"),
				new FuryFish("Fury Fish 2 - J1"), new Zapdos("Zapdos 2 - J1"), new IceBeast("Ice Beast 2 - J1"),
				new ThornyFlora("Thorny Flora 2 - J1"), new EvilBeast("EvilBeast 3 - J1"));

		List<Monster> monstersTwo = Arrays.asList(new ThornyFlora("Thorny Flora 1 - J2"), new Spartan("Spartan 1 - J2"),
				new EvilBeast("EvilBeast 1 - J2"), new Spartan("Spartan 2 - J2"), new Zapdos("Zapdos 1 - J2"),
				new IceBeast("Ice Beast 1 - J2"), new IceBeast("Ice Beast 2 - J2"), new FuryFish("Fury Fish 1 - J2"),
				new Spartan("Spartan 3 - J2"), new ThornyFlora("Thorny Flora 2 - J2"), new FuryFish("Fury Fish 2 - J2"),
				new ThornyFlora("Thorny Flora 3 - J2"), new ThornyFlora("Thorny Flora 4 - J2"));

		/*
		 * SELECCIONAMOS UN ORDEN ALEATORIO Y LO DEJAMOS ESTABLECIDO.
		 */

		System.out.println("Orden Jugador 1:");

		seleccionarOrdenRandom(new Random(), monstersOne);

		System.out.println("Orden Jugador 2:");

		seleccionarOrdenRandom(new Random(), monstersTwo);

		/*
		 * A PARTIR DE ACA COMIENZA EL JUEGO
		 */

		rumbleGame.getPlayerOne().setMonsters(monstersOne);

		rumbleGame.getPlayerTwo().setMonsters(monstersTwo);

		rumbleGame.startGame();

		/*
		 * SE PUEDEN DESCOMENTAR LAS SIGUENTES LINEAS PARA MOSTRAR POR CONSOLA TODOS LOS
		 * ORDENES POSIBLES
		 */

		// mostrarTodosLosOrdenes(monstersOne);

		// mostrarTodosLosOrdenes(monstersTwo);
	}

	private static List<Monster> seleccionarOrdenRandom(Random random, List<Monster> monsters) {
		int value = random.nextInt(4);
		switch (value) {
		case 1:
			Collections.sort(monsters, new ComparatorLife());
			System.out.println(" Se establece Orden por vida");
			break;
		case 2:
			Collections.sort(monsters, new ComparatorAttack());
			System.out.println(" Se establece Orden por mayor daño de ataque");
			break;
		case 3:
			Collections.sort(monsters, new ComparatorName());
			System.out.println("Se Establece Orden por nombre");
			break;
		default:
			System.out.println("no se establece un orden, queda como llegaron");
			break;
		}
		return monsters;
	}

	private static void mostrarTodosLosOrdenes(List<Monster> monsters) {
		System.out.println("Monstruos sin Orden \n");
		mostrarListaDeMonstruos(monsters);

		System.out.println("Monstruos por vida \n");
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
			System.out.println(monster.getInicialDamage());
		}
		System.out.println("-----------------------------");
	}
}