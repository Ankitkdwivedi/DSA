import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n][3];
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                arr[j][i]=sc.nextInt();
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    c++;
                }
                System.out.println(c);
            }
            if(c>=2) ans++;
        }
        System.out.println(ans);
    }

}