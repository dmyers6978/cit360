package collections;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        String arr[] = new String[3];
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();
                for (int i = 0; i <= 2; i++) {
                    System.out.println("Enter something: ");
                    Scanner inputStr = new Scanner(System.in);
                    String input = inputStr.next();
                    // Creating instances of array, vector and hashtable
                    v.addElement(i);
                    h.put(i, input);
                    arr[i] = input;
                }

                // Array instance creation requires [], while Vector
                // and hastable require ()
                // Vector element insertion requires addElement(), but
                // hashtable element insertion requires put()

                // Accessing first element of array, vector and hashtable
        for (int i = 0; i <= 2; i++) {
            System.out.format("index %1d", i);
            System.out.println(":");
            System.out.println("Array: ");
            System.out.println(arr[i]);
            System.out.println("Vector: ");
            System.out.println(v.elementAt(i));
            System.out.println("Hashtable: ");
            System.out.println(h.get(i));
            System.out.println("\n");
        }
                // Array elements are accessed using [], vector elements
                // using elementAt() and hashtable elements using get()
            }
        }
