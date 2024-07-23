import java.util.ArrayList;
import java.util.Scanner;
public class array12lc {
    /*TWO SUM Given an array of integers nums and an integer target,return indices of the 
    two number such that they add up to target. nums=[2,,11,7,15] target=9 o/p: [0,1]
    */
    public int[] twoSum(int target,int[]nums){
        //boolean found=false;
        int [] res=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    res[0]=i;
                    res[1]=j;
                    System.out.println(i);
                    System.out.println(j);
                    
                    //System.out.print("Required indices are: "+i+" and "+j +" having values "+
                    //nums[i]+" and "+ nums[j]);      
                    //ts[idx]=nums[ind1];
                    //ts[idx+1]=nums[ind2];            
                    //System.out.println("Found");
                    //System.out.println(twosum);
                    //System.out.println(ts);
                    //found=true; 
                    //System.out.println("Hi");
                }    
            }
        }
        return res;
    }
    
    public static void main(String[]args){
        array12lc twosum=new array12lc();
        int [] nums={2,11,7,15};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sum of numbers you want to find:");
        int target=sc.nextInt();
        //twosum.twoSum(target,nums);
        twosum.twoSum(target,nums);
        // if(twosum.twoSum(target,nums)){
        //     System.out.println("Found!");
        // }
        // else{
        //     System.out.println("Try some another number...");
        // }

        

    }

}
