package baseball.player.user;

import java.util.ArrayList;
import java.util.List;

import static baseball.player.computer.Computer.GAME_MAX_NUMBER;
import static baseball.player.computer.Computer.GAME_MIN_NUMBER;

public class Player {
    private final List<Integer> guessNum;
    private static final int VALID_LENGTH = 3;
    public Player() {
        guessNum = new ArrayList<>();
    }

    // 1. guessNum을 입력받아 검증한다
    public void getGuessNum(String guess) {
        //검증
        validatePlayerNum(guess);
        //맞으면 할당
        assignGussNum(guess);
    }

    public void validatePlayerNum(String guess) {
        try {
            // 길이는 3
            checkLength(guess);
            // 모두 숫자
            checkDigit(guess);
            // 123 ~ 987
            checkRange(guess);
            // 111처럼 중복불가
            checkDuplicated(guess);
        } catch (IllegalArgumentException e) {
            throw e;
        }

    }


    private void checkLength(String guess) {
        if (guess.length() != VALID_LENGTH) {
            throw new IllegalArgumentException(VALID_LENGTH + "자리인지 확인해주세요");
        }
    }

    private void checkDigit(String guess) {
        for (int i = 0; i < guess.length(); i++) {
            char ch = guess.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new IllegalArgumentException();
            }
        }
    }

    private void checkRange(String guess) {
        int guessNum = Integer.parseInt(guess);
        if (guessNum < GAME_MIN_NUMBER || guessNum > GAME_MAX_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    private void checkDuplicated(String guess) {
        List<Character> duplicatedCheckList = new ArrayList<>();
        for (int i = 0; i < guess.length(); i++) {
            char ch = guess.charAt(i);
            if (duplicatedCheckList.contains(ch)) {
                throw new IllegalArgumentException();
            }
            duplicatedCheckList.add(ch);
        }
    }

    private void assignGussNum(String guess) {
        guessNum.clear();
        char[] chars = guess.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            guessNum.add(chars[i] - '0');
        }
    }

    public List<Integer> getGuess() {
        return this.guessNum;
    }

}
