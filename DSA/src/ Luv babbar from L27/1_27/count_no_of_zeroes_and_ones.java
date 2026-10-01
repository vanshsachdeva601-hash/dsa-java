import java.util.Scanner;
public class count_no_of_zeroes_and_ones {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i <n; i++){
            System.out.println("Enter element: ");
            ar[i] = sc.nextInt();
        }
        int zc = 0;
        int oc = 0;
        for(int i = 0; i<n; i++){
            if(ar[i]==0)
                zc++;
            else if(ar[i]==1)
                oc++;
        }
        System.out.println("NUMBER OF ZEROES: " + zc);
        System.out.println("NUMBER OF ONES: "+oc);
    }
}
