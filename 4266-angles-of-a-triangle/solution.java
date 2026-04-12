class Solution {
    public double[] internalAngles(int[] sides) {
        int n=sides.length;
       
       
         if(n!=3)return new double[0];

         double[] ang=new double[n];
        int a=sides[0];
        int b=sides[1];
        int c=sides[2];
        if(a+b<=c || b+c<=a || c+a<=b)return new double[0];
        double A=(b*b + c*c - a*a)/(2.0*b*c);
        double B=(a*a + c*c - b*b)/(2.0*a*c);
        double C=(b*b + a*a - c*c)/(2.0*b*a);
        ang[0]=Math.toDegrees(Math.acos(A));
        ang[1]=Math.toDegrees(Math.acos(B));
        ang[2]=Math.toDegrees(Math.acos(C));
        Arrays.sort(ang);
        return ang;
    }
}
