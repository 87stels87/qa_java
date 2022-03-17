import com.example.*;
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
    @Mock
    Predator predator;
    @Mock
    Cat cat;


    @Test
    public void testPositiveGetSoundCat() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals("Позитивная проверка на звук Мяу", expected, actual);
    }

    @Test
    public void testGetFoodForCat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = predator.eatMeat();
        assertEquals("Сравненине списков еды хищника и созданного объекта cat", expected, actual);
    }

    @Test
    public void testCountGetSound() {
        cat.getSound();
        cat.getSound();
        cat.getSound();
        Mockito.verify(cat, Mockito.times(3)).getSound();
    }

    @Test
    public void testCountGetFood() throws Exception {
        cat.getFood();
        cat.getFood();
        Mockito.verify(cat, Mockito.times(2)).getFood();
    }

    @Test
    public void testCountEatMeat() throws Exception {
        predator.eatMeat();
        Mockito.verify(predator, Mockito.times(1)).eatMeat();
    }


}



