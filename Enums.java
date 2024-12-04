enum Status{
    Success(200),Failed(404),Running,Pending;
    private int statusCode;

    Status() {

    }

    Status(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    




    
}

public class Enums {
    public static void main(String[] args) {
        System.out.println(Status.Running);
        Status s=Status.Failed;
        System.out.println(s.getStatusCode());;
    }
}
