package Java_Method_Example;

public class Method {
 
    //Create add method to call the main method
    static void add(){
        System.out.println("Hello World i'm from add method ");

    }
    public static void main(String[] args) {
        System.out.println("Hello World i'm from main method ");
        //call the method 
        add();
    }
    
}
