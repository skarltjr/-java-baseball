package baseball.player.computer;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    public static final int GAME_MIN_NUMBER = 123;
    public static final int GAME_MAX_NUMBER = 987;
    private final List<Integer> randomNums;

    // 컴퓨터가 시작되면 정답 랜덤넘버를 생성
    public Computer() {
        randomNums = new ArrayList<>();
        generateNumber();
    }

    public void generateNumber() {
        int randInt = RandomUtils.nextInt(GAME_MIN_NUMBER, GAME_MAX_NUMBER);
        System.out.println(randInt + "hello");
        convertIntToList(randInt);
    }

    public void convertIntToList(int randNum) {
        char[] randNumChars = convertIntToStr(randNum).toCharArray();
        for (int i = 0; i < randNumChars.length; i++) {
            randomNums.add(randNumChars[i] - '0');
        }
    }

    public String convertIntToStr(int randNum) {
        return String.valueOf(randNum);
    }

    public List<Integer> getAnswer() {
        return this.randomNums;
    }
}
