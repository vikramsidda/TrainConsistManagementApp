import java.util.Arrays;

public class TrainConsistManagementApp {

    // Optimized Binary Search Implementation for Strings
    public static boolean binarySearch(String[] array, String key) {
        // Unsorted input handling: ensure the array is sorted before searching
        String[] sortedArray = array.clone();
        Arrays.sort(sortedArray);

        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = key.compareTo(sortedArray[mid]);

            if (comparison == 0) {
                return true; // Match found
            } else if (comparison > 0) {
                low = mid + 1; // Key is greater, search right half
            } else {
                high = mid - 1; // Key is smaller, search left half
            }
        }
        return false; // Not found
    }

    public static void testBinarySearch_BogieFound() {
        System.out.println("[Test 1: testBinarySearch_BogieFound]");
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG309";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + binarySearch(ids, key) + "\n");
    }

    public static void testBinarySearch_BogieNotFound() {
        System.out.println("[Test 2: testBinarySearch_BogieNotFound]");
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG999";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + binarySearch(ids, key) + "\n");
    }

    public static void testBinarySearch_FirstElementMatch() {
        System.out.println("[Test 3: testBinarySearch_FirstElementMatch]");
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG101";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + binarySearch(ids, key) + "\n");
    }

    public static void testBinarySearch_LastElementMatch() {
        System.out.println("[Test 4: testBinarySearch_LastElementMatch]");
        String[] ids = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String key = "BG550";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + binarySearch(ids, key) + "\n");
    }

    public static void testBinarySearch_SingleElementArray() {
        System.out.println("[Test 5: testBinarySearch_SingleElementArray]");
        String[] ids = {"BG101"};
        String key = "BG101";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + binarySearch(ids, key) + "\n");
    }

    public static void testBinarySearch_EmptyArray() {
        System.out.println("[Test 6: testBinarySearch_EmptyArray]");
        String[] ids = {};
        String key = "BG101";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + binarySearch(ids, key) + "\n");
    }

    public static void testBinarySearch_UnsortedInputHandled() {
        System.out.println("[Test 7: testBinarySearch_UnsortedInputHandled]");
        String[] ids = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String key = "BG205";
        System.out.println("Original Unsorted Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + binarySearch(ids, key) + "\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC19: Binary Search for Bogie ID (Optimized Searching) ---\n");

        testBinarySearch_BogieFound();
        testBinarySearch_BogieNotFound();
        testBinarySearch_FirstElementMatch();
        testBinarySearch_LastElementMatch();
        testBinarySearch_SingleElementArray();
        testBinarySearch_EmptyArray();
        testBinarySearch_UnsortedInputHandled();
    }
}