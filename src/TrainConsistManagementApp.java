import java.util.Arrays;

public class TrainConsistManagementApp {

    // Bubble Sort Algorithm Implementation
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            // Traverse array from 0 to n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap elements
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    public static void testSort_BasicSorting() {
        System.out.println("[Test 1: testSort_BasicSorting]");
        int[] capacities = {72, 56, 24, 70, 60};
        System.out.println("Original: " + Arrays.toString(capacities));
        bubbleSort(capacities);
        System.out.println("Sorted:   " + Arrays.toString(capacities) + "\n");
    }

    public static void testSort_AlreadySortedArray() {
        System.out.println("[Test 2: testSort_AlreadySortedArray]");
        int[] capacities = {24, 56, 60, 70, 72};
        System.out.println("Original: " + Arrays.toString(capacities));
        bubbleSort(capacities);
        System.out.println("Sorted:   " + Arrays.toString(capacities) + "\n");
    }

    public static void testSort_DuplicateValues() {
        System.out.println("[Test 3: testSort_DuplicateValues]");
        int[] capacities = {72, 56, 56, 24};
        System.out.println("Original: " + Arrays.toString(capacities));
        bubbleSort(capacities);
        System.out.println("Sorted:   " + Arrays.toString(capacities) + "\n");
    }

    public static void testSort_SingleElementArray() {
        System.out.println("[Test 4: testSort_SingleElementArray]");
        int[] capacities = {50};
        System.out.println("Original: " + Arrays.toString(capacities));
        bubbleSort(capacities);
        System.out.println("Sorted:   " + Arrays.toString(capacities) + "\n");
    }

    public static void testSort_AllEqualValues() {
        System.out.println("[Test 5: testSort_AllEqualValues]");
        int[] capacities = {40, 40, 40};
        System.out.println("Original: " + Arrays.toString(capacities));
        bubbleSort(capacities);
        System.out.println("Sorted:   " + Arrays.toString(capacities) + "\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC16: Sort Passenger Bogies by Capacity (Bubble Sort) ---\n");

        testSort_BasicSorting();
        testSort_AlreadySortedArray();
        testSort_DuplicateValues();
        testSort_SingleElementArray();
        testSort_AllEqualValues();
    }
}