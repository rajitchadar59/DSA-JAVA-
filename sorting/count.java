public class count {
    public static void count_sort(int arr[]){
    int largest= Integer.MIN_VALUE;
    for(int i =0 ; i <arr.length ; i++){
       largest=Math.max(arr[i] ,largest);
    }

    int count[]= new int[largest+1];

    for(int i =0 ; i< arr.length ; i++){
        count[arr[i]]++;
    }
    
    int j =0;

    for(int i =0  ; i <count.length ; i++){
       while(count[i] > 0){
        arr[j]= i;
        j++;
        count[i]--;
       }
    }

    }

    public static void main(String[] args) {
     int arr[]={5,4,3,2,1};
    count_sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }
}