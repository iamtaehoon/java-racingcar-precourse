package racingcar;

import static racingcar.view.InputView.*;

import java.util.Arrays;

public class Validator {

	public static void validateEveryCarName(String[] everyCarName) {
		Arrays.stream(everyCarName).forEach(Validator::validateCarName);
	}

	private static void validateCarName(String eachCarName) {
		if (eachCarName.length() > CAR_NAME_LETTERS_STANDARD) {
			throw new IllegalArgumentException(
				String.format(CAR_NAME_OVER_STANDARD_ERROR_MESSAGE, CAR_NAME_LETTERS_STANDARD));
		}
		if (eachCarName.isEmpty()) {
			throw new IllegalArgumentException(CAR_NAME_NOT_NULL_ERROR_MESSAGE);
		}
	}

	public static void hasNoCarNameAtLast(String inputValue) {
		if (inputValue.endsWith(CAR_SPLIT_REGEX)) {
			throw new IllegalArgumentException(CAR_NAME_NOT_NULL_ERROR_MESSAGE);
		}
	}

	public static Integer validateTryCnt(String tryCntString) {
		int tryCnt;
		validateTryCntIsNumber(tryCntString);
		tryCnt = Integer.parseInt(tryCntString);
		validateTryCntIsPositive(tryCnt);
		return tryCnt;
	}

	private static void validateTryCntIsPositive(int tryCnt) {
		if (tryCnt < 0) {
			throw new IllegalArgumentException(TRY_CNT_IS_NOT_NEGATIVE_MESSAGE);
		}
	}

	private static void validateTryCntIsNumber(String tryCntString) {
		if (!tryCntString.matches(NUMBER_REGEX)) {
			throw new IllegalArgumentException(TRY_CNT_IS_NOT_NUMBER_MESSAGE);
		}
	}
}