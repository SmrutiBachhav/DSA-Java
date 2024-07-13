//2d Array HR DSA que 2 REVERSE AN ARRAY
class arrays1{
    public static void main (String[]args){
        int []arr={1,4,3,2};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;           
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }


}