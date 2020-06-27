package homeWork7;

import java.util.LinkedList;
import java.util.Queue;

public class QueueHW {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Sadia");
        q.add("Dihan");
        q.add("Mahin");

        for (String newq:q){
            System.out.println(newq);
        }

    }
}
