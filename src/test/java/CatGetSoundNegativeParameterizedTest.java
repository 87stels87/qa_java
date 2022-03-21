import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class CatGetSoundNegativeParameterizedTest {

    private final String expected;

    public CatGetSoundNegativeParameterizedTest(String expected) {

        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] checkedSound() {
        return new Object[][]{
                {"мяу"},
                {"Мяу "},
                {" Мяу "},
                {"МяУ "},
                {"Мяу!"},
                {"Myau"},
                {"М я у"}
        };
    }

    @Test
    public void testGetSoundNegative() {
        Cat cat = new Cat(new Feline());
        String actual = cat.getSound();
        assertNotEquals("Подаваемые для сравнения варианты не должны быть равны Мяу", expected, actual);
    }
}

