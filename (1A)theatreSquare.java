 
package codeforce;
import java.util.Scanner;
 
public class theatreSquare {
    
    public static void main(String[] args) {
        
        int n,m,a;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        m=input.nextInt();
        a=input.nextInt();
        int tmp=n;
        int count1=0;
        while(tmp>0){
            tmp-=a;
            count1++;
        }
          tmp =m;
        int count2=0;
        while(tmp>0){
            tmp-=a;
            count2++;
        }
        System.out.println((long)count1*count2);
    }
    
}
