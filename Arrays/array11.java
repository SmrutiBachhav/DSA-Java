public class array11 {
    //find missing no in an array ex arr=[1,2,3,5] missing no-4
    public int findMissingNo(int[]arr){
        int n=arr.length+1;//missing no is one therefore original length of array with one missing no is arr.length+1
        int sum=n*(n+1)/2;
        for(int num: arr){
            sum=sum-num;
        }
        return sum;
    }
    
    public static void  main(String[] args){
        array11 missingNo=new array11();
        int[] arr={1,2,3,5};
        System.out.println( missingNo.findMissingNo(arr));
    }
}
