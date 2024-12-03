public class stringbuffer {
    public static void main(String args[]){
        StringBuffer str=new StringBuffer("Athul");//stringbuffer is thread safe..
        str.append(" Robert");
        str.insert(0, "R B ");
        System.out.println(str);
    }
}
