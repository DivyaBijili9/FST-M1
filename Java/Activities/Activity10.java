package Activities;
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<String>();
        h1.add("Mango");
        h1.add("Ball");
        h1.add("Cat");
        h1.add("Apple");
        h1.add("Man");
        h1.add("Women");
        System.out.println("Original HashSet: " + h1);
        System.out.println("Size: " + h1.size());
        System.out.println("Removing Mango from HashSet: " + h1.remove("Mango"));
        if(h1.remove("W")) {
            System.out.println("W removed from the Set");
        } else {
            System.out.println("W is not present in the Set");
        }
        System.out.println("Checking if Women is present: " + h1.contains("Women"));
        System.out.println("Updated HashSet: " + h1);
    }
}