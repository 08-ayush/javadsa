import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int initialCapacity;
        ArrayList<Integer> list=new ArrayList<>(initialCapacity=10);
//        list.add(67);
//        list.add(68);
//        list.add(69);
//        list.add(61);
//        list.add(66);
//        list.add(62);
//        list.add(63);
//        list.add(64);
//        System.out.println(list.contains(64));
//        System.out.println(list);
//        replacing the indexing using list.set
//        list.set(2,555);
//        System.out.println(list);
//        for removing the element
//        list.remove(1);
//System.out.println(list);
int size=sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}