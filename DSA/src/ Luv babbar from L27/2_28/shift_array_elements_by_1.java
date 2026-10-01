import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class shift_array_elements_by_1 {
    public static void shiftarrayelementsby1(int[] ar){
        int n = ar.length;
        int temp = ar[n-1];
        for(int i = n-1; i>0; i--){
            ar[i] = ar[i-1];
        }
        ar[0] = temp;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element: ");
            array[i] = sc.nextInt();
        }

        shiftarrayelementsby1(array);
        System.out.println("YOUR ARRAY HAS BEEN SHIFTED BY ONE");
        for(int e: array){
            System.out.println(e+" ");
        }
    }
}
