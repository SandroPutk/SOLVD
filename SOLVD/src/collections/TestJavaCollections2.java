package collections;
// LinkedList
import java.util.*;

public class TestJavaCollections2 {


    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("jason");
        al.add("Adam");
        al.add("Victor");
        al.add("Xose");
        al.add("Juan");
        al.add("Rodrigo");
        al.add("Ricardo");
        al.add("Ricardo");
        al.add("Alex");
        al.add("John");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}