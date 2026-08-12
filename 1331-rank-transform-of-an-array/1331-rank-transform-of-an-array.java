class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if(n == 0)return arr;
        int count = 1;
        int[]temp = Arrays.copyOf(arr,n);
        HashMap<Integer,Integer> rank = new HashMap<>();
        Arrays.sort(temp);
        for(int i = 0;i < n -1;i++){
            if(temp[i]!= temp[i+1])
           { 
            rank.put(temp[i],count);
            count++;}
        }
        rank.put(temp[n- 1],count);
        for(int i = 0;i < n ;i++){
            arr[i] = rank.get(arr[i]);
        }
        return arr;
    }
}