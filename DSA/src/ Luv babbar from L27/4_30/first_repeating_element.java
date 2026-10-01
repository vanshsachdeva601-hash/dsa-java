import java.util.HashMap;

public class first_repeating_element {
    public static int FirstRepeatingElement(int[] ar){
        int n = ar.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(ar[i]==ar[j]){
                    return ar[i];
                }
            }
        }
        return -1;
    }
    public static int FirstRepeatingElementUsingHashMap(int[] ar){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: ar){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        for(int i: ar){
            if(freq.get(i)>1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] ar = {1,2,3,4,3,4,5,6};
        int firstrepeat = FirstRepeatingElement(ar);
        System.out.println(firstrepeat);
        int firstrepeat2 = FirstRepeatingElementUsingHashMap(ar);
        System.out.println(firstrepeat2);
    }
}
