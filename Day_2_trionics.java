class Day_2_trionics{
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2,6};
        int[] arr2 = {2,1,3};
        System.out.print(isTrionic(arr)?"Array is Trionic" : "Array Is Not Trionic");
    }
    public static boolean isTrionic(int[] nums) {

        if (nums == null || nums.length < 4) {
            return false;
        }
        int n = nums.length;
        int i=0;
        
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        if(i==0 || i>=n-2){
            return false;
        }
        int p=i;
        while(i+1<n && nums[i]>nums[i+1]){
            i++;
        }
        if(i==p || i>=n-1){
            return false;
        }
        while(i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        return i==n-1;
    }


}