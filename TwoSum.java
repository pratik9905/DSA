
import java.util.*;

public class TwoSum {
    
    public static void main(String[] args) {
        int target=9;
        int[] arr ={2,7,11,15};
        int[] num =twoSum(arr,target);
        for (int elem : num) {
            System.out.print(elem+" ");
        }
    }
    
    public static int[] twoSum(int[] arr, int target){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compl = target-arr[i];
            if(mp.containsKey(compl)){
                return new int[] {mp.get(compl),i};
            }
            mp.put(arr[i], i);
        }

        return new int[] {-1,-1};
    }
}
