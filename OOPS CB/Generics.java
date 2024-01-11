// import java.util.*;
public class Generics{
    public static void main(String[] args) {
        Integer[]arr={1,2,3,4,5};
        String[]arr1={"ankit","a","afd"};
        display(arr);
        display(arr1);
    }

    public static <T>void display(T[] arr) {       //here T is generics we can replace it with any other name like a,b but the angular bracket is must by the use of generics the same function will work for both arr and arr1
        System.out.println(arr);
    }
}