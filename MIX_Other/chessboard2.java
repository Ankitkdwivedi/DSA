public class chessboard2 {
    public static void main(String[] args) {
        int n=3;
        printpath(n-1, n-1, 0, 0, "");
    }
    static int c=0;
    public static void printpath(int er,int ec,int cr,int cc,String ans){
        if(cr==er&&cc==ec){
            System.out.print(ans+"{"+cr+"-"+cc+"}");
            c++;
            return;
        }
        if(cr>er||cc>ec) return;
        //knight
        printpath(er,ec, cr+2, cc+1, ans+"{"+cr+"-"+cc+"}K");
        printpath(er,ec, cr+1, cc+2, ans+"{"+cr+"-"+cc+"}K");
        //rook
        if(cr==0||cc==0||cc==ec||cr==er){
            for(int i=1;i<=ec;i++){
                printpath(er, ec, cr, cc+i, ans+"{"+cr+"-"+cc+"}R");
            }
            for(int i=1;i<=er;i++){
                printpath(er, ec, cr+i, cc, ans+"{"+cr+"-"+cc+"}R");
            }
        }
        //bishop
        if(cr==cc||cr+cc==ec){
            for(int i=1;i<=er;i++){
                printpath(er, ec, cr+i, cc+i, ans+"{"+cr+"-"+cc+"}B");
            }
        }
    }
}
