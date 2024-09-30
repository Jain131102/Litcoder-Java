import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]=new int[6];
        
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        String res="";
        
        for(int i=0;i<6;i++)
        {
            int number=arr[i];
            while(number>=10){
                int sum=0;
                while(number!=0)
                {
                    int d=number%10;
                    sum+=d;
                    number/=10;
                }
                number=sum;
            }
            if(number%2==0)
            res+=number;
            else
            res+=(char)(96+number);
        }
        System.out.println(res);
    }
}
                                                                                                                            
