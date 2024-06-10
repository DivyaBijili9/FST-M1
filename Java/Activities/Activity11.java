package Activities;
import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> color_map = new HashMap<Integer, String>();
        color_map.put(1, "Red");
        color_map.put(2, "Green");
        color_map.put(3, "Blue");
        color_map.put(4, "White");
        color_map.put(5, "Black");
        System.out.println("The Original map: " + color_map);
        color_map.remove(5);
        System.out.println("After removing Black: " + color_map);
        if(color_map.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        System.out.println("Number of pairs in the Map is: " + color_map.size());
    }
}
