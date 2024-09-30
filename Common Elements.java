import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        while(sc.hasNext())
        {
            if(sc.hasNextInt()){
                int x=sc.nextInt();
                if(map.containsKey(x))
                {
                    map.put(x,map.get(x)+1);
                }
                else
                {
                    map.put(x,1);
                }
                if(map.get(x)==3)
                ans.add(x);
            }
            else
            {
                sc.next();
            }
        }
        
        if(ans.size()==0)
        {
            System.out.println("No Elements");
            return;
        }
        
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}
                                                                                                                            
