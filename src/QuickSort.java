import java.util.Scanner;

public class QuickSort {
    static int partition(int arr[], int l, int h){
        int pivot = arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            int temp = arr[j];
            arr[j] = arr[l];
            arr[l] = temp;
        }
        return j;
    }
    static void quickSort(int arr[],int l, int h){
        if(l<h){
            int pivot = partition(arr,l,h);
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,h);
        }
    }
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
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

        System.out.println("Array elements after sorting:-");
        partition(arr,0,n-1);
       quickSort(arr,0,n-1);
       printArray(arr);

        System.out.println("\nName : Jay Thakur\nRoll.No : 191500368(11)");
    }
}
