public class array5 {
    
    //to find mainium value in array

    public int findMin(int[] arr){
        int  min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[]args){
         int[]arr={5,93,15,1,2};
         array5 ma=new array5();
         System.out.println(ma.findMin(arr));
    }  
}
