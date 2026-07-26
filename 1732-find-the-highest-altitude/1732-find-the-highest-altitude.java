class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int currAltitude = 0;

        for (int g : gain) {
            currAltitude += g;
            highest = Math.max(highest, currAltitude);
        }

        return highest;
    }
}