import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        String[] input1 = {"hi", "bye"};
        assertArrayEquals(new String[]{"hi", "bye"}, ListExamples.filter())
    }

    @Test
    public void testMerge() {

    }
}
