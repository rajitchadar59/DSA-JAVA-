//brute force approch
public class max_subarray_sum {
    public static void max_sum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                currSum=0;
                for(int k = i; k <= j; k++){
                    //subarray sum
                   currSum=currSum+arr[k];
                }
                System.out.println(currSum);
               if(currSum  >maxSum){
                maxSum= currSum;
               }
            }
            
        }

        System.out.println("maximun sum :"+maxSum);
    }
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        max_sum(nums);
    }
}