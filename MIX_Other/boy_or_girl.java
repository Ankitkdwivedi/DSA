import java.util.*;
public class boy_or_girl {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Set<Character> arr=new HashSet<>();
		for(int i=0;i<s.length();i++){
			arr.add(s.charAt(i));
		}
		if(arr.size()%2==0){
			System.out.println("CHAT WITH HER!");
		}
		else{
			System.out.println("IGNORE HIM!");
		}
	}
}