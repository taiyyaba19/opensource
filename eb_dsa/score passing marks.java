import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            int[]marks = new int[N];
            for(int i = 0; i < N; i++) {
            marks[i] = sc.nextInt();
        }
        Arrays.sort(marks);
        
        int passingMark = marks[N-X] - 1 ;
        
        System.out.println(passingMark);
        }
        sc.close();
    }
}
