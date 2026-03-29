class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        for(int i=0;i<2;i++){
            int j=i+2;
            if(a[i]!=b[i] && a[i]==b[j]){
                 char temp = a[i];
                 a[i] = a[j];
                a[j] = temp;
            }

        }
       
       

        String swapped = new String(a);

        return swapped.equals(s2);
    }
}
