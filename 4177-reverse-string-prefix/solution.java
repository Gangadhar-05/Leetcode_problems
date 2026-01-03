class Solution {
    public String reversePrefix(String s, int k) {
        if(k==1)return s;
        char arr[]=s.toCharArray();
        int i=0;
        int j=k-1;
        while(i<j){
             char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String res=new String(arr);
        return res;
    }
}
