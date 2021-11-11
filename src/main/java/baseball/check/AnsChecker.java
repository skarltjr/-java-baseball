package baseball.check;


import java.util.List;

public class AnsChecker {
    private List<Integer> guess;
    private List<Integer> answer;
    private final int length = 3;
    private StrikeOrBallChecker strikeOrBallChecker;
    private Returner returner;

    public AnsChecker() {
        this.strikeOrBallChecker = new StrikeOrBallChecker();
        this.returner = new Returner();
    }

    public void setGuess(List<Integer> guess) {
        this.guess = guess;
    }

    public void setAns(List<Integer> answer) {
        this.answer = answer;
    }

    public boolean checkIsAnswer() {
        for (int i = 0; i < this.length; i++) {
            if (this.guess.get(i) != this.answer.get(i)) {
                return false;
            }
        }
        return true;
    }

    public String returnResult() {
        if (!checkIsAnswer()) {
            strikeOrBallChecker.checkState(this.guess,this.answer);
            return returner.sbResult(strikeOrBallChecker.getState());
        }
        return returner.getAnsResult();
    }
}
