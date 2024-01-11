class first_occurance{
    public static void main(String[] args) {
        int arr[]={1,2,4,23,43,23,4,2,23};
        int tar=3;
        System.out.println(rec(arr, 0, tar));
    }
    static int rec(int arr[],int i,int t){
        if(i==arr.length) return -1;
        if(arr[i]==t) return i;
        return rec(arr, i+1, t);
    }
}