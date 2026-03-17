//1ms
class Solution {
    public int largestAltitude(int[] gain) {
        int heigth = 0;
        int max = 0;

        for (int g: gain) {
            heigth += g;
            max = Math.max(max, heigth);
        }

        return max;
    }
}



//2ms
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n + 1];
        alt[0] = 0;
        for (int i = 1; i <= n; i++) {
            alt[i] = alt[i - 1] + gain[i - 1];
        }
        java.util.OptionalInt max=java.util.Arrays.stream(alt).max();
        return(max.getAsInt());
    }
}

//5ms
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n + 1];
        alt[0] = 0;
        for (int i = 1; i <= n; i++) {
            alt[i] = alt[i - 1] + gain[i - 1];
        }
        java.util.Arrays.sort(alt);
        return(alt[n]);
    }
}