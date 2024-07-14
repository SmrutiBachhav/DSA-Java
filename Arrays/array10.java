public class array10 {
    //Resize an Array
    public int[] resize(int[]arr,int capacity){
        int[] temp=new int[capacity];
        for(int i=0; i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }

    public static void main(String[] args){
        array10 resizeArr=new array10();
        int []ogArr= new int[]{1,2,3,4,5};
        System.out.println("Original Array length:"+ ogArr.length);
        ogArr=resizeArr.resize(ogArr,120);
        System.out.println("after resizing:"+ogArr.length);
        
    }
}
