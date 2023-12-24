package Java_Classess;
class second {

    /*final*/ int x=10;  //if we use final keyword we can't override
}
    //override existing values:
public class obj4 {
    public static void main(String[] args) {
        second obj=new second();
        obj.x=25;
        System.out.println(obj.x);
    }
}
