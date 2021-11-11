package baseball;

import baseball.check.ContinueChecker;
import baseball.game.Game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContinueChecker continueChecker = new ContinueChecker(scanner);
        do {
            Game game = new Game(scanner);
            game.start();
        } while (continueChecker.checkIfContinue());
        System.out.println("종료합니다");
    }
}
