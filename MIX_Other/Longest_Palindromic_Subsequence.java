public class Longest_Palindromic_Subsequence {
    public static void main(String[] args) {
       System.out.println(longestPalindromeSubseq("euazbipzncptldueeuechubrcourfpftcebikrxhybkymimgvldiwqvkszfycvqyvtiwfckexmowcxztkfyzqovbtmzpxojfofbvwnncajvrvdbvjhcrameamcfmcoxryjukhpljwszknhiypvyskmsujkuggpztltpgoczafmfelahqwjbhxtjmebnymdyxoeodqmvkxittxjnlltmoobsgzdfhismogqfpfhvqnxeuosjqqalvwhsidgiavcatjjgeztrjuoixxxoznklcxolgpuktirmduxdywwlbikaqkqajzbsjvdgjcnbtfksqhquiwnwflkldgdrqrnwmshdpykicozfowmumzeuznolmgjlltypyufpzjpuvucmesnnrwppheizkapovoloneaxpfinaontwtdqsdvzmqlgkdxlbeguackbdkftzbnynmcejtwudocemcfnuzbttcoew"));
    }
    public static int longestPalindromeSubseq(String s) {
        int max=Integer.MAX_VALUE;
       rec(s,"",max);
       return max; 
    }
    static void rec(String s,String ans,int max){
        if(s.length()==0){
            if(is_palin(ans)){
                max=Math.max(max,ans.length());
            }
            return;
        }
        char ch=s.charAt(0);
        rec(s.substring(1),ans+ch,max);
        rec(s.substring(1),ans,max);
    }
    static boolean is_palin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
