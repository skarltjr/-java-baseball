package baseball.check;

public class Returner {
    private String result = "정답입니다!";




    public String getAnsResult() {
        result = "정답입니다!";
        return this.result;
    }

    public String sbResult(String state) {
        this.result = state;
        return result;
    }
}
