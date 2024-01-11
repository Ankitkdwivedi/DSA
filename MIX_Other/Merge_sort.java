public class Merge_sort {
    public static void main(String[] args) {
        int arr[]={2,7,9,1,5};
    }
    public static int[] Merge(int []arr,int si,int ei){
        if(si==ei){
            int []bs=new int[1];
        }
        int mid=(si+ei)/2;
        int fa[]=Merge(arr, si, mid);
        int sa[]=Merge(arr, mid+1, ei);
        return MergeTwoArray(fa,sa);
    }
    static int [] MergeTwoArray(int arr1[],int[] arr2){

    }
}
