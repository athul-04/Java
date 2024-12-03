public class Arrays {
    public static void main(String[] args) {
        
        int[] arr= new int[3]; 
        for(int ele:arr)System.err.println(ele);

        int arr1[][]=new int[2][2]; //multi-dimensional arrays
        for(int[] a :arr1){
            for(int ele:a)System.err.println(ele);
        }

        int[][] arr2=new int[2][];//Jagged Arrays .we can not specify the column odf the array..
        arr2[0]=new int[2]; //we can declare it after wards..

    }
}
