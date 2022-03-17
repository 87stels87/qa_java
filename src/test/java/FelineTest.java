import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittensNoParameter() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals("По умолчанию единица", expected, actual);
    }

    @Test
    public void testGetKittensWithParameter() {
        Feline feline = new Feline();
        int actual = feline.getKittens(5);
        int expected = 5;
        assertEquals("Должно быть равным параметру kittensCount", expected, actual);
    }

    @Mock
    Animal animal;

    @Test
    public void test() throws Exception {
        animal.getFood("Травоядное");
        Mockito.verify(animal).getFood("Травоядное");
    }



}
