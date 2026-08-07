// class Solution {
//     public int minPartitions(String n) {
//         int max = 0;
//         for(int i = 0;i < n.length();i++){
//             int ch = n.charAt(i) - '0';
//             if(max < ch){
//                 max = ch;
//             }
//         }
//         return max;
//     }
// }
class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char ch:n.toCharArray()){
            int num=ch-'0';
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}