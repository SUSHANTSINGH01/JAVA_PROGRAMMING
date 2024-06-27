public class Main {
    public static void main(String[] args) {
        try{
            int data=85/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
