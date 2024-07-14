public class array9 {
    //Moving zeroes to end of the array without changing the order of non-zero elts
    public void moveZeroes(int[] arr ,int n){
        int j=0;//focus on zeroth elt
        for(int i=0; i<n;i++){//i will f ocus on non-zero elt
            if (arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }

    public static void main(String[]args){
        array9 zatend=new array9();
        int[] arr={8,1,0,2,1,0,3};
        int n=arr.length;
        zatend.moveZeroes(arr, arr.length);
        // Print the array after moving zeroes
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
