import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
      
        Map<Character,Character> map=new HashMap<>();
        Map<Character,Character> rev=new HashMap<>();
      
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
          
            if(map.containsKey(a) && map.get(a)!=b){
                return false;
            }
          
            if(rev.containsKey(b) && rev.get(b)!=a){
                return false;
            }
          
            map.put(a,b);
            rev.put(b,a);
        }
      
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(isIsomorphic(s, t));
    }
}
