package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class InputView {
	public static final String INPUT_EVERY_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String INPUT_TRY_CAR_MOVING_CNT = "시도할 회수는 몇회인가요?";
	public static final String CAR_SPLIT_REGEX = ",";

	public static String[] enterEveryCarName() {
		System.out.println(INPUT_EVERY_CAR_NAME_MESSAGE);
		return Console.readLine().split(CAR_SPLIT_REGEX);
	}

	public static int enterTryCnt() {
		System.out.println(INPUT_TRY_CAR_MOVING_CNT);
		String tryCntString = Console.readLine();
		return validateTryCnt(tryCntString);
	}

	private static Integer validateTryCnt(String tryCntString) {
		int tryCnt;
		validateTryCntIsNumber(tryCntString);
		tryCnt = Integer.parseInt(tryCntString);
		validateTryCntIsPositive(tryCnt);
		return tryCnt;
	}

	private static void validateTryCntIsPositive(int tryCnt) {
		if (tryCnt < 0) {
			throw new IllegalArgumentException("음수만큼 자동차를 이동시킬 수 없다.");
		}
	}

	private static void validateTryCntIsNumber(String tryCntString) {
		if (!tryCntString.matches("-?\\d+")) {
			throw new IllegalArgumentException("숫자가 아닌 값을 입력.");
		}
	}
}