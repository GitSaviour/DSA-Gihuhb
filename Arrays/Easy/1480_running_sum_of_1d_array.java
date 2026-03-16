// worst
// class Solution {
//     public int[] runningSum(int[] nums) {
//         int n= nums.length;
//         int[] res = new int[n];
//         for(int i =0 ;i<n;i++){
//             int sum=0;
//             for (int j=0;j<=i;j++){
//                 sum = sum + nums[j];
//             }
//             res[i]=sum;
//         }

//         return res;
//     }
// }


//best
//class Solution {
    // public int[] runningSum(int[] nums) {

    //     for(int i=1;i<nums.length;i++){
    //         nums[i]=nums[i-1]+nums[i];

    //     }
    //     return nums;
    // }
// }