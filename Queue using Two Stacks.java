import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main
{
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    
    static void enqueue(int value){
        s1.push(value);
    }
    static void dequeue(){
        if(s1.isEmpty())
        {
          System.out.println("Queue is Empty");
          return;
        }
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s2.pop();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    static int front(){
        if(s1.isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        int y=s2.peek();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        return y;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        
        StringTokenizer st=new StringTokenizer(input,",");
        while(st.hasMoreTokens())
        {
            String str=st.nextToken();
            StringTokenizer temp=new StringTokenizer(str);
            int operation=Integer.parseInt(temp.nextToken());
            if(operation==1)
            {
                int value=Integer.parseInt(temp.nextToken());
                enqueue(value);
            }
            else if(operation==2)
            {
                dequeue();
            }
            else if(operation==3)
            {
                System.out.println(front());
            }
        }
    }
}
                                                                                                                            
