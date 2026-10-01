//PROGRAM TO FIND FIRST UNSORTED ELEMENT IN AN ARRAY
import java.util.Scanner;
class first_unsorted_element{
    public static int firstunsortedelement(int[] ar){
        for(int i =0; i<ar.length-1; i++){
            if(ar[i+1]<ar[i]){
                return i+1;
            }
        }
        return -1;
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
        int index = firstunsortedelement(array);
        if(index==-1){
            System.out.println("SORTED ARRAY");
        }
        else{
            System.out.println("FIRST UNSORTED ELEMENT IS AT INDEX: "+ index);
        }
    }
}