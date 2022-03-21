
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

//тестовый класс с параметрами для тестирования класса Lion
@RunWith(Parameterized.class)
public class LionDoesHaveManeWithParameterizedTest {
    Feline feline = new Feline();
    private final String sex;
    private final boolean expected;

    public LionDoesHaveManeWithParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] hasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},// передали 2 комплекта тестовых данных
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals("Параметризованный тест на проврку наличия гривы", expected, actual);
    }
}




