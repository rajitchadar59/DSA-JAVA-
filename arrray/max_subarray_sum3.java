
public class max_subarray_sum3 {
    public static void kadanes(int arr[]){
     int maximumSum=Integer.MIN_VALUE;
     int currentSum=0;

     for(int i =0 ; i <arr.length ; i++){
        currentSum=currentSum+arr[i];
        if(currentSum < 0){
            currentSum=0;
        }
        maximumSum=Math.max(currentSum ,maximumSum);
     }
    

    System.out.println("maximum sum is:"+maximumSum);
    }
    public static void main(String[] args) {
     int arr[]={-2,-3,4,-1,-2,1,5,-3};
     kadanes(arr);

    }

}