class Solution {
    public boolean sd(int n){
        int num=n;
        int a=0;
        int b=0;
        while(n!=0){
            int ls=n%10;
            a++;
            if( ls!=0 && num%ls==0){
                b++;
            }
            n/=10;
        }
        return a==b;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(sd(i)){
                list.add(i);
            }
        }
        return list;
    }
}
