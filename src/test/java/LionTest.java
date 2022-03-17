import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    // тест проверит выбрасывается ли исключение при передаче в конструктор класса неверного значения
    @Test(expected = Exception.class)
    public void testDoesHaveManeException() throws Exception {
        Lion lion = new Lion("Самка1");
    }


    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец");
        lion.setFeline(feline);
        int actual = lion.getKittens();
        int expected = feline.getKittens();
        assertEquals(actual, expected);
    }


    @Test
    public void testGetFood1() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood("Хищник");
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(actual, expected);
    }


    @Test
    public void testGetFood2() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood("Травоядное");
        List<String> expected = Arrays.asList("Трава", "Различные растения");
        assertEquals(actual, expected);
    }


}






