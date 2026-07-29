// class Solution {
//     public String reversePrefix(String s, int k) {
//         String str = "";
//         for(int i = k - 1; i >=0;i--){
//             str+= s.charAt(i);
//         }
//         for(int i = k;i < s.length();i++){
//             str+= s.charAt(i);
//         }
//         return str;
//     }
// }
class Solution {
    public String reversePrefix(String s, int k) {
      char[] arr=s.toCharArray();
      int i=0;
      int j=k-1;
      while(i<j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
      }
        
      return new String(arr);
    }
}