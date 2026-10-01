import java.util.Scanner;
public class missing_number_from_a_given_range {
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
    public static int missingNum(int[] ar){
        int n = ar.length;
        int expected_sum = (n*(n+1))/2;
        int actual_sum = 0;
        for(int i = 0; i<n; i++){
            actual_sum+=ar[i];
        }
        int missing_num = expected_sum-actual_sum;
        return missing_num;
    }
    public static void main(){
        int[] userArray = input();
        int missing_num = missingNum(userArray);
        System.out.println("Missing number from the series is: "+missing_num);
    }
}
