//class-class=extends
//class- interface =implements
//interface to interface =extends
//interface can have only static varibale and  abstract methods.
//Simple interface,FunctionInterface and Marker interface are the three types of 
//interfaces
//interface that has only once absract method is called functionalInterface.

interface A{
    int age=21; //in interfaces everything are final and static.
    void show();
}
interface B extends A{
    void run();

}
@FunctionalInterface
interface D {
    void show();
}

class C implements B{
    public void show(){
        System.out.println("I am in show");
    }
    public void run(){
        System.out.println("I am in run");
    }

}



public class Interfaces {
    public static void main(String[] args) {

        B obj;
        obj=new C();
        obj.run();
        obj.show();

        D d=()-> System.out.println("I am show method declaraction");
    }
}
