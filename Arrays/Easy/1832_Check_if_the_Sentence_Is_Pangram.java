
//1ms
class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(s.indexOf(ch)<0)  return false;
        }
        return true;
    }
}


//3ms
import java.util.HashSet;
class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] a= sentence.toCharArray();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add((int)a[i]);
        }
        return(set.size()==26);
  }
}