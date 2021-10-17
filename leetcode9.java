class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String a = x + "";
        int length = a.length();
        length /= 2;
        String sub1 = "";
        String sub2 = "";
        if (a.length() %2 == 0) {
            sub1 = a.substring(0,length);
            sub2 = a.substring(length);

        } else if (a.length() %2 != 0) {
            sub1 = a.substring(0,length+1);
            sub2 = a.substring(length);

        }
        String sub3 = "";
        for (int i = sub2.length(); i > 0; i--) {
            sub3 += sub2.charAt(i-1);
        }
        int n1 = Integer.parseInt(sub1);
        int n2 = Integer.parseInt(sub3);

        return n1==n2;
    }
}
