import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamvn.rest.services.Rest;

public class RestTest {
    @Test
    public void shouldCalcMonth() {
        Rest service = new Rest();

        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
