import java.util.Scanner;
import java.util.*;

public class SieveOfEratosthenes {

    public static List<Integer> sieve(int n) {
        int[] arr = new int[n+1];
        for(int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        for(int j = 2; j <= Math.floor(Math.sqrt(n)); j++) {
            if(arr[j] != 0) {
                int k = j * j;
                while(k <= n) {
                    arr[k] = 0;
                    k = k + j;
                }
            }
        }
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(arr[i] != 0) {
                list.add(arr[i]);
                idx = idx + 1;
            }
        }

        return list;
    }


    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list = sieve(25);
        System.out.println(list.toString());
    }
    
}


