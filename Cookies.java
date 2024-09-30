import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sweetness=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
            {
                list.add(sc.nextInt());
            }
            else
            {
                sc.next();
            }
        }
        int count=0;
        Collections.sort(list);
        while(list.size()>2 && list.get(0)<sweetness)
        {
            int change=list.get(0)+2*list.get(1);
            list.remove(0);
            list.remove(1);
            list.add(change);
            Collections.sort(list);
            count++;
        }
        System.out.println(count);
    }
}
                                                                                                                            
