import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void testPositiveGetSoundCat() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals("Позитивная проверка на звук Мяу", expected, actual);
    }

    @Test
    public void testGetFoodForCat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = cat.getFood();
        assertEquals("Кошка питается животными, птицой и рыбой", expectedEatMeat, actualEatMeat);

    }
}



