package CollectionFolder;

import java.util.*;

public class AllCollections {
    public static void main(String[] args) {
        Map<String,Integer> mp=new TreeMap<String,Integer>();
        mp.put("Athul",21);
        mp.put("Akash",22);
        mp.put("Arshia",16);
        mp.put("Jermin",22);
        
        // System.out.println(mp);
        for(String s:mp.keySet()){
            System.out.println(mp.get(s));
        }
        // List<Integer> arr=new ArrayList<Integer>();
        // arr.add(2);
        // arr.add(1);
        // arr.add(0);
        // arr.add(9);
        // arr.add(6);
        // Comparator<Integer> comp=new Comparator<Integer>() {
        //     public int compare(Integer i,Integer j){
        //         if(i>j)return 1; //1 means when to swap..
        //         return -1;
        //     }
        // };
        // Collections.sort(arr,comp);
        // System.out.println(arr);

        
    }
}
