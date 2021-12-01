package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    public static int MIN_RANDOM = 0;
    public static int MAX_RANDOM = 9;
    public static int VALUE_MOVING_CAR = 4;



    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        if (canMoveCar()) {
            position += 1;
        }
    }

    public int moveThisDistance() {
        return position;
    }

    private boolean canMoveCar() {
        return Randoms.pickNumberInRange(MIN_RANDOM, MAX_RANDOM) > VALUE_MOVING_CAR;
    }

    @Override
    public String toString() {
        return name;
    }

    public String showMovingMark() {
        String movingMark = "";
        for (int i = 0; i < position; i++) {
            movingMark += "-";
        }
        return movingMark;
    }
}