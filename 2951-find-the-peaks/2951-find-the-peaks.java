// class Solution {
//     public List<Integer> findPeaks(int[] mountain) {
//         List <Integer> list =new ArrayList<>();
//         int k = 0;
//         for(int i = 1;i < mountain.length -1;i++){
//             if(mountain[i] > mountain[i - 1] && mountain[i] > mountain[i+1]){
//                 list.add(i);
//             }
//         }
//         return list;
//     }
// }
class Solution {
    public List<Integer> findPeaks(int[] m) {
        List<Integer> a=new ArrayList<>();
        for (int i=1;i<m.length-1;i++){
            int num=m[i];
            if(num>m[i-1] && num>m[i+1]){
                a.add(i);
                i++;
            }
        }
        return a;
    }
}