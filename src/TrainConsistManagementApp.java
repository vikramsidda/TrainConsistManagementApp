import java.util.Arrays;

public class TrainConsistManagementApp {

    // Optimized Binary Search Implementation for Strings with Defensive Programming
    public static boolean searchBogie(String[] array, String key) {
        // Defensive Programming / Fast-Fail state validation
        if (array == null || array.length == 0) {
            throw new IllegalStateException("Search operation failed: Bogie collection is empty.");
        }

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

    public static void testSearch_ThrowsExceptionWhenEmpty() {
        System.out.println("[Test 1: testSearch_ThrowsExceptionWhenEmpty]");
        String[] ids = {};
        String key = "BG101";
        System.out.println("Array: " + Arrays.toString(ids));
        try {
            System.out.println("Searching for: " + key);
            searchBogie(ids, key);
        } catch (IllegalStateException e) {
            System.out.println("Exception Caught: " + e.getMessage() + "\n");
        }
    }

    public static void testSearch_AllowsSearchWhenDataExists() {
        System.out.println("[Test 2: testSearch_AllowsSearchWhenDataExists]");
        String[] ids = {"BG101", "BG205"};
        String key = "BG101";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + searchBogie(ids, key) + "\n");
    }

    public static void testSearch_BogieFoundAfterValidation() {
        System.out.println("[Test 3: testSearch_BogieFoundAfterValidation]");
        String[] ids = {"BG101", "BG205", "BG309"};
        String key = "BG205";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + searchBogie(ids, key) + "\n");
    }

    public static void testSearch_BogieNotFoundAfterValidation() {
        System.out.println("[Test 4: testSearch_BogieNotFoundAfterValidation]");
        String[] ids = {"BG101", "BG205", "BG309"};
        String key = "BG999";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + searchBogie(ids, key) + "\n");
    }

    public static void testSearch_SingleElementValidCase() {
        System.out.println("[Test 5: testSearch_SingleElementValidCase]");
        String[] ids = {"BG101"};
        String key = "BG101";
        System.out.println("Array: " + Arrays.toString(ids));
        System.out.println("Searching for: " + key + " -> Result: " + searchBogie(ids, key) + "\n");
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC20: Exception Handling During Search Operations ---\n");

        testSearch_ThrowsExceptionWhenEmpty();
        testSearch_AllowsSearchWhenDataExists();
        testSearch_BogieFoundAfterValidation();
        testSearch_BogieNotFoundAfterValidation();
        testSearch_SingleElementValidCase();
    }
}