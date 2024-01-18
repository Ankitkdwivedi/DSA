package Ques;

import java.util.Arrays;

public class floodFill {
    public static int[][] ff(int[][] image, int sr, int sc, int color) {
        int arr[][]=image;
        int r[]={1,0,-1,0};
        int c[]={0,1,0,-1};
        dfs(arr, sr, sc, color,arr[sr][sc],r,c);
        return arr;
    }
    public static void dfs(int[][] arr, int sr, int sc, int color,int initialColor,int []r,int c[]){
        arr[sr][sc]=color;
        for(int i=0;i<4;i++){
            int nr=sr+r[i];
            int nc=sc+c[i];
            if(nr>=0&&nr<arr.length&&nc>=0&&nc<arr[0].length&&arr[nr][nc]==initialColor&&arr[nr][nc]!=color){
                dfs(arr, nr, nc, color, initialColor, r, c);
            }
        }
    }
    public static void main(String[] args) {
        int[][] img={{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc=1;
        int color=2;
        img=ff(img, sr, sc, color);
        for(int i=0;i<img.length;i++){
            System.out.println(Arrays.toString(img[i]));
        }
    }
}
