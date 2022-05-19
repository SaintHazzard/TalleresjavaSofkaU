package T4;

import java.util.*;

public class arraylist {
    public static void main(String args[]) {
        List<String> testList = new ArrayList<String>();
        testList.add("1");
        testList.add("2");
        testList.add("3");
        testList.add("4");
        testList.add("5");

        //Print the original list
        System.out.println("Initial ArrayList:\n"
                + testList);
        //Add elements without running into any error
        testList.add("6");
        testList.add("7");

        //Print the list after adding elements
        System.out.println("Modified ArrayList:\n"
                + testList);

    }
}
