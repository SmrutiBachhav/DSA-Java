package Arrays;
import java.util.ArrayList;
//import java.util.Array;

public class array4 {
    public static void main(String[]args){
        //ArrayList<Integer> al1= new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<>();              
        ArrayList<String> queries= new ArrayList<String>();
        ArrayList<Integer> arrl= new ArrayList<Integer>();
        stringList.add("aba");
        stringList.add("baba");
        stringList.add("aba");
        stringList.add("xzxb");
        System.out.println(stringList);
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        System.out.println(queries);
        //int l=0;
        for(int i=0;i<queries.size();i++){
            int l=0;
            for (int j=0;j<stringList.size();j++){
                if (queries.get(i)==stringList.get(j)){
                    l+=1;
                }
            }
            arrl.add(l);
        }
        //converting arrayList to array
        Integer[] arr=new Integer[arrl.size()];
        arr=arrl.toArray(arr);
        //System.out.println(arrl);       
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }    
}
