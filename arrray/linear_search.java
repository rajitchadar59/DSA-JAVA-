public class linear_search {
    public static void max(int arr[]){
        int largest=0;
         for(int i =0 ; i < arr.length ; i++){
            if(arr[i] >largest){
                largest=arr[i];

            }
         }

         System.out.println("largest lement is :"+largest);
    }

    public static int search(int arr[] , int key){
        for(int i =0 ; i < arr.length ; i++){
            if(arr[i]==key){
                return i;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,15,6};
        int key=15;
       int i =  search(nums, key);
        if(i==-1){
            System.out.println("element is not found ");
        }else{
            System.out.println("element is found !");
        }
       
       max(nums);
    }
}