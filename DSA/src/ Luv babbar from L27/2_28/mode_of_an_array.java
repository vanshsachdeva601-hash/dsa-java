import java.util.Scanner;
import java.util.HashMap;
public class mode_of_an_array{
    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element: ");
            ar[i] = sc.nextInt();
        }
        return ar;
    }
    public static int getMode(int[] ar){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: ar){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int i: freq.keySet()){
            System.out.println(i+"->"+freq.get(i));
        }
        int maxfreq = -1;
        int maxfreqkey = -1;
        for(int key: freq.keySet()){
            int currkey = key;
            int currkeyfreq = freq.get(key);
            if(currkeyfreq>maxfreq){
                maxfreq = currkeyfreq;
                maxfreqkey = currkey;
            }
        }
        return maxfreqkey;
    }

    public static void main() {
        int[] userArray = input();
        int mode = getMode(userArray);
        System.out.println("The mode is: "+ mode);
    }
}