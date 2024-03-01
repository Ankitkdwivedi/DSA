package Important;

public class Count_Numbers_with_Unique_Digits {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(5));
    }
    public static int countNumbersWithUniqueDigits(int n) {
        int c=9;
        for(int i=2;i<=n;i++){
            c=c*(11-i);
        }
        return c+countNumbersWithUniqueDigits(n-1);
    }
}
