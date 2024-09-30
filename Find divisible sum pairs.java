import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int d=sc.nextInt();
        
        while(sc.hasNext()){
            if(sc.hasNextInt())
                list.add(sc.nextInt());
            else
                sc.next();
        }
        
        int count=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if((list.get(i)+list.get(j))%d==0)
                count++;
            }
        }
        
        System.out.println(count);
    }
}
                                                                                                                            
