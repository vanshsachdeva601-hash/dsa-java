import java.util.Scanner;
public class linear_search {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter element: ");
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search: ");
        int target = sc.nextInt();
        int flag = -1;
        int index = -1;
        for(int i = 0; i<n; i++){
            if(ar[i]==target){
                flag = 1;
                index = i;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element found at: "+ index);
        }
    }
}
