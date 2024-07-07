import java.util.List;
import java.util.ArrayList;

public class Main {

  public static void main(String [] args){
    
      List list = new ArrayList();
    // ArrayList list = new ArrayList();
    // LinkedList list = new ArrayList();
      list.add(87);
      list.add("hello");
      
      for(Object it:list)
      System.out.println(it);
      
      System.out.println((String) list.get(1));
    
    
    // List<String> list = new ArrayList<>();
    // ArrayList<String> list = new ArrayList<>()
    // LinkedList<String> list = new LinkedList<>()
    
    // list.add("10");
    // list.add("hello");
    
    // for(String it:list)
    // System.out.println(it);
    
    // System.out.println(list.get(1));
  }

}
