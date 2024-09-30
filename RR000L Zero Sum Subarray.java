import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {   int n=0;
        Scanner sc=new Scanner(System.in);
        try{
         n=sc.nextInt();
        if(n>=1 && n<=10){}
        else
        {
            System.out.println("Array size must be between 1 and 10");
            return;
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if(arr[i]<=10 && arr[i]>=-10)
        {}
        else
        {
            System.out.println("Array elements must be from -10 to 10");
            return;
        }
        }
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=arr[j];
                if(s==0)
                {
                    System.out.println("True");
                    System.out.println(n);
                    return;
                }
            }
        }
        }
        catch(Exception e){
            System.out.println("Array elements must be integers");
        }
            System.out.println("False");
            System.out.println(n);
            return;
    }
}
