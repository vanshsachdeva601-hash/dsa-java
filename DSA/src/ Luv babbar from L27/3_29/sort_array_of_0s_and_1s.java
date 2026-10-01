import java.util.Scanner;
public class sort_array_of_0s_and_1s {
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
    public static int[] sort(int[] ar){
        int n = ar.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(ar[i]==1 && ar[j]==0){
                ar[i] = 0;
                ar[j] = 1;
                i++;
                j--;
            }
            else if(ar[j]==1){
                j--;
            }
            else if(ar[i] == 0){
                i++;
            }
        }
        return ar;
    }
    public static void main(){
        int[] userArray = input();
        int[] sortedArray = sort(userArray);
        for(int num: sortedArray){
            System.out.print(num+" ");
        }
    }
}
