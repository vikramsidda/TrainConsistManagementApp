import java.util.Arrays;

public class TrainConsistManagementApp {

    // Custom Binary Search Implementation for Strings
    public static int binarySearch(String[] sortedIds, String key) {
        int low = 0;
        int high = sortedIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = key.compareTo(sortedIds[mid]);

            if (comparison == 0) {
                return mid; // Key found
            } else if (comparison > 0) {
                // Key is greater (alphabetically after), ignore left half
                low = mid + 1;
            } else {
                // Key is smaller (alphabetically before), ignore right half
                high = mid - 1;
            }
        }
        return -1; // Key not found
    }

    public static void testSearch_KeyFoundInMiddle() {
        System.out.println("[Test 1: testSearch_KeyFoundInMiddle]");
        String[] ids = {"B101", "B102", "B103", "B104", "B105"};
        String key = "B103";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key);
        int index = binarySearch(ids, key);
        System.out.println("Result: Found at index " + index + "\n");
    }

    public static void testSearch_KeyNotFound() {
        System.out.println("[Test 2: testSearch_KeyNotFound]");
        String[] ids = {"B101", "B102", "B103", "B104", "B105"};
        String key = "B999";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key);
        int index = binarySearch(ids, key);
        System.out.println("Result: " + (index != -1 ? "Found at index " + index : "Not found") + " (-1)\n");
    }

    public static void testSearch_KeyFoundAtBoundaries() {
        System.out.println("[Test 3: testSearch_KeyFoundAtBoundaries]");
        String[] ids = {"B101", "B102", "B103", "B104", "B105"};
        String keyStart = "B101";
        String keyEnd = "B105";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + keyStart + " -> Result: Found at index " + binarySearch(ids, keyStart));
        System.out.println("Searching for: " + keyEnd + " -> Result: Found at index " + binarySearch(ids, keyEnd) + "\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC19: Binary Search for Bogie ID ---\n");

        testSearch_KeyFoundInMiddle();
        testSearch_KeyNotFound();
        testSearch_KeyFoundAtBoundaries();
    }
}