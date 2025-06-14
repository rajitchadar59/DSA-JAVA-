public class trapping_rainwater {
    public static int trapped_rain_water(int height[]){
     //left max boundary-array
     int leftMax[]=new int[height.length];
     leftMax[0]=height[0];
     for(int i =1 ; i<height.length ;i++){
        leftMax[i]=Math.max(leftMax[i-1] ,height[i]);
     }

    //right max bondary array

     int rightMax[]=new int[height.length];
     rightMax[height.length-1]=height[height.length-1];
      for(int i = height.length-2 ; i >=0 ; i--){
       rightMax[i]=Math.max(height[i], rightMax[i+1]);
    }
    int waterlevel;
    int trappedwater=0;
    for(int i =0 ; i<height.length ; i++){
    waterlevel= Math.min(leftMax[i],rightMax[i]);
    trappedwater=trappedwater+(waterlevel-height[i]);
    }

    return  trappedwater;
    }
    public static void main(String[] args) {
      int height[]={4,2,0,6,3,2,5};
       System.out.println("trapped water is "+trapped_rain_water(height));
    }
}