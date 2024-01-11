public class subsequence_ascii {
		public static void main(String[]args) {
			String s="cbbd";
			String ans="";
			subsequence(s,ans);
			System.out.println(c);
		}
		static int c=0;
		static void  subsequence(String s,String ans) {
			if(s.length()==0) {
			c++;
				System.out.println(ans);
			return;
			}
			char ch=s.charAt(0);
			//int ascii=ch;
			subsequence(s.substring(1),ans);
			subsequence(s.substring(1),ans+ch);
			//subsequence(s.substring(1),ans+ascii);
		}
	}

