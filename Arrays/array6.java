//package Arrays;
//to find second maximum value from an array
public class array6 {
    public int find2ndMax(int[]arr){
        int max=Integer.MIN_VALUE;
        int max2nd=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2nd=max;
                max=arr[i];
            }
            else{
                if(arr[i]>max2nd && arr[i]!=max){
                    max2nd=arr[i];
                }
            }
        }
        return max2nd;
    }

    public static void main(String[] args){
        int []arr={13,34,2,34,33,1};
        array6 smax=new array6();
        System.out.println(smax.find2ndMax(arr));
    }
}
