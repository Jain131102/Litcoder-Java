import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> c=new ArrayList<>();
        ArrayList<Integer> d=new ArrayList<>();
        
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
            {
                c.add(sc.nextInt());
            }
            else
            {
                sc.next();
            }
        }
        
        for(int i=c.size()/2;i<c.size();i++)
        {
            d.add(c.get(i));
        }
        
        for(int i=0;i<d.size();i++)
        {
            c.remove(c.size()-1);
        }
        
        int a=0,b=0;
        
        for(int i=0;i<c.size();i++){
            if(c.get(i)>d.get(i))
            a++;
            else if(c.get(i)<d.get(i))
            b++;
        }
        
        System.out.println(a+" "+b);
    }
}
                                                                                                                            
