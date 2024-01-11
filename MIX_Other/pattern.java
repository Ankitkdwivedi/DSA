public class pattern {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(i-1);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=i-n;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(2*n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i-n;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
