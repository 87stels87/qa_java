import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals("Семейство кошачих употребляет в пищу животных, птицу и рыбу", expected, actual);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Семейство feline = Кошачьи", expected, actual);
    }

    @Test
    public void getKittensCountFelineTest() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals("По умолчанию у кошачих 1 детеныш", expectedCount, actualCount);
    }
}
