import java.util.Stack;

public class MaxAreaHistogram {
    public static void maxArea(int height[]){
        int maxarea=0;
        int nsr[]=new int[height.length];
        int nsl[]=new int[height.length];

        //Next  Smaller Right 
        Stack<Integer> s= new  Stack<>();
        
        for(int i = height.length-1 ; i >=0 ; i--){
           while(!s.isEmpty() && height[s.peek()] >= height[i]) {
            s.pop();
           }
           if(s.isEmpty()){
            nsr[i]=height.length;

           }else{
            nsr[i]=s.peek();
           }
        
           s.push(i);
        }
        

         
        //Next Samaller Left
        
             s= new  Stack<>();
        
        for(int i = 0 ; i <height.length ; i++){
           while(!s.isEmpty() && height[s.peek()] >= height[i]) {
            s.pop();
           }
           if(s.isEmpty()){
            nsl[i]=-1;

           }else{
            nsl[i]=s.peek();
           }
        
           s.push(i);
        }


        //Calculate Area
      
      for(int i =0 ; i < height.length ; i++){
        int h=height[i];
        int w=nsr[i]-nsl[i]-1;
        int area= h*w;
        maxarea=Math.max(maxarea, area);

      }

     System.out.println("maximum area of histogram is :"+maxarea);

    }
    public static void main(String[] args) {
      int height[]={2,4}; 
      maxArea(height);
    }
}