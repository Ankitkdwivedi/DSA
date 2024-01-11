import java.util.Scanner;

public class soft_drinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];
        for(int i=0;i<8;i++){
            arr[i]=sc.nextInt();
        }
        int total_drink=arr[1]*arr[2];
        int toast=total_drink/arr[6];
        int lime=arr[5]/arr[7];
        int ans=Math.min(toast,total_drink);
        ans=Math.min(lime, ans);
        System.out.println(ans/arr[0]);
    }
}
