public class StringPermute {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();

        permute(str, 0, n-1);
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
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

}

