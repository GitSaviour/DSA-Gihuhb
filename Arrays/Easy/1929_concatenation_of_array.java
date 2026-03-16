//5ms wala soln
// import java.util.ArrayList;

// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         ArrayList<Integer> num = new ArrayList<>();
//         for (int i = 0; i < nums.length; i++) {
//             num.add(nums[i]);
//         }
//         ans.addAll(num);
//         ans.addAll(num);
//         int[] answ = new int[ans.size()];
//         for (int i = 0; i < ans.size(); i++) {
//             answ[i] = ans.get(i);
//         }
//         return answ;
//     }
// }


class Solution {
    public int[] getConcatenation(int[] nums) {
int[] ans = new int[(nums.length)*2];
for (int i=0;i<nums.length;i++){
ans[i]=nums[i];
}
for (int i=nums.length;i<ans.length;i++){
    ans[i]=nums[i-nums.length];
}

  return ans;
    }
}