package IntegerArray;

import java.util.HashMap;
import java.util.Map;

public class IntegerArray {
    public static void main(String[] args) {
        int[] nums = {1,5,9,1,5,9};
        int k = 2;
        int t = 3;
        System.out.print("Input: nums = [");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.print("], k = " + k + ", t = " + t);
        System.out.println();
        System.out.println("Output: " + bucketSort(nums,k,t));
    }

    public static boolean bucketSort(int[] nums, int k, int t){
        int n = nums.length;
        if (n<=1)
            return false;
        if (t<0)
            return false;//Difference must be absolute, so t can't be < 0

        long bucketSize = (long)t+1;//add the one to avoid dividing by zero when generating a bucket ID number

        Map<Long,Long> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            long bucketId = getBucketId((long)nums[i],bucketSize);

            //Buckets are sized to hold just enough numbers to always satisfy the "ABS(nums[i] - nums[j] <= t" (absolute difference) condition
            //If a number ends up in an already existing bucket, then we know the absolute difference condition is met.
            if (map.containsKey(bucketId))
                return true;

            //Its possible the absolute difference condition is true for adjacent buckets.

            //If a bucket exist to the left of the current bucket...
            if (map.containsKey(bucketId-1l)) {
                if (Math.abs(map.get(bucketId - 1) - nums[i]) < bucketSize)
                    return true;
            }

            //If a bucket exists to the right of the current bucket...
            if (map.containsKey(bucketId+1l)){
                if (Math.abs(map.get(bucketId+1)-nums[i])<bucketSize)
                return true;
            }

            //Add the current bucket to the map
            map.put(bucketId,(long)nums[i]);

            //To satisfy the condition of "absolute difference between i and j is at most k", remove the bucket that was
            //  created k iterations ago.
            if (i-k >= 0){
                long oldBucketId = getBucketId((long)nums[i-k],bucketSize);
                map.remove(oldBucketId);
            }
        }
        return false;
    }
    //Generate a bucket ID. The equations used will generate a single ID number for all numbers that belong in the same bucket.
    //  Numbers that are within the proximity of "t" will end up in the same bucket. (AKA [0 thru t] will be in bucket 1, t+1 thru 2t will be
    //  in bucket 2, etc)
    static private long getBucketId(long val, long width){
        return val < 0 ? (val+1l)/width-1l : val/width;//Add the +1 and -1 to shift the bucket numbers up one when dealing with negative numbers, otherwise -1 will be in its own bucket
    }
}
