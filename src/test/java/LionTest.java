import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    // тест проверит текст исключения:
    @Test(expected = AssertionError.class)
    public void testDoesHaveManeException() throws AssertionError {
        try {
            Lion lion = new Lion("Самка1", feline);
            fail("Expected AssertionError");
        } catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }

    @Test
    public void testIsLionHaveManeTru() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = 0;
        assertEquals("Количество львят при создании объекта lion = 0", expected, actual);
    }

    @Test
    public void testGetFoodForPredator() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood("Хищник");
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals("Для Хищника коллекция еды = Животные, Птица и Рыба", expected, actual);
    }

    @Test
    public void testGetFoodForHerbivore() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood("Травоядное");
        List<String> expected = Arrays.asList("Трава", "Различные растения");
        assertEquals("Для Травоядного коллекция еды = Трава, Различные расстения", expected, actual);
    }

    @Test
    public void testGetFoodForLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals("Мок на возврат значений Животные, птицы и рыбы для хищника", expectedEatMeat, actualEatMeat);
    }
}









