public class queen_combination {
    public static void main(String []args){
        int n=4;
        int tq=2;
        boolean arr[]=new boolean[n];
        rec(arr, tq, 0,"");
    }
    static void rec(boolean[]arr,int tq,int tqsp,String ans ){
        if(tq==tqsp){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                arr[i]=true;
                rec(arr, tq, tqsp+1, ans+"b"+i+"q"+tqsp+" ");
                arr[i]=false;
            }
        }
    }
}
