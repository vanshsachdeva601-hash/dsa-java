import java.util.Scanner;
public class max_element_in_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element: ");
            ar[i] = sc.nextInt();
        }
        int max = ar[0];
        for(int i = 0; i<n; i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        System.out.println("MAXIMUM ELEMENT IS : "+ max);
    }
}
