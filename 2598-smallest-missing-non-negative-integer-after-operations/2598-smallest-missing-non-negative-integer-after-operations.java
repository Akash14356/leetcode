class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int freq[] = new int[value];

        for(int num: nums){
            freq[((num%value)+value)%value]++;
        }

        int mex=0;
        while(true){
            if(freq[mex%value] == 0){
                return mex;
            }
            freq[mex%value]--;
            mex++;
        }
    }
}