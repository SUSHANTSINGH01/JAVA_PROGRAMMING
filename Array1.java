public class Main {

  public static void main(String[] args){
    System.out.println("Hello from New Class");
    
   // Integer[] array = {1,2,3,4,5};
    Integer[] array = new Integer[3];
    array[0]=1;
    array[1]=2;
    array[2]=3;
    
    System.out.println("value at index 2 is : " + array[2]);
    System.out.println("length of array is : " + array.length);
    
    for(int it:array)
    System.out.println(it);
    
    
    // int[][] array2d = { {1,2,3},
    //                         {4,5,6},
    //                         {7,8,9} };
                            
    
    // System.out.println("value at row 1 and column 2 is : " + array2d[1][2]);
    // System.out.println("length of 1st row is : " + array2d[1].length);
    
    // for(int[] it : array2d){
    //   for(int it1 : it){
    //     System.out.print(it1+" ");
    //   }
    //   System.out.println();
    // }
                                                    
  }

}
