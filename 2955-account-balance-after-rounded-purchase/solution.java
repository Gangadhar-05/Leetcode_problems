class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount;
        int digit;
        if(purchaseAmount<10){digit=purchaseAmount;}
        else {
            digit=purchaseAmount%10;
        }
        int p=purchaseAmount;
        if(digit<5){
         roundedAmount=purchaseAmount-(digit);
        }else{
         roundedAmount=purchaseAmount+(10-digit);
        }
        return 100-roundedAmount;
    }
}
