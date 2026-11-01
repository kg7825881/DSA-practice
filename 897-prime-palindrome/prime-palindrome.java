class Solution {
    public boolean isPrime(int a){
        if(a <= 1){
            return false;
        }
        if(a <= 3){
            return true;
        }

        if(a % 2 == 0 || a % 3 == 0){
            return false;
        }

        int i = 5;
        while(i*i <= a){
            if(a % i == 0 || a % (i + 2) == 0){
                return false;
            }
            i += 6;
        }

        return true;
    }

    public boolean isPalindrome(int x) {
        if(x <= 9){
            return true;
        }
        int num = x;
        int rev = 0;
        while(num != 0){
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }

        return rev == x;
    }
    public int primePalindrome(int n) {
        int x = n;
        while(x >= n){
            if(isPalindrome(x) && isPrime(x)){
                return x;
            }
            ++x;

            if(11 < x && x <= 99){
                x = 100;
            } else if(1000 <= x && x <= 9999){
                x = 10000;
            } else if(100000 <= x && x <= 999999) {
                x = 1000000;
            } else if(10000000 <= x && x <= 99999999){
                x = 100000000;
            }
        }
        return 0;
    }
}