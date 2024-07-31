
public class array13lc {
    public static void main(String[]args){
        int [] nums={1,1,2};
        int [] res;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    res[i]=nums[j];
                    //nums[j]=nums[j+1];
                }
            }
        } 
        
        for(int k=0;k<res.length;k++){
            System.out.println(res[k]);
        }
    }

}
