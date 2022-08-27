package collections;
import java.util.*;
public class TestJavaCollections4{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("jason");
        stack.push("Adam");
        stack.push("Victor");
        stack.push("Jose");
        stack.push("Ricardo");
        stack.push("Ricardo");
        stack.push("Alex");
        stack.push("John");




        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}