package baseball;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameStart(new Computer(), new Player(), new Checker());
    }
}
