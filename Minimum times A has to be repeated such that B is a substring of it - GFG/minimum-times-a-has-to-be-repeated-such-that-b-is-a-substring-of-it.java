// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        String t="";
        for(int i=0;i<1000;i++){
            if(t.contains(B)){
                return i;
            }else{
                t=t+A;
            }
        }
        return -1;
    }
};