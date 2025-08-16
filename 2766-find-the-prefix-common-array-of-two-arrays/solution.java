class Solution {
   static int ccnt(int a,int num1[],int num2[]){
    int cnt=0;
    for(int i=0;i<=a;i++){
        for(int j=0;j<=a;j++){
            if(num1[i]==num2[j]){
                cnt++;
            }
        }
    }
        return cnt;

   }
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr=new int[A.length];
        for(int i=0;i<A.length;i++){
            arr[i]=ccnt(i,A,B);
        }
        return arr;
    }
}
