// class Solution {
//     public String addStrings(String num1, String num2) {
//         StringBuilder str = new StringBuilder();
//         int i = num1.length() - 1;
//         int j = num2.length() - 1;
//         int carry = 0;
//         while(i >= 0 && j >=0 ){
//             int dig1 = num1.charAt(i) - '0';
//             int dig2 = num2.charAt(j) - '0';
//             int sum = dig1 + dig2 + carry;
//                 if (sum >= 10) {
//                     str.append(sum%10);
//                 }
//                 else{
//                     str.append(sum);
//                 }
//                  carry = sum/10;
//             i--;
//             j--;    
//         }
//         while(i >= 0){
//             int sum = num1.charAt(i) - '0' + carry;
//             if(sum >= 10){
//                 str.append(sum%10);
//             }
//             else{
//                 str.append(sum);
//             }
//              i--;
//              carry = sum/10;
//         }
//         while(j >= 0 ){
//              int sum = num2.charAt(j) - '0' + carry;
//             if(sum >= 10){

//                 str.append(sum%10);
//             }
//             else{
//                 str.append(sum);
//             }
//              j--;
//              carry = sum/10;
//         }
//         if(carry > 0){
//             str.append(carry);
//         }
//         str.reverse();
//         String ans = new String(str);
//         return ans;
//     }
// }
class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;

            sb.append((char) (sum % 10 + '0'));

            carry = sum / 10;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}