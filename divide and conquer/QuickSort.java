public class QuickSort {
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

   public static int partition(int arr[], int si , int ei){
    int pivot=arr[ei];
    int i =si-1; 
    for(int j=si; j < ei ;j++){
        if(arr[j] <pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    
             i++;
            int temp=pivot;
            arr[ei]=arr[i];//not write pivot==arr[i]
            arr[i]=temp;

            return i;


   }


   public static void quickSort(int arr[] , int si , int ei){
   if(si >= ei){
    return;
   }
   int partitionIndex= partition(arr,si,ei);
   quickSort(arr, si, partitionIndex-1);
   quickSort(arr, partitionIndex+1 ,ei);

   }
    public static void main(String[] args) {
    int[] arr = {5, 3, 8, 4, 2, 7, 1, 10,-5};
    quickSort(arr, 0, arr.length-1);
    printArray(arr);
    }
}
