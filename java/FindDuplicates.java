import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {
        List<Integer> unique = new ArrayList<Integer>();
        List<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            if (duplicates.contains(l.get(i))){ // check to see if its already been noted as a duplicate
                continue;
            }
            else if (unique.contains(l.get(i))) { // if it already contains that number ie its not unique and its not already been
                                                  // accounted for as a duplicate then we need to add it
                duplicates.add(l.get(i));
            }
       unique.add(l.get(i));
    }
    return duplicates; //return the numbers that appeared more than once 
    }
    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
    }

}