import java.util.Arrays;
import java.util.List;

import entregable.monstruos.FuryFish;
import entregable.monstruos.ThornyFlora;
import entregable.monstruos.Zapdos;
import game.components.Monster;
import game.components.RumbleGame;
import game.monsters.EvilBeast;
import game.monsters.IceBeast;
import game.monsters.Spartan;

public class Main {
	public static void main(String[] args) {
		RumbleGame rumbleGame = RumbleGame.getInstance();
		rumbleGame.init();

		List<Monster> monstersOne = Arrays.asList(new Zapdos("Zapdos 1"), new Zapdos("Zapdos 2"),
				new FuryFish("FuryFish 1"), new ThornyFlora("ThornyFlora 1"));

		// TODO ordenar el listado de monstruos que recibe el jugador uno
		rumbleGame.getPlayerOne().setMonsters(monstersOne);

		List<Monster> monstersTwo = Arrays.asList(new Spartan("Spartan 2"), new ThornyFlora("ThornyFlora 2"),
				new FuryFish("FuryFish 2"));

		// TODO ordenar el listado de monstruos que recibe el jugador dos
		rumbleGame.getPlayerTwo().setMonsters(monstersTwo);

		rumbleGame.startGame();
	}
}