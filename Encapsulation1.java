import java.util.Scanner;

class Person{
    String name;
    Integer age;
    
    Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    
    String getName(){
        return name;
    }
    
    void setName(String name){
        this.name = name;
    }
    
    Integer getAge(){
        return age;
    }
    
    void setAge(Integer age){
        this.age = age;
    }
}
class ConstructorExample1 {
	public static void main (String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter your name :: ");
	    String name = scanner.nextLine();
	    System.out.print("Enter age :: ");
	    Integer age = scanner.nextInt();
	   
	    Person personObj = new Person(name, age);
	    
        System.out.println("name is : " + personObj.name);
        System.out.println("age is : " + personObj.age);
        
        personObj.setName("Hari");
        System.out.println("new name is : " + personObj.getName());
        
        personObj.setAge(27);
        System.out.println("new age is : " + personObj.getAge());

	}
}
