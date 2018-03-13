public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null) {
            return result;
        }
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(hashMap.containsKey(sum)) {
                result.add(hashMap.get(sum) + 1);
                result.add(i);
                return result;
            } else {
                hashMap.put(sum, i);
            }
        }
        return result;
    }
}
