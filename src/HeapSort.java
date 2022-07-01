import java.util.Scanner;

public class HeapSort {
    void sort(int arr[]){
         int length = arr.length;
         for(int i=length/2-1;i>=0;i--){
             heapify(arr,length,i);
         }

         //Swap the elements and heapify again.
         for(int i = length-1;i>=0;i--){
             int temp = arr[0];
             arr[0] = arr[i];
             arr[i] = temp;

             heapify(arr,i,0);
         }
    }
    void printArray(int[]arr){
        System.out.println("Array elements after sorting:-");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    void heapify(int arr[],int n,int i){
        int largest = i;   //Parent node index position
        int li = 2*i+1;    //Left child node index position
        int ri = 2*i+2;   //Right child node index position
        if(li<n && arr[li]>arr[largest]){
            largest = li;
        }
        if(ri<n && arr[ri]>arr[largest]){
            largest = ri;
        }
        if(largest !=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
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

        HeapSort hs = new HeapSort();
        hs.sort(arr);
        hs.printArray(arr);

        System.out.println("\nName : Jay Thakur\nRoll.No : 191500368(11)");
    }
}
