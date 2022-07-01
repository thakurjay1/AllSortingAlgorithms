import java.util.Scanner;

public class MergeSort {
    int array[];
    int tempArr[];
    int length;
    public void sort(int arr[]){
        this.array = arr;
        this.length = arr.length;
        this.tempArr = new int[length];
        dividearray(0,length-1);
    }
    public void dividearray(int lowerIndex, int higherIndex){
        if(lowerIndex<higherIndex){
            int middle = lowerIndex + (higherIndex-lowerIndex)/2;
            //It will solve the left side of an array.
            dividearray(lowerIndex,middle);
            //It will sort the right hand side of array.
            dividearray(middle+1,higherIndex);

            mergeArray(lowerIndex,middle,higherIndex);
        }
    }
    public void mergeArray(int lowerIndex,int middle,int higherIndex){
        for(int i=lowerIndex;i<=higherIndex;i++){
            tempArr[i] = array[i];
        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        while(i<=middle && j<=higherIndex){
            if(tempArr[i]<tempArr[j]){
                array[k] = tempArr[i];
                i++;
            }else{
                array[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k] = tempArr[i];
            k++;
            i++;
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
        MergeSort ms = new MergeSort();
        ms.sort(arr);

        System.out.println("Array elements after sorting:-");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nName : Jay Thakur\nRoll.No : 191500368(11)");
    }
}
