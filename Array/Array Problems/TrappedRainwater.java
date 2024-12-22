public class TrappedRainwater{
    public static void main(String args[]){
        int heights[]={4, 2, 0, 6, 3, 2, 5};
        System.out.print(TrappedRainwater(heights));

    }
    
    public static int TrappedRainwater(int heights[]){
        //Logic
        //Calculate Max left boundary -- in array
        int leftMax[] = new int[heights.length];
        
        leftMax[0]= heights[0];
        for(int i=1; i<heights.length; i++){
            leftMax[i]= Math.max(heights[i], leftMax[i-1]);
        }
        // System.out.print(Arrays.toString(leftMax));
        
        
        //Calculate Max right boundary -- in array
        int rightMax[]= new int[heights.length];
        
        rightMax[heights.length-1] = heights[heights.length-1];
        for(int i=heights.length-2; i>=0; i--){
            rightMax[i]= Math.max(heights[i], rightMax[i+1]);
        }
        // System.out.print(Arrays.toString(rightMax));
        
        //loop
        int TrappedWater = 0;
        for(int i=0; i<heights.length; i++){
            //Waterlevel = min(left boundary, right boundary)
            int Waterlevel= Math.min(leftMax[i], rightMax[i]);

            //Trapped Water = Waterlevel - height[i]
            TrappedWater = TrappedWater + (Waterlevel-heights[i]);
        }

        return TrappedWater;
    }
}