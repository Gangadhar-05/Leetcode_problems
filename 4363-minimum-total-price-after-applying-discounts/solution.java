class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double price=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n=prices.length;
        int m=discounts.length;
        int j=n-1;
        for(int i=m-1;i>=0;i--){
            if(j<0)break;
            price+=((prices[j--])*(100-discounts[i]))/100.0;
            
        }
        if(j>=0){
            for(int i=0;i<=j;i++){
                price+=prices[i];
            }
        }
        return price;
    }
}
