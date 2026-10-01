import java.util.Scanner;
public class multiply_each_element_of_array_by_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0 ; i<n; i++){
            System.out.println("Enter element: ");
            ar[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            ar[i] = ar[i]*10;
        }
        System.out.println("EVERY ELEMENT IS MULTIPLIED BY 10");
        System.out.println("NEW ARRAY IS AS FOLLOWS ");
        for(int e: ar){
            System.out.println(e);
        }
    }
}
