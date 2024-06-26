import java.util.Scanner;

class Person{
    
    String name;
    
    Person(String name){
        this.name = name;
    }
    
    String getName(){
        return name;
    }
    
    void setName(String name){
        this.name = name;
    }

}

class Person1 extends Person{
    
    Integer age;
    String name; 
    String surName;
    
    Person1(String name,Integer age){
        super(name);
        this.age = age;
    }
    
    Integer getAge(){
        return age;
    }
    
    @Override
    String getName(){
        return name + surName;
    }
    
    void setAge(Integer age){
        this.age = age;
    }
    
    void setName(String name, String surName){
        this.name = name;
        this.surName = surName;
    }
}
class ConstructorExample1 {
	public static void main (String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter your name :: ");
	    String name = scanner.nextLine();
	    System.out.print("Enter age :: ");
	    Integer age = scanner.nextInt();
	   
	    Person1 personObj = new Person1(name, age);
	    
	    System.out.println("name is : " + personObj.name);
        System.out.println("age is : " + personObj.age);
        
        personObj.setName("Hari","Sha");
        System.out.println("new name is : " + personObj.getName());
        System.out.println("surName name is : " + personObj.surName);
        
        personObj.setAge(27);
        System.out.println("new age is : " + personObj.getAge());

	}
}
