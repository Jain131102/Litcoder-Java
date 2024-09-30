import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        doSomething(arr,n);
        
    }
    
    public static void doSomething(int arr[],int k) {
        //Do Something
        float p=0,n=0,z=0;
        for(int i:arr)
        {
            if(i<0)
            n++;
            else if(i>0)
            p++;
            else if(i==0)
            z++;
        }
        p/=k;
        n/=k;
        z/=k;
        System.out.printf("%.3f",p);
        System.out.println();
        System.out.printf("%.3f",n);
        System.out.println();
        System.out.printf("%.3f",z);
        
    }
}
                                                                                                                            
