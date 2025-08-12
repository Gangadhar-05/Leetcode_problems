// class Solution {
//     static int sum(int a,int b){
//         int sum=0;
//         for(int i=a;i<=b;i++){
//             sum+=i;
//         }
//         return sum;
//     }
//     public int pivotInteger(int n) {
//         if(n==1) return 1;
//         for(int i=2;i<n;i++){
//             if(sum(1,i)==sum(i,n)){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int sq=(int) Math.sqrt(sum);
        if(sq*sq == sum){
            return sq;

        }
        else{
            return -1;
        }
    }
}
