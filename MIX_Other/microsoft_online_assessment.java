public class microsoft_online_assessment {
    public static void main(String[] args) {
        int n=15758;
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        if(n<0){
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='5'){
                sb.deleteCharAt(i);
                break;
            }
        }
    }
    else{
        for(int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i)=='5'){
                sb.deleteCharAt(i);
                break;
            }
        }
    }
    System.out.println(Integer.parseInt(sb.toString()));
    }
}
