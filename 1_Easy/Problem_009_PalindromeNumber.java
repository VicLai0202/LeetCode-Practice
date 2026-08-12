class Problem_009_PalindromeNumber {
    public int reverse(int x){
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            
            // check for overflow before multiplying by 10 and adding the digit
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
        // Handle negative numbers and numbers ending with 0 (except for 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        // Reverse the number and check if it is equal to the original number
        int reversed = reverse(x);
        return reversed == x;
    }
}