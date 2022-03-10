import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LionTest {

    @Test
    public void testN1t() throws Exception {
        Lion l1 = new Lion("Самка",new Feline());
        l1.doesHaveMane();
        assertEquals(false,  l1.doesHaveMane());
    }
}
