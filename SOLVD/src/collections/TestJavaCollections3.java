package collections;

import java.util.Iterator;

import java.util.Vector;

public class TestJavaCollections3 {
    public static void main(String args[])
    {
        Vector<String> v=new Vector<String>();
        v.add("jason");
        v.add("Adam");
        v.add("Victor");
        v.add("Xose");
        v.add("Juan");
        v.add("Rodrigo");
        v.add("Ricardo");
        v.add("Ricardo");
        v.add("Alex");
        v.add("John");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
