import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,7,5,3,66};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int []arr){
        for(int i=0;i<arr.length;i++){
            int min=i;                                      //select the minimum element and swap with ith character.
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,min,i);
        }
    }
    static void swap(int []arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}
