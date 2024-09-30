import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        TreeMap<Integer,Integer> map=new TreeMap<>();
        ArrayList<Integer> set=new ArrayList<>();
        
        while(sc.hasNext()){
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
            }
            else
            {
                sc.next();
            }
        }
        
        
        for(int i:map.keySet())
        {
            set.add(i);
        }
        
        for(int i=0;i<set.size()-1;i++){
            if(map.get(set.get(i))>=map.get(set.get(i+1)))
            {
                System.out.println(set.get(i));
                return;
            }
        }
        
    }
}
                                                                                                                            
