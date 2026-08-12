// class Solution {
//     public String largestOddNumber(String num) {
//         int n=num.length();
//         int ans=-1;
//         for(int i=n-1;i>=0;i--){
//             if((num.charAt(i) - '0')%2!=0){
//                 ans=i;
//                 break;
//             }
//         }
//         if(ans==-1) return "";
//         else return num.substring(0,ans+1);
//     }
// }
class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i) - '0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}