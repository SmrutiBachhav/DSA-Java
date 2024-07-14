
public class array7{
    public static long arrayManipulation(int n, List<List<Integer>> queries) {       
        long [] arr=new long[n+2];
        for(int i =0;i<queries.size();i++){
            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            int k =queries.get(i).get(2);
            arr[a]=arr[a]+k;
            arr[b+1]=arr[b+1]-k;
        }
        long max=0;
        for(int i=1;i<=n;i++){
            arr[i]=arr[i]+arr[i-1];
            max=Math.max(arr[i],max);
        }
        return max;   
        }
    }
    // public static void main(String[]args){
    //     long arr=[[1,2,100],[2,5,100],[3,4,100]];
    //     array7 am=new array7();
    //     System.out.println(am.arrayManipulation(10,arr));
    // }
    
