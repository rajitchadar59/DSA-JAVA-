
public class max_subarray_sum2 {
    public static void max_sum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[arr.length];
        
        //calculate prefix array
        prefix[0]=arr[0];
       for(int i =1 ; i < prefix.length ; i++){
        prefix[i]= prefix[i-1]+arr[i];
       }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
               
             currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];

               if(currSum  > maxSum){
                maxSum= currSum;
               }
            }
            
        }

        System.out.println("maximun sum :"+maxSum);
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,1};
        max_sum(nums);
    }
}