class second_largest_in_array{
public static void main(String[] args) {
    int arr[]={13,1,2,3,3,7,14};
    int sl=-1;
    int l=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>l){
            sl=l;
            l=arr[i];
        }
        else if(arr[i]>sl){
            sl=arr[i];
        }
    }
    System.out.println(sl);
}   
}
