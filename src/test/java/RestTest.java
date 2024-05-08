import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqamvn.rest.services.Rest;

public class RestTest {

    @ParameterizedTest
    @CsvFileSource(files = "scr/test/resources/Rest.csv")
    public void shouldCalcMonth(int income, int expenses, int threshold, int expected) {
        Rest service = new Rest();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
    //   @Test
    //  public void shouldCalcMonth() {
    //     Rest service = new Rest();

    //     int income = 100000;
    //    int expenses = 60000;
    //    int threshold = 150000;
    //    int expected = 2;

    //   int actual = service.calculate(income, expenses, threshold);

    //   Assertions.assertEquals(expected, actual);
    // }
}
