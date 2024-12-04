package Exception_handling;

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class Exceptions {
    public static void main(String[] args){
            try {
                throw new MyException("This is my exception");
            } catch (MyException e) {
                // TODO Auto-generated catch block
                System.out.println(e);
                // e.printStackTrace();
            }
        
    }
    
}
