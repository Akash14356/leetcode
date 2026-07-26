class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int currAltitude =0;

        for(int i = 0; i<gain.length;i++){
            currAltitude+=gain[i];
            highest = currAltitude > highest ? currAltitude : highest;
        }
        return highest;
    }

}