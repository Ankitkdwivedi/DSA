public class rec_practise {
    public static void main(String[] args) {
        String s="AAAXAXA";
        rec(s);
        System.out.println(c);
    }
    static int c=0;
    static void rec(String s){
        if(s.length()<3){
            return;
        }
            if(s.charAt(0)==s.charAt(2)){
                c++;
            }
            rec(s.substring(1));
        }
    }
