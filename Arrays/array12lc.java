import java.util.Scanner;
public class array12lc {
    /*TWO SUM Given an array of integers nums and an integer target,return indices of the 
    two number such that they add up to target. nums=[2,,11,7,15] target=9 o/p: [0,1]
    */
    public boolean twoSum(int target,int[]nums){
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    System.out.print("Required indices are: "+i+" and "+j +" having values "+
                    nums[i]+" and "+ nums[j]);
                    System.out.println("");
                    found=true; 
                }    
            }
        }
        return found;
    }
    

    public static void main(String[]args){
        array12lc twosum=new array12lc();
        int [] nums={2,11,7,15};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sum of numbers you want to find:");
        int target=sc.nextInt();
        if(twosum.twoSum(target,nums)){
            System.out.println("Found!");
        }
        else{
            System.out.println("Try some another number...");
        }

        

    }

}
