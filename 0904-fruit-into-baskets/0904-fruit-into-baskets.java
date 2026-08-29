// class Solution {
//     public int totalFruit(int[] fruits) {
//         HashMap<Integer,Integer> map= new HashMap<>();
//         int max = 0;
//         int j = 0;
//         for(int i = 0; i < fruits.length;i++){
//             map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
//             while(map.size() > 2){
//                 map.put(fruits[j],- 1);
//                 if(map.get(fruits[j]) == 0)map.remove(fruits[j]);
//                 j++;
//             }
//             max = Math.max(max,i - j +1);
//         }
//         return max;
//     }
// }
class Solution {
    public int totalFruit(int[] fruits)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=0;
        int maxlen=0;
        for(int end=0;end<fruits.length;end++)
        {
            int c=fruits[end];
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()>2)
            {
                int left=fruits[start];
                map.put(left,map.get(left)-1);
                if(map.get(left)==0)
                {
                    map.remove(left);
                }
                start++;
            }
            maxlen=Math.max(maxlen,end-start+1);

        }
        return maxlen;
        
    }
}