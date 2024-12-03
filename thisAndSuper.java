class Person{
    private String name;
    public Person(){
        System.out.println("I am in person constructor");
    }
    public Person(String name){
        System.out.println("I am in person name constructor");
    }
}

class Manager extends Person{
    public Manager(){
        System.out.println("I am in Manager  constructor");
    }
    public Manager(String name){
        super(name);
        System.out.println("I am in manager name constructor");
    }
}

public class thisAndSuper {
    public static void main(String[] args) {
        Manager m=new Manager("Athul");

        
    }
}
