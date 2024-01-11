

public class bubblesort {
    public static void main(String[] args) {
     int []arr={1,23,5,6,5,4,64,3};
     sort(arr); 
     printaray(arr);
    }
    public static void sort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }
            }
        }
    }
    static void swap(int []arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    static void printaray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
