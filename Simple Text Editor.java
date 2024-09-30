import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    
    static StringBuilder sb=new StringBuilder();
    static int cursor=0;
    static void insert(String value)
    {
        sb.append(value);
    }
    static void delete(String value)
    {
        int end=value.length();
        int l=sb.length();
        sb.delete(l-end,l-1);
    }
    static char get(int value)
    {
        String str=sb.toString();
        cursor+=value-1;
        return str.charAt(cursor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        StringTokenizer st=new StringTokenizer(sentence,",");
        int n=st.countTokens();
        int keys[]=new int[n];
        String values[]=new String[n];
        int i=0;
        
        while(st.hasMoreTokens())
        {
            String s=st.nextToken();
            StringTokenizer temp=new StringTokenizer(s);
            keys[i]=Integer.parseInt(temp.nextToken());
            if(keys[i]==4)
            {
                values[i]="";
            }
            else
            {
                values[i]=temp.nextToken();
            }
            i++;
        }
        
        for(int j=0;j<n;j++){
            if(keys[j]==1)
            {
                insert(values[j]);
            }
            else if(keys[j]==2)
            {
                delete(values[j]);
            }
            else if(keys[j]==3)
            {
                System.out.println(get(Integer.parseInt(values[j])));
            }
            else if(keys[j]==4)
            {
                int prev=j-1;
                if(keys[prev]==1)
                {
                    insert(values[prev]);
                }
                else if(keys[prev]==2)
                {
                    delete(values[prev]);
                }
                else if(keys[prev]==3)
                {
                    System.out.println(get(Integer.parseInt(values[prev])));
                }
            }
        }
    }
    
}
                                                                                                                            
