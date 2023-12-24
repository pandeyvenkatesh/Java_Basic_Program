package Java_Classess;
//Multiple Attributes

class second2{
    String fname="Venkatesh";
    String lname="Pandey";
    int age =25;
}
public class obj5 {
    public static void main(String[] args) {
        second2 myobj=new second2();

        System.out.println("Name "+myobj.fname+" "+myobj.lname);
        System.out.println("Age: "+myobj.age);
    }
}
