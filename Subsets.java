class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>>ans=new ArrayList<>();
     int n=nums.length;
     int s=1<<n;
     for(int i=0;i<s;i++)
     {
         ArrayList<Integer>b=new ArrayList<>();
         for(int j=0;j<n;j++)
         {
            if((i&(1<<j))!=0)
            b.add(nums[j]);
         }
         ans.add(b);
     }
    return ans;
    }
}
