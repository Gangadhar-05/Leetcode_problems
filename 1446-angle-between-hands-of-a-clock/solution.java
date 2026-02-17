class Solution {
    public double angleClock(int h, int m) {
        double hrAng=0.5*(h*60+m);
        double minAng=m*6;
        double angle=Math.abs(hrAng-minAng);
        return Math.min(angle,360-angle);
    }
}
