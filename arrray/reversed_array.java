public class reversed_array {
    public static void reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
       while(first < last){
       int temp=arr[first];
       arr[first]=arr[last];
       arr[last]=temp;
        last--;
        first++;
       }
    }
    public static void main(String[] args) {
     int arr[]={12,15,5,12,18};

     for(int i=0 ;i<arr.length ;i++){
        System.out.print(arr[i]+" ");
     }

     reverse(arr);

      System.out.println();
     for(int i=0 ;i<arr.length ;i++){
        System.out.print(arr[i]+" ");
     }
    }
}