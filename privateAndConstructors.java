class Mobile{
    String brand;
    int price;

    Mobile(){ //default constructor

    }

    public Mobile(String brand, int price) { //Parametrized Contructor
        this.brand = brand;
        this.price = price;
    }

    public Mobile(Mobile obj){  //copy constructor
        this.brand=obj.getBrand();
        this.price=obj.getPrice();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}


public class privateAndConstructors {
    public static void main(String[] args) {
        
    }
}
