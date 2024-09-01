class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> s=new ArrayList<>();
        if(nums==null||nums.length==0)
        {
            return s;
        }
        Map<Integer,Integer> s1=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            s1.put(nums[i],i);
        }
        Set<String> s2=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int y=nums[i]+nums[j];
                if(s1.containsKey(-1*y))
                {
                    int k=s1.get(-1*y);
                    if(!s2.contains(nums[i]+":"+nums[j]+":"+nums[k])&& k>i&& k>j)
                    {
                        s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        s2.add(nums[i]+":"+nums[j]+":"+nums[k]);
                    }
                }
                
            }
        }
        return s;
        
    }
}



/*Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.*/

//link https://leetcode.com/problems/3sum/