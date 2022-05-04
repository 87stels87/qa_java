
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineGetKittensParameterizedTest {

    private final int expected;

    public FelineGetKittensParameterizedTest(int expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Количестов детенышей: {0}")
    public static Object[][] getKittensData() {
        return new Object[][]{
                {1},
                {0},
                {-1},
        };
    }

    @Test
    public void testGetKittensWithArgument() {
        Feline feline = new Feline();
        int actual = feline.getKittens(expected);
        Assert.assertEquals("Серия проверок на проверку возврата количества детенышей", expected, actual);
    }
}
