import java.util.Scanner;
public class print_extreme_elements_in_alternate_manner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF YOUR ARRAY: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element: ");
            ar[i] = sc.nextInt();
        }
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(i==j){
                System.out.print(ar[i]+" ");
                break;
            }
            else{
            System.out.print(ar[i]+" "+ar[j]+" ");
            i++;
            j--;
        }}
    }
}
