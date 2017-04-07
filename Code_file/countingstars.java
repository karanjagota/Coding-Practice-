// counting stars .. in java
// @ Author Karan Jagota
import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int z=0;z<t;z++){
            int n=s.nextInt();
            int k=s.nextInt();
            int mod=1000000007;
            
            long morethan1=1;
            int tempk=k;
            for(int i=n+k-1;tempk>0;i--,tempk--){
                morethan1=(morethan1*i)%mod;
            }
            for(int j=k;j>0;j--){
                morethan1=(morethan1*inverse(j,mod))%mod;
            }
            
            long onlyonce=1;
            tempk=k;
            for(int i=n;tempk>0;i--,tempk--){
                onlyonce=(onlyonce*i)%mod;
            }
            for(int j=k;j>0;j--){
                onlyonce=(onlyonce*inverse(j,mod))%mod;
            }
            
            long p=(morethan1-onlyonce)+mod;
            long q=morethan1;
            if(q%mod!=0){
                long ans=(p*inverse(q,mod))%mod;
                System.out.println(ans);
            }
            else{
                System.out.println(p/q);
            }
        }
    }
    static long inverse(long n,long mod){
        return power(n,mod-2,mod);
    }
    static long power(long n,long p,long mod){
        long result=1;
        while(p>0){
            if(p%2==1)result=(result*n)%mod;
            n=(n*n)%mod;
            p=p/2;
        }
        return result;
    }
}