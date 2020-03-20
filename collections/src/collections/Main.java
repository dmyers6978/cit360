package collections;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String arr[] = new String[3];
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();
        TreeSet<String> t = new TreeSet<String>();        // Creating a list
        List<String> l = new ArrayList<String>();
        for (int i = 0; i <= 2; i++) {
                    System.out.println("Enter something: ");
                    Scanner inputStr = new Scanner(System.in);
                    String input = inputStr.next();
                    // Creating instances of array, vector and hashtable
                    v.addElement(i);
                    h.put(i, input);
                    arr[i] = input;
                    t.add(input);
                    l.add(i, input);
        }


        System.out.println("Tree: ");
        System.out.println(t);
        for (int i = 0; i <= 2; i++) {
            System.out.format("index %1d", i);
            System.out.println(":");
            System.out.println("Array: ");
            System.out.println(arr[i]);
            System.out.println("Vector: ");
            System.out.println(v.elementAt(i));
            System.out.println("Hashtable: ");
            System.out.println(h.get(i));
            System.out.println("List: ");
            System.out.println(l.get(i));
            System.out.println("\n");
        }
                // Array elements are accessed using [], vector elements
                // using elementAt() and hashtable elements using get()
            }
        }
