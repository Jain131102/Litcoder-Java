import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();//hrs
        int b = input.nextInt();//devices
        doSomething(a,b);        
    }
    
    public static void doSomething(int hours, int devices) {
        //Do Something
        if(hours<4)
        {
            System.out.println("Invalid Input");
            return;
        }
        int tested=(int)Math.floor(hours/4);
        int rem=devices-tested;
        if(tested>devices)
        {rem=0;
        tested=devices;
        }
        System.out.println(tested);
        System.out.println(rem);
    }
}
                                                                                                                            
