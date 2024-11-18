import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
       
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i< N; i++) {
            int elements = sc.nextInt();
            set.add(elements);
        }
        
        if(set.contains(X)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
        }
    }
