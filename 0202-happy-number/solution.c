// bool isHappy(int n) {  
//     int sum=0;
//     while(n>=0){
//        int ls=n%10;
//        sum=sum+(ls*ls);
//        n/=10;
//     }
//     if(sum==1){
//         return true;
//     }else{
//         return false;
//     }}

bool isHappy(int n) {
    
     int temp, con;
    while (n != 1 && n != 4) {
        con = 0;
        while (n > 0) {
            temp = n % 10;
            con += temp * temp;
            n = n / 10;
        }
        n = con;
    }

    return n == 1;
    
    
}
