public class array5 {
    
    //to find minimum value in array

    public int findMin(int[] arr){
        int  min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
//to find maximum value in array
    public int findMax(int[] arr){
        int  max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[]args){
         int[]arr={5,93,15,1,2};
         array5 ma=new array5();
         System.out.println(ma.findMin(arr));
         System.out.println(ma.findMax(arr));
    }  
}
