import java.util.Scanner;
public class sum_of_positive_and_negative_numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element: ");
            ar[i] = sc.nextInt();
        }
        int sump =0;
        int sumn = 0;
        for(int i = 0; i<n; i++){
            if(ar[i]>0){
                sump+=ar[i];
            }
            else if(ar[i]<=0){
                sumn+=ar[i];
            }

        }
        System.out.println("SUM OF POSITIVE NUMBERS: "+sump);
        System.out.println("SUM OF NEGATIVE NUMBERS: " + sumn);
    }
}
