

public class bubble_sort {
    public static void bubble(int arr[]){
    
     for(int i =0 ; i <arr.length-1 ; i++){
      
        for(int j =0 ; j < arr.length-1-i ;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]=temp;
               
            }
        }
       
     }
    }
    public static void main(String[] args) {
       int arr[]={2,15,6,48,12,54};
       bubble(arr);
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
    }
}