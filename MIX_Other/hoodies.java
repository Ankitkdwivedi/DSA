import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class hoodies {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<LinkedList<Integer>> course = new ArrayList<>();
        int q = s.nextInt();
        for (int i = 0; i < 4; i++) {
            course.add(new LinkedList<Integer>());
        }
        ArrayList<Integer> track = new ArrayList<>();
        while (q-- > 0) {
            char ch = s.next().charAt(0);
            if (ch == 'E') {
                int x = s.nextInt();
                int y = s.nextInt();
                if (track.contains(x)) {
                    course.get(x - 1).add(y);
                } else {
                    track.add(x);
                    course.get(x - 1).add(y);
                }
            } else {
                int course_id = track.get(0);
                int roll = course.get(course_id - 1).remove(0);
                System.out.println(course_id + " " + roll);
                if (course.get(course_id - 1).isEmpty()) {
                    track.remove(0);
                }
            }
        }
    }
}
