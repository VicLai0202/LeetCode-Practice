class Problem_009_PalindromeNumber {
    public int reverse(int x){
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            
            // 检查是否会溢出
            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;
    }

    public boolean isPalindrome(int x) {
        // 先检查特殊情况（负数和末尾为0的数）
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        // 再进行反转和比较
        int reversed = reverse(x);
        return reversed == x;
    }
}