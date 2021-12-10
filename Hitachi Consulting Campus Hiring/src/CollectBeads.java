import java.util.HashSet;
/*
// Unique permuted string
class CollectBeads {
    private static void permute(String str, int l, int r) {
        if (l == r) {
            //System.out.println(str);
            ans.add(str);
        }
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l+1, r);
                str = swap(str, l, i);
            }
        }
    }


    public static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray();

        char temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    static HashSet<String> ans = new HashSet<>();

    public static void main(String[] args) {
        String str = "aba";//"aabbbbaaaabbbbaaa"; //"abcd";
        int n = str.length();

        permute(str, 0, n-1);

        System.out.println(ans.size());


//        for(String val:ans){
//            System.out.println(val);
//        }

    }
}
 */


class CollectBeads{
    public static void main(String[] args) {
        String str = "aabbbbaaaabbbbaaa"; //"abcd";//"aba";

        int[] freq = new int[26];

        // Calculate frequencies of each character of string
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i) - 'a']++;
        }

        boolean flag = false;
        int sum1=0;
        int sum2=0;
        for(int f:freq){
            if(f != 0){
                if(f>1)
                    flag = true;
                sum1 += f;
                sum2 += f*2;
            }
        }

        if(flag)
            System.out.println(sum1);
        else
            System.out.println(sum2);
    }
}

/**
 * Output:
 * "aba"
 * 3
 *
 * "abcd"
 * 8
 *
 * "aabbbbaaaabbbbaaa"
 * 17
 */