import java.util.Arrays;
public class longest_common_prefix {
    public static void main(String[] args) {
        String [] str={"'cluster'","clue","clutch","club"};
        Arrays.sort(str);
        StringBuilder sb=new StringBuilder();
        char[] first=str[0].toCharArray();
        char[] last=str[str.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
               break;
            }
            sb.append(first[i]);
        }
        System.out.println(sb.toString());
    }
}

// class Solution {
//     public int countHomogenous(String s) {
//         int mod = 1_000_000_007;
//         int count = 0;
//         int left = 0, n = s.length();

//         for (int right = 0; right < n; right++) {
//             if (s.charAt(right) != s.charAt(left)) {
//                 left = right; // Reset window start when character changes
//             }
//             count = (count + (right - left + 1)) % mod; // Add all substrings ending at right
//         }

//         return count;
//     }
// }
// 
