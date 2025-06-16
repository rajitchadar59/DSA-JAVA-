public class selection {
    public static void selection_sort(int arr[]){
       for(int i =0 ; i <arr.length-1 ; i++){
       int min_index=i;
       for(int j=i+1 ; j <arr.length ; j++ ){
        if(arr[j] <arr[min_index]){
            min_index=j;
        }
       }
       int temp=arr[i];
       arr[i]=arr[min_index];
       arr[min_index]=temp;
       }
    }
    public static void main(String[] args) {
       int arr[]={5,4,1,3,2}; 
       selection_sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }
}