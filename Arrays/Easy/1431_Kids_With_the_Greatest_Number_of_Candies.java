import java.util.List;
import java.util.ArrayList;
//math already imported hota hai and also false add karna hota hai,and boolean ko .addAll nhi kar sakte
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int Max=0;
        for(int i:candies){
        Max=Math.max(Max,i);}
        ArrayList<Boolean> list = new ArrayList<Boolean>();
            for (int i=0;i<candies.length;i++){
                if((candies[i]+extraCandies)>=Max)list.add(true);
                else list.add(false);  
        }
return list;
    }
}