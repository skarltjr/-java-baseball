package baseball.check;

import java.util.List;

public class StrikeOrBallChecker {
    private int strike;
    private int ball;
    private final String strikeStr = "스트라이크는 ";
    private final String ballStr = " 볼은 ";
    private final String count = "개 입니다.";
    private String state = "";
    private final int length = 3;
    private final int zero = 0;

    public void checkState(List<Integer> guess, List<Integer> answer) {
        strike = zero;
        ball = zero;

        ballCheck(guess, answer);
        strikeCheck(guess, answer);
        setState();
    }

    public void ballCheck(List<Integer> guess, List<Integer> answer) {
        for (int i = 0; i < length; i++) {
            if (answer.contains(guess.get(i))) {
                ball++;
            }
        }
    }

    public void strikeCheck(List<Integer> guess, List<Integer> answer) {
        for (int i = 0; i < length; i++) {
            if (guess.get(i) == answer.get(i)) {
                strike++;
                ball--;
            }
            System.out.printf("%d  %d    ",guess.get(i),answer.get(i));
        }
    }

    private void setState() {
        if (ball == zero && strike == zero) {
            this.state = "낫싱";
            return;
        }
        this.state = strikeStr + strike + count + ballStr + ball + count;
        System.out.println(strike + " strike" + ball + " ball");
    }

    public String getState() {
        return this.state;
    }
}
