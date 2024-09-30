import java.util.Scanner;
import java.util.Arrays;
public class Main 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       boolean[] b=new boolean[n];
       ss(b);
       n--;
       while(true){
           if(check(b,n)==true)
           {
               System.out.println(n);
               return;
           }
           else
           {
               n--;
           }
       }
    }
       public static void ss(boolean b[])
       {
           Arrays.fill(b,true);
           b[0]=false;
           b[1]=false;
           
           for(int i=2;i<=Math.sqrt(b.length);i++){
               if(b[i]==true)
               {
                   for(int j=i*i;j<b.length;j=j+i)
                   b[j]=false;
                   
               }
               
           }
           
       }
       public static boolean check(boolean b[],int n){
           while(n!=0){
               if(b[n]==false)
               return false;
               n/=10;
           }
           return true;
       }
}

                                                                                                                            
