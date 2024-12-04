class Laptop{
    String name;
    int price;

    @Override //before this it will print a hex value
    public String toString(){
        return "name: "+this.name+" , price :"+this.price;
    }


    public boolean equals(Laptop obj){
        return this.name.equals(obj.name) && this.price==obj.price;
    }



}


public class tostringAndEquals {
    public static void main(String[] args) {

        Laptop a=new Laptop();
        a.name="Lenovo";
        a.price=1000;

        Laptop b= new Laptop();
        b.name="Lenovo";
        b.price=1000;

        System.out.println(a);
        System.out.println(a.equals(b));
        
    }
}
