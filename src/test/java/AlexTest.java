import com.example.Alex;
import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {
    @Test
    public void testGetFriends() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        List<String> actual = alex.getFriends();
        List<String> expected = Arrays.asList("Марти", "Глори", "Мелман");
        assertEquals(actual, expected);
    }



    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йорк";
        assertEquals(actual, expected);
    }

    @Test
    public void testAlexGetKittens() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testAlexGetSex() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        String actual = alex.getSex();
        String expected = "Самец";
        assertEquals(actual, expected);
    }

}
