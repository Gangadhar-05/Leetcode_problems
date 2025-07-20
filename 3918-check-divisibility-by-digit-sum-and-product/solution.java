// class Solution {
//     public boolean checkDivisibility(int n) {
//         int num=n;
//         int sum=0;
//        int  pro=1;
//         while(n>0){
//             int ld=n%10;
//             sum+=ld;
//             pro*=ld;
//             n/=10;
//         }
//         return(sum != 0 && num % sum == 0) || (pro != 0 && num % pro == 0); 
//     }
// }
class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        int total = sum + product;
        return num % total == 0;
    }
}

