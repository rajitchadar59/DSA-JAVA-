public class binary_search {
    public static int bs(int arr[] , int key){
        int low =0;
        int high=arr.length-1;
        int mid;
        while(low <= high){
          mid=(low+high)/2;  

          if(arr[mid] ==key){
            return mid;

          }
          else if(arr[mid] < key){
            low=mid+1;
          }
          else{
            high=mid-1;
          }
        }
        return -1;

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
         int key=30;
        int i =  bs(nums ,key);
        
        if(i != -1){
            System.out.println("element found at position :"+(i+1));
        }else{
            System.out.println("element is not found !");
        }
        
    }
}