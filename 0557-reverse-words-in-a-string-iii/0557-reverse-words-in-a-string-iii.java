class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            ans.append(revS(arr[i]));

            if (i != arr.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public String revS(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}