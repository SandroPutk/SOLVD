package collections;
//ArrayList
import java.util.*;
class TestJavaCollection1{
    public static void main(String args[]){



        ArrayList<String> list=new ArrayList<String>();//Creating arraylist


        list.add("jason");//Adding object in arraylist
        list.add("Adam");
        list.add("Victor");
        list.add("Xose");
        list.add("Juan");
        list.add("Rodrigo");
        list.add("Ricardo");
        list.add("Ricardo");
        list.add("Alex");
        list.add("John");


//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}