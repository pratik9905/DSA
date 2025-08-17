public class Day_2_trionics2 {
    public static void main(String[] args) {
        int[] nums={1,4,8,9};
        System.out.println(isTrionic(nums)?"true":"False");
    }
        public static boolean isTrionic(int[] nums) {
            int n=nums.length;
            for(int p=1;p<n-2;p++){
                for(int q=p+1;q<n-1;q++){
                    if(isIncrease(nums,0,p) && isDecrease(nums,p,q) 
                    && isIncrease(nums,q,n-1)){
                        return true;
                    }
                }
            }
            return false;
        }
    
        public static boolean isIncrease(int[] nums,int zro,int p){
            for(int i=zro;i<p;i++){
                if(nums[i]>=nums[i+1]){
                    return false;
                }
            }
            return true;
        }
        public static boolean isDecrease(int[] nums,int p,int q){
            for(int i=p;i<q;i++){
                if(nums[i]<=nums[i+1]){
                    return false;
                }
            }
            return true;
        }
    
        
}
