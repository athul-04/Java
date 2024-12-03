class Calculator{
    int num=10; //num is a instance varibale

    public int add(int n1,int n2){ //n1 and n2 are local variables.
        System.out.println("In  add Method");
        return n1+n2;
    }
}


public class Demo {
    public static void main(String[] args) {
        int data=10;
        Calculator obj=new Calculator(); //here obj is a reference variable,(new Calculator()) will create a new object
        Calculator obj1=new Calculator();

        int r1=obj.add(1,2);
        System.out.println(obj.num);
        System.out.println(obj1.num);
    
    }
}


//every methods will occupy the stack memory and every object will occupy 
//heap memory
//refer in word file...