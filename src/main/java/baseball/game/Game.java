package baseball.game;

import baseball.check.AnsChecker;
import baseball.player.computer.Computer;
import baseball.player.user.Player;

import java.util.Scanner;

public class Game {
    private static final String USER_INPUT_MESSAGE = "예측 숫자를 입력해주세요";
    private final String IS_ANSWER = "정답입니다!";
    private Scanner scanner;
    private AnsChecker ansChecker;
    private Computer computer;
    private Player player;
    private String result;

    public Game(Scanner scanner) {
        this.scanner = scanner;
        this.computer = new Computer();
        this.player = new Player();
    }

    public void start() {
        init();
        while (true) {
            getGuessFromUser();
            ansChecker.setGuess(player.getGuess());
            result = ansChecker.returnResult();
            System.out.println(result);
            if (isAnswer()) {
                break;
            }
        }
    }

    public void init() {
        ansChecker = new AnsChecker();
        ansChecker.setAns(computer.getAnswer());
    }

    public void getGuessFromUser() {
        System.out.println(USER_INPUT_MESSAGE);
        player.getGuessNum(scanner.nextLine());
    }

    public boolean isAnswer() {
        if (result.equals(IS_ANSWER)) {
            return true;
        }
        return false;
    }

}
