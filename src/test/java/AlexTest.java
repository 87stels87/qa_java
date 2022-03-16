import com.example.Alex;
import com.example.Feline;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {

    Alex alex = new Alex();

    @Test
    public void testGetPlaceOfLiving() {
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetKittens() {
        alex.setFeline(new Feline());
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFriends() {
        List<String> actual = alex.getFriends();
        List<String> expected = Arrays.asList("Марти", "Глори", "Мелман");
        assertEquals(expected, actual);
    }

    @Test
    public void testGetSex() {
        String actual = alex.getSex();
        String expected = "Самец";
        assertEquals(expected, actual);
    }
}
