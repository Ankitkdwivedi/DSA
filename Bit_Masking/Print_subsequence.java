public class Print_subsequence {
    public static void main(String[] args) {
        String s="abc";
        int n=s.length();
        for(int i=0;i<(1<<n);i++){
            StringBuilder ans=new StringBuilder();
            int num=i;
            int in=0;
            while(num>0){
                if((num & 1) == 1){
                    ans.append(s.charAt(in));
                }
                in++;
                num=num>>1;
            }
            System.out.println(ans);
        }
    }
}
