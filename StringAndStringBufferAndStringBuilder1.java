import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
      
      // String 
      
      String[] strArray = new String[3];
      String strArray[] = new String[4];
      strArray[0]="one";
      strArray[1]="two";
      strArray[2]="three";
      strArray[3]=new String("Four");
      for(String it:strArray)
      System.out.println(it);
      
      
      // StringBuffer
      
      // StringBuffer[] strArray = new StringBuffer[4];
      // strArray[0] = new StringBuffer().append("One");
      // strArray[0].append(" New One");
      // strArray[1] = new StringBuffer().append("Two");
      // strArray[1].setCharAt(0,'2');
      // strArray[2] = new StringBuffer().append("Three");
      
      // strArray[3] = new StringBuffer("Four");
      
      // for (StringBuffer it : strArray) {
      //     System.out.println(it.toString());
      // }
      
      
      // StringBuilder
      
      // StringBuilder[] strArray = new StringBuilder[4];
      // strArray[0] = new StringBuilder().append("One");
      // strArray[0].append(" New One");
      // strArray[1] = new StringBuilder().append("Two");
      // strArray[1].setCharAt(0,'2');
      // strArray[2] = new StringBuilder().append("Three");
      
      // strArray[3] = new StringBuilder("Four");
      
      // for (StringBuilder it : strArray) {
      //     System.out.println(it.toString());
      // }
      
  }
}
