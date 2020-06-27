package homeWork7;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapHW {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(101, "Mahin");
        map.put(102, "Sadia");
        map.put(103, "Dihan");
        map.put(104, "Nubaid");

        for (Map.Entry<Integer, String> value:map.entrySet()) {
            System.out.println("ID "+value.getKey()+" "+"Name "+value.getValue());

        }
    }
}
