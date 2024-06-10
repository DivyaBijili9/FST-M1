import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Activity1{
    static ArrayList<String> list1;
    @BeforeAll
    public static void setup(){
        // Initialize a new ArrayList
        list1 = new ArrayList<String>();
// Add values to the list
        list1.add("alpha"); // at index 0
        list1.add("beta"); // at index 1
    }
    @Test
    public void insertTest()
    {
        assertEquals(2,list1.size());
        list1.add("gamma");
        assertEquals(3,list1.size());
        assertEquals("alpha",list1.get(0));
        assertEquals("beta",list1.get(1));
        assertEquals("gamma",list1.get(2));
    }
    @Test
    public void replaceTest()
    {

        assertEquals(2,list1.size());
        list1.add("gamma");
        assertEquals(3,list1.size());
        assertEquals("alpha",list1.get(0));
        assertEquals("beta",list1.get(1));
        assertEquals("gamma",list1.get(2));
        list1.set(1, "divya");
        assertEquals("alpha",list1.get(0));
        assertEquals("divya",list1.get(1));
        assertEquals("gamma",list1.get(2));

    }

}
