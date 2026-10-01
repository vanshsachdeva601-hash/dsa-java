import java.util.Scanner;
public class unique_element_in_array {
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
    public static int uniqueElement(int[] ar){
        int uniqueNumber = -1;
        int n = ar.length;
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<i; j++){
                if(ar[i]==ar[j]) {
                    count += 1;
                }
            }
            for(int k = i+1; k<n; k++){
                if(ar[i]==ar[k])
                    count+=1;
            }
            if(count==0){
                uniqueNumber = ar[i];
            }
        }
        return uniqueNumber;
    }
    public static void main(String[] args){
        int[] userArray = input();
        int uniqueNumber = uniqueElement(userArray);
        if(uniqueNumber==-1){
            System.out.println("Unique element does not exist");
        }
        else{
            System.out.println("Unique element from the given array is: "+uniqueNumber);
        }
    }
}
