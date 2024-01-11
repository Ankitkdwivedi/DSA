import java.util.Arrays;
public class insertionsort {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,7,5,3,66};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            while(j>=0 && arr[j]>arr[i]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=arr[i];
        }
    }
}
