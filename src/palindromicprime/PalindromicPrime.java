package palindromicprime;
public class PalindromicPrime {

    public static void main(String[] args) {
        System.out.print(isPrime(11));
        System.out.print(isPalindrome(919));
       palindromicPrime(12000);
        
    }//end of main
public static void twinPrime(int uppperBound){
    
}
public static void palindromicPrime(int upperBound){
    int j = 0;
    for(int i = 1; i <= upperBound; i++){
        if(isPalindromicPrime(i)){
            if (j % 10 == 0){System.out.println();}
            System.out.printf("%10d",i);
            j++;
        }
    }
}
public static boolean isPalindromicPrime(int n){
    return (isPrime(n) && isPalindrome(n))? true:false;
}   
public static boolean isPrime(int n ){
        for (int j = 2;j < n;j++){
            if(n%j == 0)
                return false;
        }
        return true;
    }//end of isPrime
public static boolean isPalindrome(int n){
    int t = n;
    int i = 0;
    while(n > 0){
        i *= 10;
        i += n%10;
        n /= 10;
    }
    return (i == t )? true:false;
}//end of isPalindrome

}

