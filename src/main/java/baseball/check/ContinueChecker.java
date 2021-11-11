package baseball.check;

import java.util.Scanner;

public class ContinueChecker {
    private static final int WANT_TO_CONTINUE= 1;
    private static final int CLOSE = 2;
    private int wantToContinue;
    private Scanner scanner;

    public ContinueChecker(Scanner scanner) {
        this.scanner = scanner;
        this.wantToContinue = 1;
    }

    public boolean checkIfContinue() {
        askToContinue();
        if (wantToContinue == 1) {
            return true;
        }
        return false;
    }

    public void askToContinue() {
        System.out.println("게임을 새로 시작하려면 " + WANT_TO_CONTINUE + ", 종료하려면 " + CLOSE + " 를 입력해주세요");
        String next = scanner.nextLine().trim();
        wantToContinue = Integer.parseInt(next);
    }


}
