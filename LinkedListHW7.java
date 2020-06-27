package homeWork7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListHW7 {
    public static void main(String[] args) {
        List<String> newList = new LinkedList<String>();
        newList.add("Peoples republic of Bangladesh");
        newList.add("National anthem is 'Amar Sonar Bangla'");
        newList.add("Independed on 16 December 1971");


        Iterator newIt = newList.listIterator();
        while(newIt.hasNext()){
            System.out.println(newIt.next());
        }

    }
}
