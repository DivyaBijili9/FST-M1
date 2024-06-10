package Activities;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Sky");
        nameList.add("Teja");
        nameList.add("Rainbow");
        nameList.add(3, "Girish");
        nameList.add(1, "Manoj");
        System.out.println("Print the Objects:");
        for(String str1:nameList){
            System.out.println(str1);
        }

        System.out.println("3rd element is: " + nameList.get(2));
        System.out.println("Is rainbow is in list: " + nameList.contains("Rainbow"));
        System.out.println("Size of ArrayList: " + nameList.size());

        nameList.remove("Sky");

        System.out.println("New Size of ArrayList is: " + nameList.size());
    }
}