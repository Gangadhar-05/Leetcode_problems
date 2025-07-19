// class Solution {
//     public int countOdds(int low, int high) {
//         int cnt=0;
//         if (low%2==0){
//         for(int i=low+1;i<=high;i+=2){
//             cnt++;
//         }
//         }else{
//             for(int i=low;i<=high;i+=2){
//             cnt++;
//         }
//         }
//         return cnt;
//     }
// }
class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0 && high%2==0)
        {
            return(high-low)/2;
        }
        return((high-low)/2)+1;
    }
}

