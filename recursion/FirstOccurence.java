public class FirstOccurence {
    public static int firstOccurInd(int[] arr, int i,int key){
        if(i == arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

       return firstOccurInd(arr, i+1, key);

    }


       public static int lastOccurInd(int[] arr, int i,int key){
        if(i < 0){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

       return lastOccurInd(arr, i-1, key);

    }
    public static void main(String[] args) {
      int arr[]={1,15,4,2,3,4,5,6};
      System.out.println(firstOccurInd(arr, 0, 4)); 
      System.out.println(lastOccurInd(arr, arr.length-1, 6));
    }
}