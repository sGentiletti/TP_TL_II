import java.util.Arrays;
import java.util.List;
import game.components.Monster;
import game.components.RumbleGame;
import game.monsters.EvilBeast;
import game.monsters.IceBeast;
import game.monsters.Spartan;

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

		// TODO ordenar el listado de monstruos que recibe el jugador uno
		rumbleGame.getPlayerOne().setMonsters(monstersOne);
		// creamos 3 indices uno para cada lista
		int i = 0, j = 0, k = 0;
		// creamos tres listas cada una con un criterio de orden distinto
		List<Monster> monstersReorderedLife = new ArrayList<>();
		List<Monster> monstersReorderedTypes = new ArrayList<>();
		List<Monster> monstersReorderedAttacks = new ArrayList<>();
		for (Monster monster : monstersOne) {
			if (!monstersReorderedLife.isEmpty()) {
				while (monstersReorderedLife.get(i).getLife() > monster.getLife() && i < monstersReorderedLife.size()) {
					i++;
				}
				// preguntar por el criterio para el orden de la cantidad de daño  y el orden por el tipo de monstruo
				/*
				while (monstersReorderedAttacks.get(j).getAttack() > monster.getAttack()
						&& j < monstersReorderedAttacks.size()) {
					j++;
				}
				while (monstersReorderedTypes.get(k).getTypes() > monster.getTypes()
						&& k < monstersReorderedTypes.size()) {
					k++;
				}
				*/
			}
			monstersReorderedLife.add(monster);
			// monstersReorderedTypes.add(monster);
			// monstersReorderedAttack.add(monster);
		}

		List<Monster> monstersTwo = Arrays.asList(new Spartan("Spartan A"), new Spartan("Spartan B"));

		// TODO ordenar el listado de monstruos que recibe el jugador dos

		rumbleGame.getPlayerTwo().setMonsters(monstersTwo);

		rumbleGame.startGame();
	}
}