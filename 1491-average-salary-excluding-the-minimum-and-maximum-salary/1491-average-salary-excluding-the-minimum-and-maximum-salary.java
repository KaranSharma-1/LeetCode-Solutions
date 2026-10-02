class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int val : salary){
            if(max < val)max = val;
            if(min > val) min = val;
            sum+= val;
        }        
        return (double)(sum - max - min)/(salary.length - 2);
    }
}