package baseball;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    private static final int INIT_LIST_CAPACITY = 3;
    private List<Integer> randomNumber;

    public Computer() {
        randomNumber = new ArrayList<>(INIT_LIST_CAPACITY);
    }

    protected void makeRandomNumber() {
        initRandomNumber();
        selectNumber();
    }

    private void selectNumber() {
        while (randomNumber.size() < INIT_LIST_CAPACITY) {
            int number = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);

            if (!isExistNumber(number)) {
                addRandomNumber(number);
            }
        }
    }

    private boolean isExistNumber(int number) {
        if (randomNumber.contains(number)) {
            return true;
        }
        return false;
    }

    private boolean addRandomNumber(int number) {
        return randomNumber.add(number);
    }

    private void initRandomNumber() {
        randomNumber.clear();
    }
}
