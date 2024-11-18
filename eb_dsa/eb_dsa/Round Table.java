import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        if (X == 0) {
            System.out.println(1);
        }else{
            
            int ways = 1;
            for (int i = 2; i <= X -1; i++) {
                ways *= i;
            }
            
            ways *= 3;
            System.out.println(ways);
            }
        
         sc.close();
    }
}
