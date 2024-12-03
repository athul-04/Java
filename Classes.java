//static means making it as a class member not a object member
//We can access static varibales,static methods without the need for object creation

class Mobile{
    static String brand;
    int price;

    Mobile(){
        System.out.println("Hello in Constructor method");

    }
    static{
        brand="Samsung";//This will be called only once in the code(Only when the class loads)
    }
    static void Display(){
        System.out.println("Hello in static method");
    }


}


public class Classes {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile m=new Mobile();
        // Mobile m1=new Mobile();
        //If u want to load the class in the class loader without creating
        //the object for the class u should use Class.forName method.
        Class.forName("Mobile");

        new Mobile();//anonymous object.. for loading in heap.

        
    }
}
