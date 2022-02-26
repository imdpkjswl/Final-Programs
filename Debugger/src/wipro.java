import java.util.*;


class wipro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        String str;
	// str = sc.next();

	str  = "deepakjaiswal";
        HashSet<Character> s1 = new HashSet<>();
        HashSet<Character> s2 = new HashSet<>();

        for(int i=0;i<str.length();i++){
            if(s1.contains(str.charAt(i))){
                s2.add(str.charAt(i));
            }else{
                s1.add(str.charAt(i));
            }
        }

        String res = str;
        String ans  = res;
        for(char val : s2){
            res = ans;
            ans = "";
            for(int i=0;i<res.length();i++){
                if(val == res.charAt(i)){
                    continue;
                }else{
                    ans += res.charAt(i);
                }
            }
        }

        System.out.println(ans);

    }
}
