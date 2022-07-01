import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int temp,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n  = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements before sorting:-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        for(int i=1;i<n;i++){
            temp = arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;
        }
        System.out.println("Array elements after sorting:-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nName : Jay Thakur\nRoll.No : 191500368(11)");
    }
}
