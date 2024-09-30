import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=1;i<=q;i++)
        {
            int start=sc.nextInt();
            start--;
            int end=sc.nextInt();
            end--;
            int z=sc.nextInt();
            
            for(int j=start;j<=end;j++)
            {
                arr[j]+=z;
            }
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
        }
        
        System.out.println(max);
    }
}
                                                                                                                            
