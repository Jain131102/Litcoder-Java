import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {   
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        try{
         while (sc.hasNext()) {
                if (sc.hasNextInt())
                    arr.add(sc.nextInt());
                else
                    sc.next();
            }

            int n = arr.size();
        
            if (n < 1 || n > 10) {
                System.out.println("Array size must be between 1 and 10");
                return;
            }
        
            for (int i = 0; i < n; i++) {
                int element = arr.get(i);
                if (element < -10 || element > 10) {
                    System.out.println("Array elements must be from -10 to 10");
                    return;
                }
            }
        
            for (int i = 0; i < n; i++) {
                int s = 0;
                for (int j = i; j < n; j++) {
                    s += arr.get(j);
                    if (s == 0) {
                        System.out.println("True");
                        return;
                    }
                }
            }
        }
                
            catch (Exception e) {
            System.out.println("Array elements must be integers");
        }
        
        System.out.println("False");
        System.out.println(arr.size());
    }
}
