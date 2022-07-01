import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0;
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
        for(int j=0;j<n;j++){
            int flag = 0;
            for(int k=0;k<n-1-j;k++){
                if(arr[k]>arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }
        System.out.println("Array elements after sorting:-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nName : Jay Thakur\nRoll.No : 191500368(11)");
    }
}
