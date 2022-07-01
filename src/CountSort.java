import java.util.Scanner;

public class CountSort {
    int getMax(int[] a, int n) {
        int max = a[0];
        for(int i = 1; i<n; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }

    void countSort(int[] a, int n)
    {
        int[] output = new int [n+1];
        int max = getMax(a, n);
        //int max = 42;
        int[] count = new int [max+1];

        for (int i = 0; i <= max; ++i)
        {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++)
        {
            count[a[i]]++;
        }

        for(int i = 1; i<=max; i++)
            count[i] += count[i-1];


        for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }

        for(int i = 0; i<n; i++) {
            a[i] = output[i];
        }
    }


    void printArray(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String args[])
    {
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
        CountSort c1 = new CountSort();
        c1.countSort(arr,n);
        System.out.println("Array elements after sorting are:- ");
        c1.printArray(arr, n);
        System.out.println();

        System.out.println("\nName : Jay Thakur\nRoll.No : 191500368(11)");
    }
}
