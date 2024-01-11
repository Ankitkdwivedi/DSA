

public class spriralmatrix {
    public static void main(String[] args) {
        int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Print(arr);
}
static void Print(int [][]arr){
    int minr=0;
    int maxr=arr.length-1;
    int minc=0;
    int maxc=arr.length-1;
    while(minr!=maxr&&minc!=maxc){
        if(minr==maxr&&minc==maxc) break;
    for(int i=minc;i<=maxc;i++){
        System.out.print(arr[minr][i]+" ");
    }
    minr++;
    System.out.println();
    for(int i=minr;i<=maxr;i++){
        System.out.print(arr[i][maxc]+" ");
    }
    maxc--;
    System.out.println();
    for(int i=maxc;i>=minc;i--){
    System.out.print(arr[maxr][i]+" ");
    }
    maxr--;
    System.out.println();
    for(int i=maxr;i>=minr;i--){
        System.out.print(arr[i][minc]+" ");
    }
    minc++;
}
    
}
}