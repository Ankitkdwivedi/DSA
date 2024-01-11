public class obdi {
    public static void main(String[] args) {
        String ques="aa";
        System.out.println(rec(ques));
    }
    public static boolean rec(String str) {
        if (str.length() == 0) {
          return true;
        }
        if (str.charAt(0) == 'a') {
          if (str.length() >= 3 && str.substring(1, 3).equals("bb")) {
            return rec(str.substring(3));
          } else {
            return rec(str.substring(1));
          }
        }
        return false;
    }
}
