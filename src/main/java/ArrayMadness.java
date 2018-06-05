import java.util.*;
public class ArrayMadness {
    public static void main(String args[]) {

        odd_elem();
        change_place_elem();
        average();
        mass(1, 0, 1);
        newList();
        repeatElements();
    }
    // Task 1: first ten odd elements
    private static void odd_elem() {
        int[] arr_numb = new int[20];
        for (int i = 0; i < 20; i++) {
            arr_numb[i] = i;
        }
        System.out.println("TASK #1 FIRST TEN ODD ELEMENTS \n");
        System.out.println("Array:\n" + Arrays.toString(arr_numb));
        System.out.println("Odd elements:");
        for (int i = 0; i < 20; i++) {
            if (((i + 1) % 2) == 0) {
                System.out.format("%d,", arr_numb[i], "\n");
            }
        }
    }

    // Task 2: Change place for min and max elements in array
    public static void change_place_elem() {
        int[] arr_numb = new int[]{2, 3, -9, -17, 0, 5, 4};
        int nMin = 0, nMax = 0;

        int max = arr_numb[0];
        int min = arr_numb[0];

        System.out.println("\n\n\nTASK #2 CHANGE MIN AND MAX VALUE: \n");
        System.out.println("Elements:\n" + Arrays.toString(arr_numb));

        for (int i = 0; i < arr_numb.length; i++) {
            if (arr_numb[i] < min) {
                min = arr_numb[i];
                nMin = i;
            }

            if (arr_numb[i] > max) {
                max = arr_numb[i];
                nMax = i;
            }

        }
        int change = arr_numb[nMax];
        arr_numb[nMax] = arr_numb[nMin];
        arr_numb[nMin] = change;

        System.out.println("Min and Max values have been changed:\n" + Arrays.toString(arr_numb));
    }

    // Task 3: Average of random elemens in array

    public static void average() {
        double[] arr_numb = new double[7];
        double result_av = 0;
        System.out.println("\n\nTASK #3 FIND AVERAGE VALUES: \n");
        System.out.println("Random array elements for finding average value:");
        for (int i = 0; i < arr_numb.length; i++) {
            arr_numb[i] = ((double) (Math.random()));
            System.out.format("%4.1f,", arr_numb[i], "\n");
        }

        for (int i = 0; i < arr_numb.length; i++) {
            result_av = result_av + arr_numb[i];
        }

        result_av = result_av / arr_numb.length;
        System.out.print("\nAverage value:");
        System.out.format("%4.1f", result_av, "\n");
    }

    // Task 4

    public static void mass(int m, int n, int p) {
        int[] arr_numb = new int[13];
      /* int m = 1;
       int p = 1;
       int n = 0;*/
        System.out.println("\n\nTASK #4: \n");

        for (int i = 0; i < arr_numb.length; i++) {
            arr_numb[i] = ((int) (Math.random() * 3) - 1);
        }
        System.out.println("Elements [-1;1]:\n" + Arrays.toString(arr_numb));
        for (int i = 0; i < arr_numb.length; i++) {
            for (int j = 0; j < arr_numb.length; j++) {
                if (arr_numb[i] > arr_numb[j]) {
                    n++;
                }
                if (n > m) {
                    m = n;
                    p = 1;
                }
            }
        }
        System.out.println("The most repeat element: " + arr_numb[p]);
    }


    // Task 5: Find the shortes string

    public static void newList() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputRows = new ArrayList<>();
        System.out.println("\n\nTASK #5: \n");
        System.out.println("Enter 5 rows: \n");
        for (int i = 0; i < 5; i++) {
            inputRows.add(scanner.nextLine());
        }

        System.out.println("\nThe shortes string(s):");
        Collections.sort(inputRows, Comparator.comparingInt(String::length));

        int minRow = inputRows.get(0).length();

        for (String row : inputRows)
            if (minRow == row.length())
                System.out.println(row);
            else
                break;
    }
    // Task #6
    public static void repeatElements() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputRows = new ArrayList<String>();
        System.out.println("\n\nTASK #6: \n");
        System.out.println("Enter: \n");

        inputRows.add(scanner.nextLine());
        System.out.println(inputRows);

        HashSet hash = new HashSet();
        hash.addAll(inputRows);
        inputRows.clear();
        inputRows.addAll(hash);
        System.out.println(inputRows);
    }




}
