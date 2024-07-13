//LEFT ROTATION

import java.util.ArrayList;

public class arrays3 {
    public static void main (String[]args){
        
         int d1=4;
         int temp1;
         int arr1[]={1,2,3,4,5};
         int l=arr1.length;
         for(int k=0;k<d1;k++){
             temp1=arr1[0];           
             for(int i=0;i<l-1;i++){           
                arr1[i]=arr1[i+1];                                                                    
             }
             arr1[4]=temp1;            
         }   
         for(int j=0;j<arr1.length;j++){             
             System.out.print(arr1[j]+" ");
        }
        System.out.println();

//for rotating an array  by d places


        int arr[]={1,2,3,4,5};
        int d=4;
        int n=arr.length;
       //Storing d elements in temp array        
        int [] temp=new int[d];     
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }             
       //Shifting remaining elements of array
        for(int j=d;j<n;j++){
            arr[j-d]=arr[j];            
        }
      //Storing temp array elements in arr        
        for(int k=n-d;k<n;k++){
            arr[k]=temp[k-(n-d)];
        }
       //Printing array 
        for(int m=0;m<arr.length;m++){
            System.out.print(arr[m]+ " ");
        }




        ArrayList<Integer> al1= new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);
        int [] temp2=new int[d];     
        for(int i=0;i<temp2.length;i++){
            temp2[i]=al1.get(i);
        }             
       //Shifting remaining elements of array
        for(int j=d;j<n;j++){
            al1.set(j-d,j);
            //al1.get(j-d)=al1.get(j);            
        }
      //Storing temp array elements in arr        
        for(int k=n-d;k<n;k++){
            al1.set(k,temp[k-(n-d)]);
            //arr[k]=temp[k-(n-d)];
        }
       //Printing array 
        for(int m=0;m<al1.size();m++){
            System.out.print(al1.get(m)+ " ");
        }
        
    }     
}
