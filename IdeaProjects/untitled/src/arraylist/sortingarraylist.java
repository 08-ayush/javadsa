package arraylist;
import java.util.*;

public class sortingarraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());

        }
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
        }
//       System.out.println(list);
//        sort in assending order
            Collections.sort(list);

            System.out.println(list);
//        sort in reverse array
            //comparator fnx logic

            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);
        }
    }

