import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    // тест проверит выбрасывается ли исключение при передаче в конструктор класса неверного значения
    @Test(expected = Exception.class)
    public void testDoesHaveManeException() throws Exception {
        Lion lion = new Lion("Самка1", feline);
        lion.doesHaveMane();
    }

    @Test
    public void testIsLionHaveManeTru() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedHasMane = true;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        int expected = 0;
        assertEquals(actual, expected);
    }


    @Test
    public void testGetFoodForPredator() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood("Хищник");
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(actual, expected);
    }


    @Test
    public void testGetFoodForHerbivore() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood("Травоядное");
        List<String> expected = Arrays.asList("Трава", "Различные растения");
        assertEquals(actual, expected);
    }


    @Test
    public void testGetFoodForLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }
}









