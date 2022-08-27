package collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

class Person{
    int roll;
    String name;
}

public class main {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();

        ArrayList list2 = new ArrayList();

        Person s1 = new Person();
        s1.roll = 101;
        s1.name = "Sandro";

        list1.add("Sandro");
        list1.add("Giorgi");
        list1.add("Levani");
        list1.add("Luka");
        list1.add("Sandro");
        list1.add("nika");

        list2.add("Sandro");
        list2.add(10);
        list2.add(5.1);
        list2.add(s1);

        System.out.println("list1 is: "+list1);
        System.out.println("list2 is: "+list2);

        String name = list1.get(2);
        System.out.println("name is: "+name);

        Object O = list2.get(2);
        System.out.println("O is : " + O );

        list1.set(2, "Sandro");
        System.out.println("list now is: "+list1);

        list1.remove(2);
        System.out.println("list1 after remove is: "+list1);

        if(list1.contains("John")) {
            System.out.println("Sandro is in the list");
        }

        System.out.println("iterating ArrayList With for loop");
        for(int i=0; i<list1.size();i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("=========");

        System.out.println("iterating wiwth enhanced for loop");
        for(String str : list1) {
            System.out.println(str);
        }
        System.out.println("=========");

        System.out.println("iterating with iterator");
        Iterator<String> itr = list1.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Sandro")) {
                itr.remove();
            }
        }
        System.out.println("===========");

        System.out.println("list1 afrer iteration is: "+list1);

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int i=10;i>0;i++) {
            queue.add(i);
        }

        System.out.println("Queue Size is: "+queue.size());
        System.out.println("Head of Queue is: "+queue.peek()); // Head of Queue

        queue.poll(); // Removing the head 1
        System.out.println("Queue Size After Poll is: "+queue.size());

        System.out.println("Head of Queue is: "+queue.peek()); // New Head Of Queue : 2

        HashSet<String> set = new HashSet<String>();

        set.add("Sandro");
        set.add("Giorgi");
        set.add("Luka");
        set.add("Levani");
        set.add("Leqso");
        set.add("Gurami");
        set.add("Nika");
        set.add("Noe");

        System.out.println("set is: "+set);

        Iterator<String> itr1 = set.iterator();
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

        set.remove("Leqso");
        System.out.println("set afer removing Leqso is: "+set);
        if(set.contains("John")) {
            System.out.println("John is in the set");
        }

        System.out.println("set size is "+set.size());

    }

}
