public class ReverseOrderOfWords {
    public static void main(String[] args) {
        String str = "Hello i am snehith shetty";

        String[] s = str.split(" ");

        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println(ans.substring(0, ans.length() - 1));



    }
}
