import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

// Создал тестовый класс с параметрами для тестирования класса Lion
@RunWith(Parameterized.class)
public class LionDoesHaveManeWithParameterizedTest {
    private final String sex;
    private final boolean expected;

    public LionDoesHaveManeWithParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] hasMane () {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},// передали 2 комплекта тестовых данных
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane(); // обратились к полям тестового класса
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }
}


