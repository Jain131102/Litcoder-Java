import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String start=sc.next();
        String end=sc.next();
        
        if(start.length()!=end.length())
        {
            System.out.println("false");
            return;
        }
        
        int flag=1;
        for(int i=0;i<start.length()-1;i++)
        {
            char s1=start.charAt(i);
            char s2=start.charAt(i+1);
            char e1=end.charAt(i);
            char e2=end.charAt(i+1);
            
            if((s1==e2 && s2==e1)||(s1==e1 && s2==e2))
            {
                i++;
            }
            else if(s1==e1 && s2!=e2)
            {
                
            }
            else
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
}
                                                                                                                            
