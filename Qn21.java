class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
     for(int i=0;i<nums.length;i++){
        if(nums[i]<10)
        {
            result=result+nums[i];
        }
     
           else{
               while(nums[i]>0){
               int a=nums[i]%10;
                result=result+a;
                nums[i]=nums[i]/10;
            }
        }
     }
    int b=sum-result;
    return b;
    }
}
