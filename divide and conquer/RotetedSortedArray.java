public class RotetedSortedArray {
    public static int search(int arr[] , int target , int si , int ei){
    
     if(si > ei){
        return -1;
     }


    int mid=si+(ei-si)/2;
    if(arr[mid]==target){
        return mid;
    }

    //L1 mid
    if(arr[si]<= arr[mid]){
     //case a : left
     if(arr[si] <= target && target <= arr[mid]){
      return  search(arr, target, si, mid-1);
     }else{
       //case b:right 
       return  search(arr, target, mid+1,ei);
     }

    }
    //mid on L2
    else{
        //case c:right
       if(arr[mid] <= target && target <= arr[ei]){
        return search(arr, target, mid+1, ei);
       } else{
       // case d:left
        return search(arr, target,si,mid-1);
       }
    }
     
     
    }
    public static void main(String[] args) {
       int arr[]={4,5,6,7,0,1,2};
       int target=6;
       System.out.println(search(arr, target ,0 , arr.length-1));
    }
}