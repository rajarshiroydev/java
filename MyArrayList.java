import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");

        for (String s : food) {
            System.out.println(s);
        }
    }
}
