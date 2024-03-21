class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int p1 = 0, p2 = s.length() - 1;
        s = s.toLowerCase();
        while (p1 < p2) {
            char ch1 = s.charAt(p1);
            char ch2 = s.charAt(p2);
            if (!Character.isLetterOrDigit(ch1)) {
                p1++;
                continue;
            }
            if (!Character.isLetterOrDigit(ch2)) {
                p2--;
                continue;
            }
            if (ch1 != ch2)
                return false;
            p1++;
            p2--;
        }
        return true;
    }
}
