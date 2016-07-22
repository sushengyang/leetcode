public class Solution {
    public int countPrimes(int n) {
        if( n <=2) {
            return 0;
        }
        int c= 1;
        boolean isNotPrime[] = new boolean[n+1];
        for(int i=3;i*i<=n;i=i+2) {
            if(isNotPrime[i]) {
                continue;
            }
            for(int j= i*i ;j<=n;j=j+2*i) {
                isNotPrime[j] = true;
            } 
        }
        for(int i =3;i<n;i=i+2){
            if(!isNotPrime[i]) {
                c++;
            }
        }
        return c;
    }
}