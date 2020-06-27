package homeWork7;

import java.util.List;
import java.util.Scanner;

public class ArrayListHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your limit: ");
        int limit = input.nextInt();
        System.out.println("Please enter your numbers: ");
        List<Integer> list = new java.util.ArrayList<Integer>();
        for (int i = 0; i <limit ; i++) {
            list.add(input.nextInt());
        }
        for (int j = 0; j <list.size() ; j++) {
            System.out.println(list.get(j));
        }
    }
}
