public class Generics_Demo {
    public static void main(String[] args) {
        Integer[]arr={1,2,3,4,5,6};
        Display(arr);
        String []arr1={"ankit","kumar","dwivedi"};
        Display(arr1);
    }
    public static<T> void Display(T []arr){//generic is made by T
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
