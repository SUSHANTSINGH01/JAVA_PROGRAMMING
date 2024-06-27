import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");

        Collections.sort(list);

        for(String fruit : list) {
            System.out.println(fruit);
        }
    }
}
