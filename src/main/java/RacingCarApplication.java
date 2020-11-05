import racingcar.domain.RandomStrategyGenerator;
import racingcar.domain.Racing;
import racingcar.ui.InputView;
import racingcar.ui.ResultView;

public class RacingCarApplication {
    static Racing racing;

    public static void main(String[] args) throws Exception {
        int numberOfCars = InputView.askToInsertNumberOfCars();
        int numberOfTries = InputView.askToInsertNumberOfTries();

        racing = new Racing(numberOfCars, numberOfTries);
        String result = racing.race(RandomStrategyGenerator.getInstance());

        ResultView.print(result);
    }
}
