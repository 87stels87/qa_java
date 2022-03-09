import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void testPositiveGetSoundCat() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

    @Test
    public void testNegativeGetSoundCat() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = " Мяу ";
        assertNotEquals(expected, actual);
    }


    @Mock
    Predator predator;

    @Test
    public void testGetFoodForCat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = predator.eatMeat();
        assertEquals(expected, actual);

    }

}
