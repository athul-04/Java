//This means that the method of the class that has the object created will extecute the method

class A{
    public void show(){
        System.out.println("I am in Class A");
    }

}
class B extends A{
    public void show(){
        System.out.println("I am in Class B");
    }

}

class C extends B{
    public void show(){
        System.out.println("I am in Class C");
    }

}


public class dynamicMethodDispatch {
    public static void main(String[] args) {

        A a=new A();
        a.show();
        A b=new B();
        b.show();
        A c= new C();
        c.show();
    }
}
