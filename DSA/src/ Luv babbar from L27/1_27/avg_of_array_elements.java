import java.util.Scanner;
public class avg_of_array_elements {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i <n; i++){
            System.out.println("Enter element: ");
            ar[i] = sc.nextInt();
        }
        int sum = 0;
        for(int e: ar){
            sum+=e;
        }
        float avg = sum/n;
        System.out.println("Average of elements is : " +avg);
    }
}
