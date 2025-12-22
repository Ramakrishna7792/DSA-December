class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy=0;
        for(int c:candies){
            maxCandy=Math.max(maxCandy,c);
        }
        List<Boolean> result=new ArrayList<>();

        for(int c:candies){
            if(c+extraCandies>=maxCandy){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}