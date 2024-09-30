import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=0;
        try{
        n=sc.nextInt();
            if((""+n).length()<4)
            {
                System.out.println("Provided input is less than 4,enter four digit intgeers");
                return;
            }
            else if((""+n).length()>4)
            {
                System.out.println("Provided input is more than 4,enter four digit integer");
                return;
            }
            
            String str=""+n,result="";
            for(int i=0;i<str.length();i++){
                int number=Integer.parseInt(""+str.charAt(i));//gets the digit
                number=(number+5)%10;
                result+=number;
            }
            char first=result.charAt(0);
            char sec=result.charAt(1);
            char third=result.charAt(2);
            char fourth=result.charAt(3);
            // result="";
            String ans=""+third+fourth+first+sec;
            System.out.println(ans);
        }
        catch(Exception e){
            System.out.println("Enter only integer value");
            return;
        }
    }
}
                                                                
