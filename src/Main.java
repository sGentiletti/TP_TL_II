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

        List<Monster> monstersOne = Arrays.asList(new Spartan("Spartan 1"),
                new Spartan("Spartan 2"),
                new Spartan("Spartan 3"));

        //TODO ordenar el listado de monstruos que recibe el jugador uno
        rumbleGame.getPlayerOne().setMonsters(monstersOne);

        List<Monster> monstersTwo = Arrays.asList(new Spartan("Spartan A"),
                new Spartan("Spartan B"));

        //TODO ordenar el listado de monstruos que recibe el jugador dos
        rumbleGame.getPlayerTwo().setMonsters(monstersTwo);

        rumbleGame.startGame();
    }
}