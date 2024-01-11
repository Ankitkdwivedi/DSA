public class CB_string {
    public static void main(String[] args) {
        String ques="2323";
       System.out.println(print(ques));
        
    }
    public static int print(String ques ){
        boolean[]visited=new boolean[ques.length()];
        int count=0;
        for(int len=1;len<=ques.length();len++){
            for(int si=len;si<=ques.length()-len;si++){
                int ei=si+len;
                String s=ques.substring(si, ei);
                if(iscbnumber(Long.parseLong(s))==true&&isvisited(visited,ei,si-1)==false){
                    count++;
                    for(int i=si;i<ei;i++){
                        visited[i]=true;
                    }
                }
            }
        }
        return count;
    }
    public static boolean isvisited(boolean[]visited,int si,int ei){
        for(int i=si;i<=ei;i++){
            if(visited[i]==true){
                return true;
            }
        }
        return false;
    }
    static boolean iscbnumber(long n){
        int []arr={2,3,5,7,11,13,17,19,23,29};
        if(n==0||n==1){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==n){
                return true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(n%arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
