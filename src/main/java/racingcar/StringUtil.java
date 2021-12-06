package racingcar;

import static racingcar.view.InputView.*;

public class StringUtil {
	public static String[] splitUsingComma(String inputEveryCarsName) {
		CarNameValidator.hasNoCarNameAtLast(inputEveryCarsName);
		return inputEveryCarsName.split(CAR_SPLIT_REGEX);
	}
}

