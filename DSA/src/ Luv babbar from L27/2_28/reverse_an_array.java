import java.util.Scanner;
class reverse_an_array{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int l = 0; l<n; l++){
            System.out.println("Enter element: ");
            ar[l] = sc.nextInt();
        }
        int i = 0;
        int j = n-1;
        while(i<=j){
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;
        }
        for(int e: ar){
            System.out.println(e);
        }
    }
}